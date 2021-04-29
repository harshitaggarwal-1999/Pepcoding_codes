import java.util.*;
import java.io.*;

//System.out.println();
public class arena {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            solve(n,arr);
        }
    }

    public static void solve(int n, int[] arr) {
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)continue;
                if(arr[j] < arr[i]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}