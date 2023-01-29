class Solution {
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root);
        return ll.get(k-1);

    }
    List<Integer>ll=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            inorderTraversal(root.left);
            ll.add(root.val);
            inorderTraversal(root.right);
        } 
        return ll; 
    }
}
