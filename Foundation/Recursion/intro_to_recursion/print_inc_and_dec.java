import java.io.*;
import java.util.*;

public class print_inc_and_dec {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        pdi(arr,arr.length-1);
    }

    public static void pdi(int[] arr, int idx){
        if(idx == -1)return;

        System.out.println(arr[idx]);
        pdi(arr,idx-1);
        System.out.println(arr[idx]);
    }

}