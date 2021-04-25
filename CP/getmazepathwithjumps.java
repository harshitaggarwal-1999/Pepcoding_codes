import java.io.*;
import java.util.*;

public class getmazepathwithjumps {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int rowlength = scn.nextInt();
        int collength = scn.nextInt();
        ArrayList<String> ans = getMazePath(0,0,rowlength-1,collength-1);
        // int count = countval(ans);
        System.out.println(countval(ans));
        System.out.println(ans);
        ansprintin(ans);
        
    }
    
    
    
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
        if(sc == dc && sr == dr){
            ArrayList<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        if(sc > dc || sr > dr){
            ArrayList<String> tempans = new ArrayList<>();
            // tempans.add("");
            return tempans;
        }
        
        ArrayList<String> finalans = new ArrayList<>();

        for(int jumps = 1;  jumps <= dc-sc; jumps++){
            ArrayList<String> tempres1 = getMazePath(sr,sc+jumps,dr,dc);
            for(int i = 0; i < tempres1.size(); i++){
                finalans.add("h"+jumps+tempres1.get(i));
            }
        }
        
        for(int jumps = 1;  jumps <= dr-sr; jumps++){
            ArrayList<String> tempres2 = getMazePath(sr+jumps,sc,dr,dc);
            for(int i = 0; i < tempres2.size(); i++){
                finalans.add("v"+jumps+tempres2.get(i));
            }
        }
        
        for(int jumps = 1;  jumps <= Math.min(dc-sc,dr-sr); jumps++){
            ArrayList<String> tempres3 = getMazePath(sr+jumps,sc+jumps,dr,dc);
            for(int i = 0; i < tempres3.size(); i++){
                finalans.add("d"+jumps+tempres3.get(i));
            }
        }
        
        return finalans;
    }
    
    public static int countval (ArrayList<String> ans){
        return ans.size();
    }
    
    public static void ansprintin(ArrayList<String> ans){
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
