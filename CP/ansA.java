import java.util.*;
import java.io.*;


public class ansA {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            int i = 0;
            int j = arr.length-1;
            int minelem = 0;
            while(i < j && k > 0){
                if(arr[i] > 0){
                    --arr[i];
                    --k;
                    ++arr[j];
                }else{
                    ++i;
                }
            }

            for(int id = 0; id < n; id++){
                System.out.print(arr[id]+ " ");
            }
            System.out.println();
        }
    }

 
}