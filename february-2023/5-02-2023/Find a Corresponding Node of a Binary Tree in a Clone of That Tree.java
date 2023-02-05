class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inorder(cloned,target);
        return ans;
    }
    TreeNode ans;
    public void inorder(TreeNode root,TreeNode target) {
        if (root != null) {
            inorder(root.left, target);
            if (root.val == target.val) {
                ans = root;
            }
            inorder(root.right, target);
            }
            }
    }
