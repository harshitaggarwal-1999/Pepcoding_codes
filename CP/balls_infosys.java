import java.util.*;
import java.io.*;

public class balls_infosys {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x = scn.nextLong();
        long y = scn.nextLong();

        long n = x+y;

        boolean firstcheck = false;
        for(long i = 0; i < n; i=i+1){
            if((i*(i+1)/2) == n)firstcheck = true;
        }
        long tempx = x;
        if(firstcheck){
            long count = 0; 
            while (tempx>0) { 
                count++; 
                tempx >>= 1; 
            } 
            long maincount = 0;
            long ans = 0;
            
            System.out.println(count); 

        }else{
            System.out.println(-1);
        }
    }    
}
