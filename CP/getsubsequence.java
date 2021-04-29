import java.util.*;
import java.io.*;

//System.out.println();
public class getsubsequence {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        List<String> ans = getsubs(str);
        System.out.println(ans);
        // System.out.println(ans.size());
        
    }

    public static List<String> getsubs(String str) {

        if(str.length() == 0){
            List<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }

        char ch  = str.charAt(0);
        List<String> tempans = getsubs(str.substring(1));

        List<String> finalans = new ArrayList<>();

        for(int i = 0 ; i < tempans.size(); i++){
            finalans.add(tempans.get(i));
        }

        for(int i = 0 ; i < tempans.size(); i++){
            finalans.add(ch+tempans.get(i));
        }
        
        return finalans;
    }
}