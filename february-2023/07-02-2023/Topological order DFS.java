class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
       boolean visited[]=new boolean[V];
       int arr[]=new int[V];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                dfs(adj,visited,i,s);
            }
        }
        int i=0;
         while(!s.isEmpty()){
             arr[i]=s.pop();
             i++;
         }
         return arr;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int n,Stack<Integer> s){
        visited[n]=true;
        for(int v:adj.get(n)){
            if(visited[v]==false)
                dfs(adj,visited,v,s);
        }
        s.push(n);
}
}
