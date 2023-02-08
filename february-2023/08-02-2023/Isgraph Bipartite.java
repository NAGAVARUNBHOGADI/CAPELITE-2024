class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==0){
                q.add(i);
                color[i]=1;
                while(!q.isEmpty()){
                    int curr=q.poll();
                    for(int n:graph[curr]){
                        if(color[n]==color[curr])return false;
                        if(color[n]==0){
                            q.add(n);
                            color[n]=-color[curr];
                        }
                    }
                }
            }
        }
        return true;
    }
}
