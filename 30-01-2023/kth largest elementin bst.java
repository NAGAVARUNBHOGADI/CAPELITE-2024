class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer>list=new ArrayList<>();
        inorderTraversal(root,list);
            return list.get(list.size()-K);
    }
    ArrayList<Integer>ll=new ArrayList<Integer>();
    public void inorderTraversal(Node root,ArrayList<Integer>list) {
        if(root != null){
            inorderTraversal(root.left,list);
            list.add(root.data);
            inorderTraversal(root.right,list);
        } 
    }
    
}
