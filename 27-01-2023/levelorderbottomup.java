class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new LinkedList<>();
        if(root==null) {
            return result;
        }
        Queue <TreeNode> q= new LinkedList<>();
        q.add(root);
        Stack <List<Integer>> sta= new Stack<>();
        while(!q.isEmpty()){
            int s= q.size();
            List<Integer> ll= new LinkedList<>();
            for (int i=1;i<=s;i++) {
                TreeNode curr= q.poll();
                if(curr.left!=null) {
                    q.add(curr.left);
                }
                if(curr.right!=null) {
                    q.add(curr.right);
                }
                ll.add(curr.val);
            }
            sta.push(ll);
        }
        while(!sta.isEmpty()){
             result.add(sta.pop());
        }
        return result;
    }
}
