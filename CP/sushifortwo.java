// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class sushifortwo{
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

    // 1 1 1 2 2 1 2
    public static void solve() {
        // write your code here

        // input
        int n = scn.nextInt();;
        int[]  arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        // // max diffrnce vala variable
        // int maxdiff = 0;
        // // jo count chal raha hoga
        // int count = 0;
        // // curr count vs value of current index found at that index
        // HashMap<Integer,Integer> map = new HashMap<>();
        // // hashmap is completely empty but 0  vala case add karenge
        // map.put(0, -1);
        // // -1 taaki manlo 3rth index par 0 mila to string count kya hoga 3-(-1) =4 jo ki puri string ki length hogi shuruvaat se 

        // for(int i = 0 ; i < n; i++){
        //     // count calculation if arr[i] == 1 count++ else count--;
        //     if(arr[i] == 1)count++;
        //     else count--;

        //     // if count == 0 matlab poori string to usse pehle hi add kardo yaa yaha handle kardo
        //     // maine upar handle kardiya nahi to yaha aise handle karenge
        //     // if(count == 0){
        //     //     maxdiff = Math.max(maxdiff,i+1);//i+1 porri string shurvat se
        //    //      return;
        //     // }

        //     // if map don't contains that key simply update count and its corresponding index
        //     if(map.containsKey(count) == false){
        //         map.put(count, i);
        //     }
        //     // else 
        //     else if(map.containsKey(count)){
        //         // previndx jo tha pehle tha vo nikal lo and update kardo
        //         int prevfoundidx = map.get(count);
        //         map.put(count, i);

        //         // waste part
        //         int currdiff = i-prevfoundidx;
        //         maxdiff = Math.max(currdiff,maxdiff);              
        //     }
        // }
        int eel=0;
        int tuna=0;
        if(arr[0]==1)tuna++;
        else eel++;
        
        int maxi=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
                {
                
                if(tuna>0 && eel>0)maxi = Math.max(maxi,2*Math.min(tuna,eel));
                if(arr[i]==1)tuna=1;
                else eel=1;
                }
                else
                {
                    if(arr[i]==1)tuna++;
                    else eel++;
                }
        }
            if(tuna>0 && eel>0)maxi = Math.max(maxi,2*Math.min(tuna,eel));

        System.out.println(maxi);
        
    }
}
