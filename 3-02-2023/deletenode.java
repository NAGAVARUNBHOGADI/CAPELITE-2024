/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        
        
        // IF ROOT TO BE DELETED
        if(root.val == key){
            //Single node
            if(root.left == null && root.right == null)
                return null;
            if(root.left == null){
                root = root.right;
                return root;
            }
            if(root.right == null){
                root = root.left;
                return root;
            }
        }
        //SEARCH
        TreeNode temp = root;
        TreeNode parent = null;
        while(temp.val != key){
            parent = temp;
            if(key < temp.val)
                temp = temp.left;
            else
                temp = temp.right;
            if(temp == null)
                return root;
        }
        System.out.println(temp.val);
        //NODE HAS TWO CHILD
        if(temp.left != null && temp.right != null){
            TreeNode s = temp.right;
            parent = temp;

            while(s.left != null){
                parent = s;
                s = s.left;
            }
            System.out.println(parent.val+" "+s.val);
            if(parent.val < s.val){
                System.out.println("hi");
                temp.val = s.val;
                if(s.right != null){
                    parent.right = s.right;
                }
                else
                    parent.right = null;
            }
            else{
                temp.val = s.val;
                if(s.right != null)
                    parent.left = s.right;
                else
                    parent.left = null;
            }
            return root;
        }

    System.out.println("hi");


        //NODE HAS NO CHILD
        if(temp.left == null && temp.right == null){
            if(parent.val < temp.val){
                parent.right = null;
            }
            else
                parent.left = null;
            return root;
        }
        //NODE HAS ONE CHILD
        if(temp.left != null || temp.right != null){
            if(temp.val < parent.val){
                if(temp.right != null)
                    parent.left = temp.right;
                else
                    parent.left = temp.left;
            }
            else{
                if(temp.right != null)
                    parent.right = temp.right;
                else
                    parent.right = temp.left;
            }
        }
        return root;
    }
}
