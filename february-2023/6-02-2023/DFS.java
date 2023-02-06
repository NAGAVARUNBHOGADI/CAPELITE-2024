class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    boolean visited[];
    ArrayList<Integer>val=new ArrayList<>();
    ArrayList<ArrayList<Integer>>t=new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        visited=new boolean[V];
        t=adj;
        dfs(0);
        return val;
        
    }
    public void dfs(int source){
        val.add(source);
        visited[source]=true;
        for(int neighbor:t.get(source)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
        
    }
}
