import java.io.*;
import java.util.*;

public class K_sorted_array {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here

      PriorityQueue<Integer> pq = new PriorityQueue<>();
      ArrayList<Integer> ansarr = new ArrayList<>();

    //   for(int i = 0; i < arr.length; i++){
    //       if(i <= k){
    //         pq.add(arr[i]);
    //       }
    //       else{
    //           System.out.println(pq.remove());
    //           pq.add(arr[i]);
    //       }
    //   }

    // OR
     for(int i = 0; i <= k; i++){
         pq.add(arr[i]);
     }

     for(int i = k+1; i < arr.length; i++){
         System.out.println(pq.remove());
         pq.add(arr[i]);
     }

      while(pq.size() != 0){
          System.out.println(pq.remove());
      }
   }

}