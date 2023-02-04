class Solution {
    List<Integer>list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inord(root);
        if(root==null){
            return null;
        }
        return help(list,0,list.size()-1);
    }
    public TreeNode help(List<Integer> ll,int l,int h){
        if(l>h){
            return null;
        }
        int mid=(l+h)/2;
        TreeNode r=new TreeNode(list.get(mid));
        r.left=help(list,l,mid-1);
        r.right=help(list,mid+1,h);
        return r;
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
