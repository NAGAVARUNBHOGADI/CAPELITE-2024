public class Solution {
	public static void mirrorTree(BinaryTreeNode node) {
		// Write your code here.
        if(node==null){
            return;
        }
        mirrorTree(node.left);
        mirrorTree(node.right);
        BinaryTreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
	}
}
