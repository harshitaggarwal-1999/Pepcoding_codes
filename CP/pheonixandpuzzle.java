
import java.util.*;
import java.io.*;

public class pheonixandpuzzle{
    public static void yn(int ans){ 
        if(ans==1)System.out.println("YES");
        else System.out.println("NO");
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
        Long n = scn.nextLong();

        if(n == 0){
            yn(0);
            return;
        }
        if(n%2 != 0){
            yn(0);
            return;
        }

        for(int i = 0; i <= 40; i++){
            long num = (long)Math.pow(2,i);
            
            if(num-n == 0){
                yn(1);
                return;
            }
        }

        for(int i = 0; i < 31623; i++){
            long num = (long)2*(i*i);
            // System.out.println(num+" "+ n);

            if(num == n){
                yn(1);
                return;
            }
        }

        for(int i = 0; i < 31623; i++){
            long nume = (long)4*(i*i);
            // System.out.println(nume+" "+ n);

            if(nume == n){
                yn(1);
                return;
            }
        }
        yn(0);
    }
}

