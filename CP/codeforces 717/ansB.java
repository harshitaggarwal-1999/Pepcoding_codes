import java.util.*;
import java.io.*;
import java.math.BigInteger;

//System.out.println();
public class ansB {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            solve(arr,n);           
        }
    }


    public static void solve(int[] arr, int n) {
        boolean finalans = false;
        for(int i = 0; i < n-1; i++){
            int x = 0;
            for(int j = 0; j <= i; j++){
                x^=arr[j]; 
            }
            int t = 0;
            boolean f = false;
            for(int j = i+1; j < n; j++){
                t^= arr[j];
                if(t == x){
                    f = true;
                    t = 0;
                }
            }

            if(t==0 && f){
                System.out.println("YES");
                finalans = true; 
                break;
            }
        }
        if(!finalans){
            System.out.println("NO");
        }
    }
}
