class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        List<Integer>r=new ArrayList<>();
        
        q.add(root);
        r.add(root.val);
        result.add(r);
        int k=2;
        while(!q.isEmpty()){
            List<Integer>ll=new ArrayList<Integer>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    ll.add(curr.left.val);
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    ll.add(curr.right.val);
                    q.add(curr.right);
                }
                
            }
            if(ll.size()==0){break;}
            if(k%2==0){
            List<Integer>l=new ArrayList<Integer>();
            for(int j=ll.size()-1;j>=0;j--){
                l.add(ll.get(j));
            }
             result.add(l);
             k++;
            }
            else{
                result.add(ll);
                k++;
            }
        }
        return result;
    }
}
