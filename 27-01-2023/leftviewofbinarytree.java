import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        //    Write your code here.
         if(root==null){
            return list;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=1;i<=s;i++){
                TreeNode<Integer> curr=q.poll();
                if(i==1)
                    list.add(curr.data);
                    if(curr.left!=null)
                        q.add(curr.left);
                    if(curr.right!=null)
                        q.add(curr.right);
            }
        }
        return list;

    }
}
