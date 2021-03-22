import java.io.*;
import java.util.*;

public class K_largest_elements {

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

      for(int i = 0; i < arr.length; i++){
          if(i < k){
              pq.add(arr[i]);
          }
          else{
            //   int val = pq.remove();
            //   pq.add(Math.max(val,arr[i]));

            //  BOTH ARE ACCEPTABLE ABOVE METHOD OF ADDITON AND BELLOW METHOD

            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
          }
      }

      while(pq.size() != 0){
          int val = pq.remove();
          System.out.println(val);
      }
      
      
    }

}