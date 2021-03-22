import java.util.*;
import java.io.*;


public class last_index {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int ans = lastIndex(arr,0,x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length)return -1;

        
        
        int smallans = lastIndex(arr,idx+1,x);
        if(smallans == -1 && arr[idx] == x)smallans = idx;

        return smallans;

        


        
    }
}
