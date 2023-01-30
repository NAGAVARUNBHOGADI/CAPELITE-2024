class Solution {
    List<Integer>list=new ArrayList<Integer>();
    public boolean findTarget(TreeNode root, int k) {
       inord(root);
       int l=0;
       int h=list.size()-1;
       while(l<h){
           if(list.get(l)+list.get(h)==k){
               return true;
           }
           else if(k>list.get(l)+list.get(h)){
               l++;
           }
           else{
               h--;
           }
       }
       return false;
    }
    public void inord(TreeNode root){
        if(root!=null){
            inord(root.left);
            list.add(root.val);
            inord(root.right);
        }
    }
}
