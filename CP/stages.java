// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class stages{
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
        int k = scn.nextInt();
        String str  = scn.next();

        String ans = "";

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        str = new String(arr);
        // System.out.println(str);
        char prev = str.charAt(0);
        ans = str.charAt(0)+"";
        k--;

        int mainans = str.charAt(0)-'a'+1;
        for(int i = 1 ; i < str.length()&& k> 0; i++){
            char curr = str.charAt(i);

            if((curr-'a')-(prev-'a')>=2){
                // System.out.println("curr: " +curr );
                ans+=curr;
                mainans += curr-'a'+1;
                k--;
                prev = curr;
            }
        }
        if(k>0)System.out.println(-1);
        
        else System.out.println(mainans);
        // System.out.println(ans);
    }
}
