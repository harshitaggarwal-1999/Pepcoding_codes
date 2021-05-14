// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class holidays{

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
        if(n == 0){
            System.out.println(0+ " "+ 0);return;
        }
        if(n%7 == 0)System.out.println((n/7)*2 + " " + (n/7)*2);
        else{
            if(n%7 == 6)System.out.println((((n/7)*2)+1) + " " + (((n/7)*2)+2));
            else if(n%7 > 2)System.out.println((n/7)*2 + " " + (((n/7)*2)+2));       
            
            else{
                System.out.println((n/7)*2 + " " + (((n/7)*2)+(n%7)));
            }
        } 
        
    }
}
