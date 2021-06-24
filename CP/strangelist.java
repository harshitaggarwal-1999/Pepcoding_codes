/*
AUTHOR-> HARSHIT AGGARWAL @harshit_agg
FROM-> MAHARAJA AGRASEN INSTITUE OF TECHNOLOGY
>> YOU CAN DO THIS <<
*/
import java.util.*;
import java.io.*;

public class strangelist {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    static class FastReader { BufferedReader br; StringTokenizer st; public FastReader() { try { br = new BufferedReader(new FileReader("input.txt")); PrintStream out = new PrintStream(new FileOutputStream("output.txt")); System.setOut(out); } catch (Exception e) { br = new BufferedReader( new InputStreamReader(System.in)); } } String next() { while (st == null || !st.hasMoreElements()) { try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); } } return st.nextToken(); } int nextInt() { return Integer.parseInt(next()); } long nextLong() { return Long.parseLong(next()); } double nextDouble() { return Double.parseDouble(next()); } float nextFloat(){ return Float.parseFloat(next()); } String nextLine() { String str = ""; try { str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } return str; } }
    static int INF = (int) 1e9 + 7;// static int INF = 998244353;
    static int MAX = Integer.MAX_VALUE; // static int MAX = 2147483647
    static int MIN = Integer.MIN_VALUE; // static int MIN = -2147483647
    static class Pair implements Comparable<Pair> { int first, second; public Pair(int first, int second) { this.first = first; this.second = second; } public int compareTo(Pair o) { return this.first- o.first; } }
    static class LongPair { long first; long second; LongPair(long a, long b) { this.first = a; this.second = b; } }
    public static long gcd(long a, long b) { if (a == 0) return b; return gcd(b % a, a); }
    public static int LowerBound(long a[], long x) { /* x is the key or target value */int l = -1, r = a.length; while (l + 1 < r) { int m = (l + r) >>> 1; if (a[m] >= x) r = m; else l = m; } return r; }
    public static int LowerBound(int a[], int x) { /* x is the key or target value */int l = -1, r = a.length; while (l + 1 < r) { int m = (l + r) >>> 1; if (a[m] >= x) r = m; else l = m; } return r; }
    static int LowerBoundList(ArrayList<Integer> a, int x) { /* x is the key or target value */int l = -1, r = a.size(); while (l + 1 < r) { int m = (l + r) >>> 1; if (a.get(m) >= x) r = m; else l = m; } return r; }
    static boolean[] prime; public static void sieveOfEratosthenes(int n) { prime = new boolean[n + 1]; for (int i = 0; i < n; i++) prime[i] = true; for (int p = 2; p * p <= n; p++) { if (prime[p] == true) { for (int i = p * p; i <= n; i += p) prime[i] = false; } } }
    public static int UpperBound(long a[], long x) {/* x is the key or target value */int l = -1, r = a.length; while (l + 1 < r) { int m = (l + r) >>> 1; if (a[m] <= x) l = m; else r = m; } return l + 1; }
    public static int UpperBound(int a[], int x) {/* x is the key or target value */int l = -1, r = a.length; while (l + 1 < r) { int m = (l + r) >>> 1; if (a[m] <= x) l = m; else r = m; } return l + 1; }
    public static long lcm(long a, long b) { return (a * b) / gcd(a, b); }
    public static void swap(int[] arr, int i, int j) { if (i != j) { arr[i] ^= arr[j]; arr[j] ^= arr[i]; arr[i] ^= arr[j]; } }
    public static long[] nextLongArray(int n) { long[] a = new long[n]; for (int i = 0; i < n; i++) a[i] = scn.nextLong(); return a; }
    public static int[] nextIntArray(int n) { int[] a = new int[n]; for (int i = 0; i < n; i++) { a[i] = scn.nextInt(); } return a; }
    public static int smallest_divisor(int n) { int i; for (i = 2; i <= Math.sqrt(n); ++i) { if (n % i == 0) { return i; } } return n; }
    public static FastReader scn = new FastReader();
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws Exception {
        int t = scn.nextInt();
        while (t-- > 0) {
            solver();
        }
    }
    static int level = 1000;

    public static void solver() {
        int n = scn.nextInt();
        int x = scn.nextInt();

        int[] a = nextIntArray(n);

        Queue<Pair> q = new ArrayDeque<>();
        for(int i = 0 ; i< n; i++){
            Pair p=new Pair(a[i],1);
            q.add(p);
        }

        //queue basicaly
        boolean flag = true;
        long sum  = 0;

        while(q.size() > 0){
            Pair p = q.remove();
            sum+=(long)p.first*p.second;
            if(p.first%x != 0)flag = false;
            if(flag == true){
                Pair tobeadded= new Pair(p.first/x,p.second*x);
                q.add(tobeadded);
            }
        }
        System.out.println(sum);




    }

    // public static int sum(int num, int x) {
    //     int tempsum = 0;
    //     int tempx = 1;
    //     int templevel = 0;
    //     while(num%x == 0 && templevel<level){
    //         tempsum += num*tempx;
    //         System.out.print(num+" "+tempx+" "+ tempsum+" ");
    //         num=num/x;
    //         System.out.print(num);
    //         System.out.println();
    //         tempx*=x;
    //         templevel++;
    //     }
    //     tempsum += num*tempx;
    //     System.out.println("level: " + level + " templevel: "+templevel);
    //     if(templevel < level)level = templevel;
        
        
    //     System.out.println("tempsum: "+ tempsum);
    //     return tempsum;
        
    // }
//-------------------------------- HO JA BHAI ----------------------------------------------------
}
