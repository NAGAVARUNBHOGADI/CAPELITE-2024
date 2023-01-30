public class Solution {

    public static int findPrice(TreeNode root) {
        
        // Write your Code here
        if(root.left==null){
            return root.data;
        }
        int k=findPrice(root.left);
        return k;
    }   
}
//from coding studio
