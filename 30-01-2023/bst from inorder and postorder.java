class Solution {
 public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i<inorder.length ; i++){
            map.put(inorder[i] , i);
        }
        
        return create(inorder , postorder,0 , postorder.length - 1 , 0 , inorder.length-1 ,map);
    }
    public TreeNode create(int[] inorder , int[] postorder , int poststart , int postend , int instart , int inend , HashMap<Integer , Integer> map ){
        if(instart > inend || poststart > postend){
            return null;
        }
        int pos = map.get(postorder[postend]);
        TreeNode root = new TreeNode(postorder[postend]);
        root.left = create(inorder , postorder,poststart ,poststart+pos-instart-1,instart , pos-1 , map);
        root.right = create(inorder , postorder,poststart +pos-instart ,postend-1 , pos+1 , inend, map);
        return root;
    }
}
