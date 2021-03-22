import java.io.*;
import java.util.*;

public class longestconsecutivesequence{
    
    public static class triplet{
        int sp;
        int ep;
        int size;
        
        public triplet(int sp,int ep,int size){
            this.sp = sp;
            this.ep = ep;
            this.size = size;
        }
    }

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    
    LinkedList<triplet> myll = new LinkedList<>();
    
    int[] arr = new int[n1];
    
    for(int i = 0 ; i < n1; i++){
        arr[i] = scn.nextInt();
    }
    
    HashMap<Integer,Integer> map = new HashMap<>();
    int max = 0;
    for(int i = 0 ;i < arr.length; i++){
        int n = arr[i];
        
        if(map.containsKey(n) == false){
            int sp = n;
            int ep = n;
            
            if(map.containsKey(n-1) == true){
                sp = sp - map.get(n-1);
            }
            
            if(map.containsKey(n+1) == true){
                ep = ep + map.get(n+1);
            }
            
            int newlen = ep-sp+1;
            map.put(sp,newlen);
            map.put(ep,newlen);
            
            if(sp != n && ep != n){
                map.put(n,1);
            }
            
            max = Math.max(max,newlen);
            
            myll.addLast(new triplet(sp,ep,max));
            
            
        }
    }
    
    while(myll.size() != 0){
        triplet temp = myll.removeFirst();
        if(temp.size == max){
            display(temp.sp,temp.ep);
            break;
        }
    }
    
    // System.out.println(max);
 }
 
 public static void display(int sp,int ep){
     for(int i = sp; i <= ep; i++){
         System.out.println(i);
     }
 }
 
 

}