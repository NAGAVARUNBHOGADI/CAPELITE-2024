class Solution {
    List<Double>result= new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode>q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
          int s=q.size();
          double sum=0.0;
          for (int i=0;i<s;i++) {
            TreeNode curr=q.poll();
            sum+= curr.val;
            if (curr.left != null){
                q.add(curr.left);
            }
            if (curr.right!=null){
                q.add(curr.right);
            }
          }
          result.add(sum/s);
        }
        return result;
    }
}
