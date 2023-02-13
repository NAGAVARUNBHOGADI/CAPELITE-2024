import java.util.*;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    // Write your code here.
      ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
      int indeg[]=new int[n+1];
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.size();i++){
            ArrayList<Integer> temp=edges.get(i);
            int a=temp.get(0);
            int b=temp.get(1);
            ArrayList<Integer> temp2=adj.get(a);
            temp2.add(b);
            indeg[b]++;
        }
      int c=0;
      Queue<Integer> q=new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            if(indeg[i]==0)
                q.add(i);
        }
        while(!q.isEmpty()){
            int node=q.poll();
            c++;
            for(Integer it: adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0)
                    q.add(it);
            }
        }
        if(c==n){
          return false;
        }
        return true;
    }
}
