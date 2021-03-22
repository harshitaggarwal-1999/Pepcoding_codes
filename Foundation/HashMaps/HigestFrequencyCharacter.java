import java.io.*;
import java.util.*;

public class HigestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        
        HashMap<Character,Integer> mymap = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);

            if(mymap.containsKey(currchar)){
                mymap.put(currchar,mymap.get(currchar)+1);
            }

            else{
                mymap.put(currchar,1);
            }
        }

        int max = 0;
        char maxfrchar = 'a';

        for(char currchar : mymap.keySet()){
            if(mymap.get(currchar)>max){
                max = mymap.get(currchar);
                maxfrchar = currchar;
            }

        }

        System.out.println(maxfrchar);


    }

}