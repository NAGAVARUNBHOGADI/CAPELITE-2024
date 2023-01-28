class Solution {
    public boolean isValidBST(TreeNode root) {
        lst.clear();
        inorderTraversal(root);
        for(int i=1;i<lst.size();i++){
            if(lst.get(i)<=lst.get(i-1)){
                return false;
            }
        }
        return true;
    }
    List<Integer> lst = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return lst;
        }
        inorderTraversal(root.left);
        lst.add(root.val);
        inorderTraversal(root.right);
        return lst;
    }
}
