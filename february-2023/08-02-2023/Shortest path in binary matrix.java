class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){ 
            return -1;
        }
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        grid[0][0] =1;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                int[] curr = q.poll();    
                if(curr[0] ==  m-1 && curr[1] == n-1)
                return curr[2];                
                for(int[] d : dir) {
                    int row = curr[0] + d[0];
                    int col = curr[1] + d[1];                
                    if(row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == 0){
                        q.add(new int[]{row, col, curr[2]+1});
                        grid[row][col] = 1;
                    }
                }
            }
        }    
        return -1;
    }
}
