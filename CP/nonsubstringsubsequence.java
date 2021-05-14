// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class nonsubstringsubsequence{

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int q = scn.nextInt();
            String waste = scn.nextLine();
            String str = scn.nextLine();

            for(int i = 0; i < q; i++){
                int l = scn.nextInt();
                int r = scn.nextInt();
                solve(str,l-1,r);
            }
        }
    }  
    
    public static void solve(String str,int l,int r) {
        // write your code here
        System.out.println(str);
        String givenstr = str.substring(l,r);
        System.out.println(givenstr); 
        
    }
}
