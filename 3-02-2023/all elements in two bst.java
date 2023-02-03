class Solution {
    List<Integer>list=new ArrayList<Integer>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        inord(root1);
        inord(root2);
        Collections.sort(list);
        return list;
    }
    public List<Integer> inord(TreeNode root){
        if(root!=null){
            inord(root.left);
            list.add(root.val);
            inord(root.right);
            return list;
        }
        return list;
    }
}
