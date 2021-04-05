import java.io.*;
import java.util.*;

public class Nthfib{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n  = scn.nextInt();
    System.out.println(fib(n,new int[n+1]));
    
 }
 public static int fib(int n, int[] dp){
     if(n == 1 || n == 0){
         return n;
     }
     
     if(dp[n] != 0){
         return dp[n];
     }
     
     int fibnm1 = fib(n-1,dp);
     int fibnm2 = fib(n-2,dp);
     
     dp[n] = fibnm1+fibnm2;
     
     return fibnm1+fibnm2;
 }

}