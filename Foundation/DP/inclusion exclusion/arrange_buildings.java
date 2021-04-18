import java.io.*;
import java.util.*;

public class arrange_buildings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    long build = 1;
    long empty = 1;
    
    for(int i = 2 ; i <= n; i++){
        long temp = empty;
        
        empty = build+empty;
        build = temp;
    }
    long ans = empty+build;
    System.out.println(ans*ans);
 }

}