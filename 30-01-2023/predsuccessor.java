class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       p.pre=predecessor(root,key);
       s.succ=successor(root,key);
    }
    public static Node predecessor(Node root,int key){
        Node pred=null;
        if(root==null){
            return null;
        }
        while(root!=null){
            if(root.data>=key){
                root=root.left;
            }
            else{
                pred=root;
                root=root.right;
            }
        }
        return pred;
    }
        public static Node successor(Node root,int key){
            Node succ=null;
            if(root==null){
                return null;
            }
            while(root!=null){
                if(root.data>key){
                    succ=root;
                    root=root.left;
                }
                else{
                    root=root.right;
                }
            }
            return succ;
    }
}
