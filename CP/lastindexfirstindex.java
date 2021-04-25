import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
          
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int fi = -1;
        int li = -1;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == d){
                fi = i;
                break;
            } 
        }
        for(int i = n-1; i >= 0; i--){
            if(arr[i] == d){
                li = i;
                break;
            }
        }
        System.out.println(fi);
        System.out.println(li);
    }
        
        

}