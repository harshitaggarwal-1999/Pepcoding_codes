// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class shooting{
    static long maxint = 10000001;
    public static class Pair implements Comparable<Pair>{
        int n1;
        int n2;

        public Pair(int n1,int n2){
            this.n1 = n1;
            this.n2 = n2;
        }

        public int compareTo(Pair o){
            if(this.n1 != o.n1)return o.n1-this.n1;
            else  return o.n2-this.n2;
        }
    }

    public static void yn(int ans){ 
        if(ans==1)System.out.println("YES");
        else System.out.println("NO");
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
        int n =scn.nextInt();
        Pair[] arr =new Pair[n];
        for(int i = 0; i < n; i++){
            int num = scn.nextInt();
            Pair p = new Pair(num, i+1);
            arr[i] = p;
        }
        Arrays.sort(arr);
        long ans = 1;
        for(int i = 0 ;i < arr.length; i++){
            // System.out.println(arr[i].n1 +" "+ arr[i].n2);
            if(i == 0)continue;
            ans+= ((arr[i].n1*i)+1);
        }
        System.out.println(ans); 
        for(int i = 0 ;i < arr.length; i++){
            System.out.print(arr[i].n2 +" ");
        }    
    }
}
