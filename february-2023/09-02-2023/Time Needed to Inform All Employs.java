class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<manager.length;i++){
            if(manager[i]!=-1){
                adj.get(manager[i]).add(i);
            }
        }
        return maxPath(headID,adj,informTime);
    }
   public int maxPath(int idx,List<List<Integer>> adj,int[] informTime){
       int sum=informTime[idx];
       int max=0;
       for(int subordinate:adj.get(idx)){
           max=Math.max(max,maxPath(subordinate,adj,informTime));
       }
       return informTime[idx]+max;
    }
}
