class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return null;
        }
        if(root.val<low){
            // root=root.right;
            return trimBST(root.right,low,high);
        }
        if(root.val>high){
            // root=root.left;
            return trimBST(root.left,low,high);
        }
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}
