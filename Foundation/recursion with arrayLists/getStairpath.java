import java.io.*;
import java.util.*;

public class getStairpath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n < 0){
            return new ArrayList<>();
        }
        if(n == 0){
            ArrayList<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        ArrayList<String> tempans1 = getStairPaths(n-1);
        ArrayList<String> tempans2 = getStairPaths(n-2);
        ArrayList<String> tempans3 = getStairPaths(n-3);

        ArrayList<String> finalans = new ArrayList<>();


        for(int i= 0; i < tempans1.size(); i++){
            String currstr = "1"+tempans1.get(i);
            finalans.add(currstr);            
        }

        
        for(int i= 0; i < tempans2.size(); i++){
            String currstr = "2"+tempans2.get(i);
            finalans.add(currstr);
        }

        
        for(int i= 0; i < tempans3.size(); i++){
            String currstr = "3"+tempans3.get(i);
            finalans.add(currstr);
        }

        return finalans;


    }

}