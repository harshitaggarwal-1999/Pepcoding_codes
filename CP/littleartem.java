import java.util.*;
import java.io.*;
 
public class littleartem{
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
            while(t-- > 0){
            int n =scn.nextInt();
            int m  = scn.nextInt();
            
            char[][] arr = new char[n][m];
            
            for(int i = 0 ;i <n; i++){
                Arrays.fill(arr[i],'B');
            }
            arr[0][0] = 'W';
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}