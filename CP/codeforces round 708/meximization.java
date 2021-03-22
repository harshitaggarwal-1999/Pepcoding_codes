import java.util.*;
import java.io.*;

public class meximization{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-->0){

            int n = scn.nextInt();

            HashMap<Integer,Integer> map = new HashMap<>();
            LinkedList<Integer> dup = new LinkedList<>();
            PriorityQueue<Integer> elem = new PriorityQueue<>();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
                if(map.containsKey(arr[i]) == false){
                    map.put(arr[i],1);
                    elem.add(arr[i]);
                }else{
                    dup.addLast(arr[i]);
                }
            }

            while(elem.size()!= 0){
                System.out.print(elem.remove()+" ");
            }
            
            while(dup.size()!= 0){
                System.out.print(dup.removeFirst()+" ");
            }
            System.out.println();
        }
    }
}