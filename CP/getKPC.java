import java.io.*;
import java.util.*;

public class getKPC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // ArrayList <String> ans = getKPC(str);
        // System.out.println(ans);
        getKPC(str,"")      ;

    } 

    static String[] keypad = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    // public static ArrayList<String> getKPC(String str) {
    //     if(str.length()==0){
    //         ArrayList<String> tempans = new ArrayList<>();
    //         tempans.add("");
    //         return tempans;
    //     }
        // char ch = str.charAt(0);
        
        // String ros = str.substring(1);

        // String possiblechar = keypad[ch-'0'];
    //     ArrayList<String> tempres = getKPC(ros);
    //     ArrayList<String> finalans = new ArrayList<>();

    //     for(int i = 0; i < possiblechar.length(); i++){
    //         for(int j = 0; j < tempres.size(); j++){
    //             finalans.add(possiblechar.charAt(i)+tempres.get(j));
    //         }

    //     }

    //     return finalans;
    // }
    public static void getKPC(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        
        String ros = str.substring(1);

        String possiblechar = keypad[ch-'0'];

        for(int i = 0 ; i < possiblechar.length(); i++){
            getKPC(ros, ans+);
        }

    }
}
