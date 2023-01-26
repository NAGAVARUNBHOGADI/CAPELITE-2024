class Solution {
    int preodindex;
    Map<Integer,Integer>inorderIndmap=new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preodindex=0; 
        for(int i=0;i<inorder.length;i++){
            inorderIndmap.put(inorder[i],i);
        }
        return atotree(preorder, 0, preorder.length - 1);
    }
        private TreeNode atotree(int[] preorder,int left,int right){
            if(left>right){
                return null;
            }
            int rootval=preorder[preodindex++];
            TreeNode root=new TreeNode(rootval);
            root.left = atotree(preorder, left, inorderIndmap.get(rootval) - 1);
            root.right = atotree(preorder, inorderIndmap.get(rootval) + 1, right);
            return root;
        }
    }
