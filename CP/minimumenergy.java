/*
>>>>>>>>>>>>>>>>>>>>>>>>HARSHIT AGGARWAL<<<<<<<<<<<<<<<<<<<<
>>>>>>>>>>>>MAHARAJA AGRASEN INSTITUE OF TECHNOLOGY<<<<<<<<<

>> YOU CAN DO THIS <<
*/
import java.util.*;
import java.io.*;

public class minimumenergy {
    
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
        int t = 1;
        while (t-- > 0) {
            solver();
        }
    }

    public static void solver() {
        int init = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = nextIntArray(n);

        int[] height = nextIntArray(n);
        int zeroidx = -1;
        int diff = MAX;
        for(int i = init-1; i < n; i++){
            if(arr[i] == 0 && diff >(int) Math.abs((double) i-(init+1))){
                diff =(int) Math.abs((double) i-(init+1));
                zeroidx = i;
                break;
            }
        }

        for(int i = init-1; i >= 0; i--){
            if(arr[i] == 0 && diff >(int) Math.abs((double) i-(init+1))){
                diff =(int) Math.abs((double) i-(init+1));
                zeroidx = i;
                break;
            }
        }
        int min = MAX, minidx = init-1;
        int max = MIN, maxidx = init-1;

        for(int i = init-1; i <= zeroidx; i++){
            if(height[i]> height[init] && height[i] < height[zeroidx]){
                if(max < height[i]){
                    maxidx = i;
                    max = Math.max(max,height[i]);
                }
                if(min > height[i]){
                    min = Math.min(min,height[i]);
                    minidx = i;
                }
            }
        }
        

        long ans = MAX;
        long tempans1 = (long)((long)Math.pow((double)height[init]-height[maxidx],3)+   (long)Math.pow((double)(maxidx-init),2)) + ((long) Math.pow((double)(height[maxidx]-height[zeroidx]),3)+(long)Math.pow((double)(zeroidx-maxidx), 2));
        System.out.println(tempans1 + " "+ ans);
        if(Math.abs(tempans1) >= 0)ans = Math.min(Math.abs(tempans1),ans);
        long tempans2 = (long)(((long)Math.pow((double)height[init]-height[minidx],3)+(long)Math.pow((double)(minidx-init),2)) +(long) Math.pow((double)(height[minidx]-height[zeroidx]),3)+(long)Math.pow((double)(zeroidx-minidx), 2));
        System.out.println(tempans2 + " "+ ans);
        if(Math.abs(tempans2) >= 0)ans = Math.min(Math.abs(tempans2),ans);
        long tempans3 = (long)((long)Math.pow((double)height[init]-height[zeroidx],3)+(long)Math.pow((double)(zeroidx-init),2));
        System.out.println(tempans3 + " "+ ans);
        if(Math.abs(tempans3) >= 0)ans = Math.min(Math.abs(tempans3),ans);
        System.out.println(ans);

    }
//-------------------------------- HO JA BHAI ----------------------------------------------------
}
