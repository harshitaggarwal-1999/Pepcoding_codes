import java.util.*;

public class recursion {
    public static int power(int x, int n){
        if(x==0){
            if(n!=0)return 0;
            else return 1;
        }

        if(n==0)return 1;

        int smalloutput = power(x,n-1);

        return x*smalloutput;
    }
    public static void main(String[] args){
        // int x = 2;
        // int n = 4;
        Scanner scn = new Scanner(System.in);
        int ans = power(0,0);
        System.out.println(ans);
        scn.close();
    }
    
}