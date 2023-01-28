class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorderTraversal(root);
        if(root==null){
            return sum;
        }
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)>=low && lst.get(i)<=high){
                sum+=lst.get(i);
            }
        }
        return sum;
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
