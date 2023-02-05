class Solution {
    int lsum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return lsum;
        
    }
    public void helper(TreeNode root) {
        if(root == null) {
            return ;
        }
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                lsum += root.left.val ;
            }
            else {
                helper(root.left);
            }
        }
        if(root.right != null) {
            helper(root.right);
        }
    }
}
