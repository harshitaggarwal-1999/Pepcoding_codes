import java.io.*;
import java.util.*;

// import multisolve.Pair;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   public static class Pair{
       int vtx;
       String psf;

       public Pair(int vtx, String psf){
           this.vtx = vtx;
           this.psf = psf;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      // write your code here 
      LinkedList<Pair> queue = new LinkedList<>();

      boolean[] vis = new boolean[vtces];

      queue.addLast(new Pair(src,src+""));
      vis[src] = true;

      while(queue.size() > 0){
          Pair rem = queue.removeFirst();

          System.out.println(rem.vtx + "@"+ rem.psf);

          for(Edge tempnbr: graph[rem.vtx]){
              if(vis[tempnbr.nbr] == false){
                  vis[tempnbr.nbr] = true;
                  queue.addLast(new Pair(tempnbr.nbr, rem.psf+tempnbr.nbr));
              }
          }
      }
   }
}