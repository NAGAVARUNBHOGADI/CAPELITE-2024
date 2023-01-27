public class Solution {
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        // Write your code here.
		if(root==null){
			return null;
		}
		if(root.data==node1 || root.data==node2 || root.data==node3){
			return root;
		}
		BinaryTreeNode<Integer> l=lcaOfThreeNodes(root.left,node1,node2,node3);
		BinaryTreeNode<Integer> r=lcaOfThreeNodes(root.right,node1,node2,node3);
		if(l!=null && r!=null){
			return root;
		}
		if(l!=null){
			return l;
		}
		if(r!=null){
			return r;
		}
		return null;
    }
}
