class Solution {
    public Node connect(Node root) {
        Node v=root;
        while(v!=null && v.left!=null){
            Node n=v;
            while(true){
                n.left.next=n.right;
                if(n.next==null)
                break;
                n.right.next=n.next.left;
                n=n.next;
            }
            v=v.left;
        }
        return root;
    }
}
