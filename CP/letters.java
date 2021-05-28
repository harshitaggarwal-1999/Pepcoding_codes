import java.util.*;
import java.io.*;

public class letters {
    static Scanner scn = new Scanner(System.in);
    public static class pair{
        long dormno;
        long roomno;

        pair(long dormno, long roomno){
            this.dormno = dormno;
            this.roomno = roomno;

        }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        long[] narr = new long[n];
        for(int i = 0; i < n; i++){
            narr[i] = scn.nextLong();
        }
        long[] marr = new long[m];
        for(int i = 0 ; i < m; i++){
            marr[i] = scn.nextLong();
        }
        
        HashMap<Long, pair> answerhelp = new HashMap<>();

        
        for(int marritr = 0; marritr < marr.length; marritr++){
            long currbi = marr[marritr];
            if(answerhelp.containsKey(currbi)){
                pair p = answerhelp.get(currbi);
                // System.out.println("hashmap activated: ");
                System.out.println(p.dormno + " " + p.roomno);
                continue;
            }
            // long sum = 0;
            for(int narritr = 0; narritr < narr.length; narritr++){
                if(narr[narritr] >= currbi){
                    pair p = new pair(narritr+1 ,currbi);
                    answerhelp.put(marr[marritr], p);
                    System.out.println(narritr+1 + " " + currbi);
                    break;
                    
                }
                else if(narr[narritr] < currbi){
                    currbi -= narr[narritr];
                } 
            }
        }
        

    }    
}
