// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class fromherotozero{
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
        int t = scn.nextInt();
        while(t-- > 0){
            solve();
        }
    }  
    
    public static void solve() {
        // write your code here
        long n = scn.nextLong();
        long k = scn.nextLong();

        long count = 0;
        while(n > 0){
            long rem = n%k; 
            if(rem == 0){
                n = n/k;
                count++;
            }else {
                // System.out.println("rem: " + rem);
                // System.out.println("n%k: "+ n%k);
                count+=(long)(n%k);
                n-=(long)(n%k);
                
            }
        }
        System.out.println(count);
        
    }
}
