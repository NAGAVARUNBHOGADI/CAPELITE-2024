class Solution {
    // Function to return Breadth First Traversal of given graph.\
    // boolean visited[];
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>val=new ArrayList<>();
        boolean visited[]=new boolean[V];
        // t=adj;
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        val.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                int n=q.poll();
                for(int source:adj.get(n)){
                    if(!visited[source]){
                        visited[source]=true;
                        val.add(source);
                        q.add(source);
                    }
                }
            }
        }
        return val;
    }
}
