class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[] arr,int left,int right){
        if(left>right){
            return null;
        }
        int m=(left+right)/2;
        TreeNode root=new TreeNode(arr[m]);
        root.left=helper(arr,left,m-1);
        root.right=helper(arr,m+1,right);
        return root;
    }
}
