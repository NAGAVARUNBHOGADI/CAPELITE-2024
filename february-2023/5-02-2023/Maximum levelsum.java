public class Solution {
	public static int maxLevelSum(BinaryTreeNode root) {
		// Write your code here.
		int max=Integer.MIN_VALUE;
		if(root==null){
			return 0;
		}
		Queue<BinaryTreeNode>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()){
			int sum=0;
			int s=q.size();
			for(int i=0;i<s;i++){
				BinaryTreeNode curr=q.poll();
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
					sum+=curr.val;
			}
			max=Math.max(sum,max);
		}
		return max;
	}
}
