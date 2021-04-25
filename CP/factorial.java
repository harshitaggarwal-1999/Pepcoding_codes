import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==1)return 1;

        int smalloutput = fact(n-1);

        return n*smalloutput;
    }
    public static void main(String[] args){
        int ans = fact(5);
        System.out.println(ans);
    }
}
