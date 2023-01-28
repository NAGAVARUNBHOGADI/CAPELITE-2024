class Solution {
    ArrayList<Integer>list=new ArrayList<Integer>();
    public int findBottomLeftValue(TreeNode root) {
        getLeftView(root);
        if(list.size()==0){
            return 0;
        }
        return list.get(list.size()-1);
    }
      public ArrayList<Integer> getLeftView(TreeNode root) 
    {
         if(root==null){
            return list;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=1;i<=s;i++){
                TreeNode curr=q.poll();
                if(i==1)
                    list.add(curr.val);
                    if(curr.left!=null)
                        q.add(curr.left);
                    if(curr.right!=null)
                        q.add(curr.right);
            }
        }
        return list;

    }
}
