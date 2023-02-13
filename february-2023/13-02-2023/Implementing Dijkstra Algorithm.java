class Solution

{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        Queue<pair> pq = new LinkedList<>();
        int ans[]=new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
        pq.add(new pair(0, S));
        ans[S]=0;
        while(!pq.isEmpty()){
            pair cur=pq.poll();
            for(ArrayList<Integer> i:adj.get(cur.node)){
                if(i.get(1)+cur.dis<ans[i.get(0)]){
                    ans[i.get(0)]=i.get(1)+cur.dis;
                    pq.add(new pair(i.get(1)+cur.dis, i.get(0)));
                }
            }
        }
        return ans;
    }
}
 class pair{
        int dis;
        int node;
        pair(int dis, int node){
            this.dis=dis;
            this.node=node;
        }
    }
