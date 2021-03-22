import java.util.*;
import java.io.*;

public class print_increasing{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        print_inc(arr,arr.length-1);

    }
    public static void print_inc(int[] arr, int idx){
        if(idx == -1)return;

        print_inc(arr,idx-1);
        System.out.println(arr[idx]);
    }
}