/*
>>>>>>>>>>>>>>>>>>>>>>>>HARSHIT AGGARWAL<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>MAHARAJA AGRASEN INSTITUE OF TECHNOLOGY<<<<<<<<<

>> YOU CAN DO THIS <<
*/
import java.util.*;
import java.io.*;

public class numbersonwhiteboard {
    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FAST I/O <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            }
            catch (Exception e) {
                br = new BufferedReader(
                new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        float nextFloat(){
            return Float.parseFloat(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MATHS VALUES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // static int INF = 998244353;
    static int INF = (int) 1e9 + 7;
    static int MAX = Integer.MAX_VALUE; // static int MAX = 2147483647
    static int MIN = Integer.MIN_VALUE; // static int MIN = -2147483647

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PAIR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static class Pair implements Comparable<Pair> {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        public int compareTo(Pair o) {
            return this.first- o.first;
        }

    }

    static class LongPair {
        long first;
        long second;

        LongPair(long a, long b) {
            this.first = a;
            this.second = b;
        }
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> GCD <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LOWER BOUND <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static int LowerBound(long a[], long x) { // x is the target value or key

        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x)
                r = m;
            else
                l = m;
        }
        return r;
    }

    public static int LowerBound(int a[], int x) { // x is the target value or key

        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] >= x)
                r = m;
            else
                l = m;
        }
        return r;
    }

    static int LowerBoundList(ArrayList<Integer> a, int x) { // x is the target value or key
        int l = -1, r = a.size();
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) >= x)
                r = m;
            else
                l = m;
        }
        return r;
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SIEVE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static boolean[] prime;

    public static void sieveOfEratosthenes(int n) {
        prime = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            if (prime[p] == true) {

                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> UPPERBOUND <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static int UpperBound(long a[], long x) {// x is the key or target value
        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] <= x)
                l = m;
            else
                r = m;
        }
        return l + 1;
    }

    public static int UpperBound(int a[], int x) {// x is the key or target value
        int l = -1, r = a.length;
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a[m] <= x)
                l = m;
            else
                r = m;
        }
        return l + 1;
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> LCM <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SWAP <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }
    }
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ARRAYINPUT <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextLong();
        return a;
    }

    public static int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        return a;
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> SMALLEST DIVISOR <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static int smallest_divisor(int n) {

        int i;
        for (i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

    public static FastReader scn = new FastReader();

// >>>>>>>>>>>>>>>>>>>>>>>>>>>> CODE STARTS HERE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static void main(String[] args) throws Exception {
        int t = scn.nextInt();
        while (t-- > 0) {
            solver();
        }
    }

    public static void solver() {
        // int n = scn.nextInt();
        
        // ArrayList<Integer> arr = new ArrayList<>();
        // // ArrayList<Integer> oddarr = new ArrayList<>();
        // for(int i = 1; i <= n; i++){
        //     arr.add(i);
        // }
        // int i = 0;
        
        // System.out.println("odd: " + oddarr);
        // System.out.println("even: "+ evenarr);
        // while(oddarr.size() > 1 || evenarr.size()> 1){
        //     while(evenarr.size() > 1){
        //         int tempans = (evenarr.get(0)+evenarr.get(1))/2;
        //         System.out.println(evenarr.get(0)+ " "+evenarr.get(1));
        //         evenarr.remove(0);
        //         evenarr.remove(0);
        //         if(tempans%2 == 0) evenarr.add(tempans);
        //         else oddarr.add(tempans);
        //         // System.out.println("odd: " + oddarr);
        //         // System.out.println("even: "+ evenarr);
        //     }

            // while(oddarr.size() > 1){
            //     int tempans = (oddarr.get(0)+oddarr.get(1))/2;
            //     System.out.println(oddarr.get(0)+ " "+oddarr.get(1));
            //     oddarr.remove(0);
            //     oddarr.remove(0);
                
            //     if(tempans%2 == 0)evenarr.add(tempans);
            //     else oddarr.add(tempans);
                // System.out.println("odd: " + oddarr);
                // System.out.println("even: "+ evenarr);
        //     }
            
        // }
        // int ans =  0;
        // if(evenarr.size() ==1 && oddarr.size() == 1){
        //     ans = (int) Math.ceil((evenarr.get(0)+oddarr.get(0))/2.0);
        //     System.out.println(ans);
        //     return;
        // }
        // if(evenarr.size() ==1){
        //     ans = (evenarr.get(0));
        //     System.out.println(ans);return;
        // }
        // if(oddarr.size() == 1){
        //     ans = oddarr.get(0);
        //     System.out.println(ans);return;
        // }

        int n = scn.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Pair> ansarr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(i);
        }
        int turn = 2;
        int i = arr.size()-1;
        while(arr.size() > 1){
            // System.out.println("arr.size() : "+arr.size()+" i: "+ i+ " turn: " + turn);
            // System.out.println("arr: "+ arr);
            if(arr.size() == 2){
                
                ansarr.add(new Pair(arr.get(i-1), arr.get(i)));
                arr.set(i,(arr.get(i)+arr.get(i-1))/2);
                arr.remove(i-1);
                break;
            }
            if(turn == 2){
                ansarr.add(new Pair(arr.get(i-2), arr.get(i)));
                arr.set(i,(arr.get(i)+arr.get(i-2))/2);
                arr.remove(i-2);
                turn =1;
            }else if(turn == 1){
                ansarr.add(new Pair(arr.get(i-1), arr.get(i)));
                arr.set(i,(arr.get(i)+arr.get(i-1))/2);
                arr.remove(i-1);
                turn = 2;
            }
            i--;
        }


        System.out.println(arr.get(0));
        for(Pair p: ansarr){
            System.out.println(p.first+" "+ p.second);
        }
    

    }
//-------------------------------- HO JA BHAI ----------------------------------------------------
}
