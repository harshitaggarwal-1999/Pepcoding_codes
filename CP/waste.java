// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class waste{
    static long maxint = 10000001;
    public static class Pair implements Comparable<Pair>{
        int n1;
        int n2;

        public Pair(int n1,int n2){
            this.n1 = n1;
            this.n2 = n2;
        }

        public int compareTo(Pair o){
            return n1-o.n1;
        }
    }

    static void pa(Object arr[]) {
        for(Object o : arr)
            System.out.print(o+" ");
        System.out.println();
    }  
     
    static void pa(int arr[]) {
        for(int o : arr)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(long arr[]){
        for(long o : arr)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(double arr[]){
        for(double o : arr)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(char arr[])
    {
        for(char o : arr)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(boolean arr[])
    {
        for(boolean o : arr)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(List list)
    {
        for(Object o : list)
            System.out.print(o+" ");
        System.out.println();
    }
    static void pa(Object[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(Object o : arr[i])
                System.out.print(o+" ");
            System.out.println();
        }
    }
    static void pa(int[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(int o : arr[i])
                System.out.print(o+" ");
            System.out.println();
        }
    }
    static void pa(long[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(long o : arr[i])
                System.out.print(o+" ");
            System.out.println();
        }
    }
    static void pa(char[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(char o : arr[i])
                System.out.print(o+" ");
            System.out.println();
        }
    }
    static void pa(double[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(double o : arr[i])
                System.out.print(o+" ");
            System.out.println();
        }
    }
    static void pa(boolean[][] arr) {
        for(int i=0;i<arr.length;++i) {
            for(boolean o : arr[i])
                System.out.println(o+" ");
            System.out.println();
        }
    }

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int t = 1;
        while(t-- > 0){
            solve();
        }
    }  
    
    public static void solve() {
        // write your code here
        int n = scn.nextInt();
        System.out.println(n);
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = i;

        }

        pa(arr);
        
    }
    /*primes in range 1 - n
    1 - 100(1e2) -> 25 pimes
    1 - 1000(1e3) -> 168 primes
    1 - 10000(1e4) -> 1229 primes
    1 - 100000(1e5) -> 9592 primes
    1 - 1000000(1e6) -> 78498 primes
    1 - 10000000(1e7) -> 664579 primes
    large primes ->
    104729 1299709 15485863 179424673 2147483647 32416190071 112272535095293 48112959837082048697
    */
}
