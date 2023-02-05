public class Solution 
{
    public static int countNodes(TreeNode<Integer> root)  
    {
        //    Write your code here.
        if(root==null){
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return 1+left+right;
    }
}
