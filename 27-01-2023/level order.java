class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>r=new ArrayList<>();
        q.add(root);
        r.add(root.val);
        result.add(r);
        while(!q.isEmpty()){
            List<Integer>ll=new ArrayList<Integer>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    ll.add(curr.left.val);
                    q.add(curr.left);
                    // result.add(ll);
                }
                if(curr.right!=null){
                    ll.add(curr.right.val);
                    q.add(curr.right);
                    // result.add(ll);
                }
                
            }
            if(ll.size()==0){break;}
             result.add(ll);
        }
        return result;
    }
}
