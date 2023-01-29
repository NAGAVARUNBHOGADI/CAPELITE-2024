class Solution {
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        mins(root);
        return min;
    }
    TreeNode ll;
    public int mins(TreeNode root){
      if(root == null) return 0;
        mins(root.left);
        if(ll != null) {
        min = Math.min(min, root.val-ll.val);
        }
        ll= root;
        mins(root.right);
        return min;
    }
}
