import java.util.*;
import java.io.*;

class Solution{

    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int i = 1;
        while(t > 0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            String waste  = scn.nextLine();
            String str = scn.nextLine();

            int ans = k_goodness(str,n,k);
            System.out.println("Case #" + i + ": " + ans);
            i++;
            t--;
        }

        scn.close();
    }
    
    public static int k_goodness(String str, int n,int k){
        int count = 0;
        for(int i = 0; i < n/2; i++){
            char s = str.charAt(i);
            char e = str.charAt(n-i-1);
            if(s!=e)count++;
        }
        if (k == count) return 0;
        return Math.abs(k-count);
    }
    
}