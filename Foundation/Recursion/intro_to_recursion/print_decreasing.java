import java.util.*;
import java.io.*;

public class print_decreasing{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        print_dec(arr,arr.length-1);

    }
    public static void print_dec(int[] arr, int idx){
        if(idx == -1)return;

        System.out.println(arr[idx]);
        print_dec(arr,idx-1);
    }
}