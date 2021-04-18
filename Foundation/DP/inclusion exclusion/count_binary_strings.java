import java.io.*;
import java.util.*;

public class count_binary_strings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int ans = twovariableBinaryCount(n);
    System.out.println(ans);
    
 }
 
 public static int SimplecountBinary(int n){
     int[] zero = new int[n+1];
     int[] one = new int[n+1];
     
     zero[1] = 1;
     one[1] = 1;
     
     for(int i = 2 ; i <= n; i++){
         zero[i] = one[i-1];
         one[i] = zero[i-1] + one[i-1];
     }
     
     return one[n]+zero[n];
 }
 
    public static int twovariableBinaryCount(int n){
        int one = 1;
        int zero = 1;
        
        for(int i = 2; i <= n; i++){
            int temp = one;
            
            one = one+zero;
            zero = temp;
        }
        
        return one+zero;
    } 

}