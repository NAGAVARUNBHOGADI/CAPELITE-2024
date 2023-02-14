import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
public class Solution {
   public static String cycleDetection(int[][] edges, int n, int m) {
        Map<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < n; i++)
            adjList.put(1 + i, new ArrayList<Integer>());
        getAdjList(adjList, edges, m);
        Map<Integer, Boolean> visited = new HashMap<>();
        for (int i = 0; i < n; i++)
            visited.put(i + 1, false);
        for (int i = 0; i < n; i++) {
            int node = i + 1;
            if (!visited.get(node)) {
                boolean isCyclic = isCyclicDFS(node, -1, visited, adjList);
                if (isCyclic)
                    return "Yes";
            }
        }
        return "No";
    }
    private static void getAdjList(Map<Integer, ArrayList<Integer>> adjList, int[][] edges, int m) {
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            ArrayList<Integer> temp = adjList.get(u);
            temp.add(v);
            adjList.put(u, temp);

            temp = adjList.get(v);
            temp.add(u);
            adjList.put(v, temp);
        }
    }
    private static boolean isCyclicDFS(int node, int parent, Map<Integer, Boolean> visited,
            Map<Integer, ArrayList<Integer>> adjList) {
        visited.put(node, true);

        ArrayList<Integer> neighbours = adjList.get(node);
        for (int neighbour : neighbours) {
            if (!visited.get(neighbour)) {
                boolean cycleDetected = isCyclicDFS(neighbour, node, visited, adjList);
                if (cycleDetected)
                    return true;
            } else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }
}
