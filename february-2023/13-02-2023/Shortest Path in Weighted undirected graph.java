class Solution {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.first - y.first);
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        for(int i = 1; i <= n; i++){
            dist[i] = (int)1e9;
            parent[i] = i;
        }
        dist[1] = 0;
        pq.add(new Pair(0,1));
        while(!pq.isEmpty()){
            int node = pq.peek().second;
            int dis = pq.peek().first;
            pq.remove();
            for(Pair p : adj.get(node)){
                int adjNode = p.first;
                int wt = p.second;
                if(dis + wt < dist[adjNode]){
                    dist[adjNode] = dis + wt;
                    pq.add(new Pair(dist[adjNode], adjNode));
                    parent[adjNode] = node;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(dist[n] == 1e9){
            ans.add(-1);
            return ans;
        }
        int node = n;
        while(parent[node] != node){
            ans.add(node);
            node = parent[node];
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
class Pair{
    int first;
    int second;
    public Pair(int _first, int _second){
        this.first = _first;
        this.second= _second;
    }
}
