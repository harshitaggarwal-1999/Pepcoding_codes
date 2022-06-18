import java.util.*;
import java.io.*;

public class motherVertex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 1;
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            int ans = findMotherVertex(V, adj);
            System.out.println(ans);
        }
    }

    public static int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        // fill the stack while backtracking
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                dfs(adj, i, vis, st);
            }
        }

        // finding the potential mother vertex
        int potentialMotherVertex = st.peek();

        // step 3 checking if that potential mother vertex is real mother vertex or not
        vis = new boolean[V]; // reintialising visited array

        dfsCheck(adj, potentialMotherVertex, vis);

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                return -1;
            }
        }
        return potentialMotherVertex;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis, Stack<Integer> st) {
        vis[src] = true;

        for (int nbr : adj.get(src)) {
            if (vis[nbr] == false) {
                dfs(adj, nbr, vis, st);
            }
        }

        st.push(src);
    }

    public static void dfsCheck(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis) {
        vis[src] = true;

        ArrayList<Integer> nbrs = adj.get(src);
        for (int nbr : nbrs) {
            if (vis[nbr] == false) {
                dfsCheck(adj, nbr, vis);
            }
        }
    }
}
