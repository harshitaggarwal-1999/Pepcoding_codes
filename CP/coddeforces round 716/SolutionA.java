import java.util.*;
import java.io.*;

//System.out.println();
class SolutionA {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0) {
            boolean mainans = false;
            int n = scn.nextInt();
            for(int i = 0; i < n; i++){
                int num = scn.nextInt();
                boolean isperfect = checkPerfectSquare(num);
                if(!isperfect)mainans = true;

            }
            if(mainans == true)System.out.println("YES");
            else System.out.println("NO");

        }
    }
    
  
    static boolean checkPerfectSquare(double number)    {   
  
        double sqrt=Math.sqrt(number);  
        // System.out.println(sqrt +" "+Math.floor(sqrt)); 
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   

}