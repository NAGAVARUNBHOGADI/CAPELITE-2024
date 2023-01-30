class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper=Integer.MAX_VALUE;
        return ct(preorder,upper,new int[]{0});
    }
    public TreeNode ct(int [] pre,int upper, int[] curr){
        if(curr[0]==pre.length){
            return null;
        }
        if(pre[curr[0]]>upper){
            return null;
        }
        TreeNode node=new TreeNode(pre[curr[0]++]);
        node.left=ct(pre,node.val,curr);
        node.right=ct(pre,upper,curr);
        return node;
    }
}
