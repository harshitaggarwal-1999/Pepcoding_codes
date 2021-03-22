
import java.io.*;
import java.util.*;

public class max_of_array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = maxOfArray(arr,0);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length)return 0;

        int tempmax = maxOfArray(arr,idx+1);
        // tempmax > arr[idx] ? tempmax = tempmax:tempmax = arr[idx];

        if(tempmax > arr[idx])return tempmax;
        else return arr[idx];
        // return tempmax; 
    }

}