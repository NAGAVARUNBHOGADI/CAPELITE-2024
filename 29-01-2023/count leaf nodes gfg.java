class Tree
{
    int l=0;
    int countLeaves(Node node) 
    {
         // Your code 
         if(node==null){
             return 0;
         }
         if(node.left==null && node.right==null){
             l++;
         }
         int left=countLeaves(node.left);
         int right=countLeaves(node.right);
         return l;
    }
}
