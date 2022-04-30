import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        Queue<Integer> q = new ArrayDeque<>();
        int[] vis = new int[n];
        for (int i = 0; i < n; i++) {

            Arrays.fill(vis, -1);
            q.add(i);
            vis[i] = 10;// mark hai ki if it's group A(10) or group B(12)

            while (q.size() > 0) {
                int size = q.size();

                while (size-- > 0) {
                    int currnode = q.remove();

                    int[] nbrs = graph[currnode];

                    for (int nbr : nbrs) {
                        if (vis[nbr] == -1) { // unvisited
                            if (vis[currnode] == 10)
                                vis[nbr] = 12;
                            else {
                                vis[nbr] = 10;
                            }

                            q.add(nbr);

                        } else { // visited
                            if (vis[currnode] == vis[nbr])
                                return false;
                        }
                    }
                }
            }
        }
        return true;

    }
}