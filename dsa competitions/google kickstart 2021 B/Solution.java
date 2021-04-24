import java.util.*;
import java.io.*;

//System.out.println();
class Solution {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        ArrayList<Integer> primes = sieveOfEratosthenes(100000000);
        int casecount = 1;
        while(t-->0) {
            int n = scn.nextInt();
            System.out.print("Case #"+ casecount+ ": ");
            for(int i = 0; i < primes.size(); i++){
                long ans = primes.get(i)*primes.get(i+1);
                if(ans == n){
                    System.out.println(ans);
                    break;
                }else if(ans > n){
                    long isans = (long)primes.get(i-1)*primes.get(i);
                    System.out.println(isans);
                    break;
                }
            }
            
        }
    }

    public static ArrayList<Integer> sieveOfEratosthenes(int n){
       
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
 
        for (int p = 2; p * p <= n; p++)
        {
            if (prime[p] == true)
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == true){
                primes.add(i);
            }
                
        }
        return primes;
    }
    
}


    
 
    
    
