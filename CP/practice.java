// get subsequence

import java.util.*;
import java.io.*;

public class practice {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ans  = getSubsequence(str);
        System.out.println(ans);

        
    }   
    
    public static ArrayList<String> getSubsequence(String str) {
        if(str.length() == 0){
            ArrayList<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        char ch = str.charAt(0);
        String restofstring = str.substring(1);

        ArrayList<String> tempresult = getSubsequence(restofstring);
        
        ArrayList<String> finalans = new ArrayList<>();

        for(int i = 0; i < tempresult.size(); i++){
            finalans.add(tempresult.get(i) + ch);
        }

        for(int i = 0; i < tempresult.size(); i++){
            finalans.add(tempresult.get(i) + "");
        }

        return finalans;
    }
}
