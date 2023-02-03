/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s="";
        if(root==null){
            return s;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        s+=root.val;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    s+=","+curr.left.val;
                    q.add(curr.left);
                }
                else{
                    s+=",#";
                }
                if(curr.right!=null){
                    s+=","+curr.right.val;
                    q.add(curr.right);
                }
                else{
                    s+=",#";
                }
            }
        }
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // System.out.println(data);
        // return null;
        if(data.length()==0){
            return null;
        }
        String[] result = data.split(",");
        ArrayList<String>str=new ArrayList<String>();
        Collections.addAll(str,result);
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(str.get(0)));
        str.remove(0);
        q.add(root);
        while(q.size()>=1){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                String lef=str.get(0);
                str.remove(0);
                String right=str.get(0);
                str.remove(0);
                if(lef.equals("#")){
                    curr.left=null;
                }
                else{
                    curr.left=new TreeNode(Integer.parseInt(lef));
                    q.add(curr.left);
                }
                if(right.equals("#")){
                    curr.right=null;
                }
                else{
                    curr.right=new TreeNode(Integer.parseInt(right));
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
