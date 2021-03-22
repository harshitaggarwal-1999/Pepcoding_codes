import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(getKPC(str));
    }

    static String[] keypad = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> smallans = new ArrayList<>();
            smallans.add("");
            return smallans;
        }

        ArrayList<String> smallans = getKPC(str.substring(1));
        char currchar = str.charAt(0);
        String currkey = keypad[currchar-'0'];
        ArrayList<String> finalans = new ArrayList<>();

        for(int i = 0; i < currkey.length(); i++){
            for(int j = 0; j < smallans.size(); j++){
                finalans.add(currkey.charAt(i)+smallans.get(j));
            }
        }

        return finalans;
    }

}