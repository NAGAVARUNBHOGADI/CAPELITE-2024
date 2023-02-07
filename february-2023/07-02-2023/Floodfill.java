class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc=image[sr][sc];
        if(oc==color){
            return image;
        }
        dfs(image,sr,sc,oc,color,image.length,image[0].length);
            return image;
    }
    public void dfs(int[][] image,int sr,int sc,int oc,int color,int i,int j){
        if(sr<0 || sc<0 || sr==i || sc==j || image[sr][sc]!=oc){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,oc,color,i,j);
        dfs(image,sr-1,sc,oc,color,i,j);
        dfs(image,sr,sc+1,oc,color,i,j);
        dfs(image,sr,sc-1,oc,color,i,j);
        return;
    }
    
}
