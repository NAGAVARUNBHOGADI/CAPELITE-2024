class BSTIterator {
    Stack<TreeNode>s=new Stack<>();
    public BSTIterator(TreeNode root) {
        push(root);
    }
    
    public int next() {
        TreeNode temp = s.pop();
        push(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
         return !s.isEmpty();
    }
    public void push(TreeNode root){
        while(root!=null){
            s.push(root);
            root=root.left;
        }
    }
}
