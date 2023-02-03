class Solution {
    public TreeNode convertBST(TreeNode root) {
        revinord(root);
        return root;
    }
    int sum=0;
    void revinord(TreeNode root){
        if(root==null){
            return;
        }
        revinord(root.right);
        root.val+=sum;
        sum=root.val;
        revinord(root.left);
        return;
    }
}
