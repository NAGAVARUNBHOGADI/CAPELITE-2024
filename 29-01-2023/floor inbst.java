    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
         int floor=-1;
         while(root!=null){
             if(root.data==X){
                 floor=root.data;
                 return floor;
             }
             else if(root.data<X){
                 floor=root.data;
                 root=root.right;
             }
             else if(root.data>=X){
                 root=root.left;
             }
         }
         return floor;
    }
}
