class Solution {
    int min=Integer.MAX_VALUE;
    List<Integer>list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return 0;
        }
        inord(root);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-1;j++){
                 if(list.get(i)!=list.get(j)){
                int n=Math.abs(list.get(i)-list.get(j));
                    if(min>n){
                        min=n;
                }
            }
            }
        }
        return min;
    }
    public List<Integer> inord(TreeNode root){
        if(root==null){
            return list;
        }
        inord(root.left);
        list.add(root.val);
        inord(root.right);
        return list;
    }
}
