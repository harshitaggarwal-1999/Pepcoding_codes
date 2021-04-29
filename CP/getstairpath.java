import java.util.*;

import javax.print.DocFlavor.STRING;

import java.io.*;
import java.lang.reflect.Array;

public class getstairpath{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        
        List<String> ans = getstpath(i);

        System.out.println(ans);
    }

    public static List<String> getstpath(int i) {
        if(i < 0){
            return new ArrayList<>();
        }
        if(i == 0){
            ArrayList<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        
        List<String> tempans1 =  getstpath(i-1);
        List<String> tempans2 =  getstpath(i-2);
        List<String> tempans3 =  getstpath(i-3);


        List<String> finalans = new ArrayList<>();
        for(int idx = 0; idx < tempans1.size(); idx++){
            finalans.add('1'+tempans1.get(idx));
        }

        for(int idx = 0; idx < tempans2.size(); idx++){
            finalans.add('2'+tempans2.get(idx));
        }

        for(int idx = 0; idx < tempans3.size(); idx++){
            finalans.add('3'+tempans3.get(idx));
        }

        return finalans;

    }
}