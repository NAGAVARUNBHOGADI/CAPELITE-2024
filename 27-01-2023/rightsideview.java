class Solution {
    List<Integer> res=new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return res;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        // res.add(root.val);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=1;i<=s;i++){
                TreeNode curr=q.poll();
                if(i==s)
                    res.add(curr.val);
                    if(curr.left!=null)
                        // res.add(curr.left.val);
                        q.add(curr.left);
                    if(curr.right!=null)
                        // res.add(curr.right.val);
                        q.add(curr.right);
                }
            }
        
        return res;
    }
}
