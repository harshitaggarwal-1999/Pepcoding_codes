// find first non-repeating char in the string
// // find first non-repeating char in the string
// adgaxbcdgy

import java.util.*;

public class 1{
    public static void main(String[] args) {
// 
        String str = "abab";

        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < str.length; i++){
            if(mp.containsKey(str.charAt(i)){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }    

            else{
                mp.put(str.charAt(i),1);
            }
        }

        // last ir=teration

        for(int i = 0 ; i < str.length(); i++){
            if(mp.get(str.charAt(i))==1){
                System.out.println( str.charAt(i));
                return ;
            }
        }

        System.out.print("no element is found with value 1");
    }
}