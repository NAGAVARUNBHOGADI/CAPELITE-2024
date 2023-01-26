class Solution {
    int max=Integer.MIN_VALUE;;
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,sum(root.left));
        int right=Math.max(0,sum(root.right));
        int k=left+right+root.val;
        if(max<k){
            max=k;
        }
        return Math.max(left,right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        sum(root);
        return max;
    }
}
