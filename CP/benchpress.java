// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class benchpress{
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
        int t = scn.nextInt();
        while(t-- > 0){
            solve();
        }
    }  
    
    public static void solve() {
        // write your code here
        int n =scn.nextInt();
        int w = scn.nextInt();
        int wr = scn.nextInt();
        int[]weights = new int[n];
        for(int i = 0 ;i < weights.length; i++){
            weights[i] = scn.nextInt();
        }
        if(w<=wr){
            yn(1);
            return;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < weights.length; i++){
            if(map.containsKey(weights[i])){
                map.put(weights[i],map.get(weights[i])+1);
            }
            else{
                map.put(weights[i],1);
            }
        }

        int weightsum = 0;
        
        for(int i = 0; i < weights.length;i++){
            int repeated = map.get(weights[i]);
            map.put(weights[i],0);
            if(repeated%2 == 0&& repeated!=0){
                // System.out.println("repeated: "+repeated);
                weightsum += repeated*weights[i];
            }
            if(repeated%2!= 0&& repeated!=1){
                repeated=repeated-1;
                weightsum+=repeated*weights[i];
            }
            // System.out.println("weightsum: "+weightsum);
            if(weightsum+wr >= w){
                yn(1);
                return;
            }
        }
        if(weightsum+wr<w)yn(0);
        
    }
}
