/*
>>>>>>>>>>>>>>>>>>>>>>>>HARSHIT AGGARWAL<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>MAHARAJA AGRASEN INSTITUE OF TECHNOLOGY<<<<<<<<<

>> YOU CAN DO THIS <<
*/
import java.util.*;
import java.io.*;

public class reversesorting{

    
    // static int INF = 998244353;
    static int INF = (int) 1e9 + 7;
    static int MAX = Integer.MAX_VALUE; // static int MAX = 2147483647
    static int MIN = Integer.MIN_VALUE; // static int MIN = -2147483647

// >>>>>>>>>>>>>>>>>> PAIR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public String toString() {
            return "[" + first + "," + second + "]";
        }
    }

    static class LongPair {
        long first;
        long second;

        LongPair(long a, long b) {
            this.first = a;
            this.second = b;
        }

        public String toString() {
            return "[" + first + "," + second + "]";
        }
    }
    // >>>>>>>>>>>>>>>>>GCD<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>LOWER BOUND<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static int LowerBound(long a[], long x) { // x is the target value or key

        int l = -1,r = a.length;
        while(l + 1 < r) {

            int m = (l + r) >>> 1;
            if(a[m] >= x) r = m;
            else l = m;
        }
        if(r<0){
            r = -1*r -1;
        }
        r--;
        return r;
    }

    static int LowerBoundList(ArrayList<Integer> al, int x) { // x is the target value or key
        int l = -1, r = al.size();
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (al.get(m) >= x)
                r = m;
            else
                l = m;
        }
        if(r<0){
            r = -1*r -1;
        }
        r--;
        return r;
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>SIEVE<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static boolean[] prime;
    public static void sieveOfEratosthenes(int n) {
            prime = new boolean[n+1];
            for(int i=0;i<n;i++)
                prime[i] = true;
        
            for(int p = 2; p*p <=n; p++) {

                if(prime[p] == true) {

                    for(int i = p*p; i <= n; i += p)
                        prime[i] = false;
                }
            }
        }
//>>>>>>>>>>>>>>>>>>>>>>>>>>> UPPERBOUND<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static int UpperBound(long a[], long x) {// x is the key or target value

            int l = -1,r = a.length;

            while(l + 1 < r) {

                int m = (l + r) >>> 1;
                if(a[m] <= x) l = m;
                else r = m;

            }
            return l + 1;
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>LCM<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>> SWAP <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static void swap(int[] arr, int i, int j) {
        if(i!=j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextLong();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        return a;
    }

    public static int smallest_divisor(int n) {

        int i;
        for (i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>> CODE STARTS HERE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int t = 1;
        while(t-- > 0){
            solver();
        }
    }

    public static void solver() {
        //write you code here


    }

    
}