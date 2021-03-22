import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> smallans = new ArrayList<>();
            smallans.add("");
            return smallans; 
        }


        ArrayList<String> smallans = gss(str.substring(1));
        char currchar = str.charAt(0);
        ArrayList<String> finalans = new ArrayList<>();
        for(int i  = 0 ; i < smallans.size(); i++){
            finalans.add(""+smallans.get(i));
        }

        for(int i = 0; i < smallans.size(); i++){
            finalans.add(currchar+smallans.get(i));
        }

        return finalans;
    }

}