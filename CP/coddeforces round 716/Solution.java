import java.util.*;
import java.io.*;

//System.out.println();
public class Solution {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            long n = scn.nextLong();
            long k =scn.nextLong();
            long mod = 1000000007;
            long rem = 1;

            for(long i = 0; i < k; i++){
                rem *= n;
                rem %=mod;
            }

            System.out.println(rem);
        }
    }
    
}