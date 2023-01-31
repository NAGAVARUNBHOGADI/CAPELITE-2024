    public String serialize(TreeNode root) {
        String s="";
        if(root==null){
            return s;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        s+=root.val;
        while(!q.isEmpty()){
            int sze=q.size();
            for(int i=0;i<sze;i++){
                TreeNode curr=q.poll();
                if(curr.left==null){
                    s+=",#";
                }
                else{
                    s+=","+curr.left.val;
                    q.add(curr.left);
                }
                if(curr.right==null){
                    s+=",#";
                }
                else{
                    s+=","+curr.right.val;
                    q.add(curr.right);
                }
            }
        }
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0){
            return null;
        }
        String[] result = data.split(",");
        ArrayList<String>str=new ArrayList<String>();
        Collections.addAll(str,result);
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(str.get(0)));
        str.remove(0);
        q.add(root);
        while(q.size()>=1){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                String lef=str.get(0);
                str.remove(0);
                String right=str.get(0);
                str.remove(0);
                if(lef.equals("#")){
                    curr.left=null;
                }
                else{
                    curr.left=new TreeNode(Integer.parseInt(lef));
                    q.add(curr.left);
                }
                if(right.equals("#")){
                    curr.right=null;
                }
                else{
                    curr.right=new TreeNode(Integer.parseInt(right));
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}
