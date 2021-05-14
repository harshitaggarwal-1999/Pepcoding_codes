// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class letterrearanging{
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scn.nextInt();
        
        while(t-- > 0){
            solve();
        }
    }  

    
    
    public static void solve() {
        // write your code here

        String str = scn.next();

        boolean ispal = pal(str);
        if(!ispal){
            System.out.println(str);
            return;
        }else{
            int idxone = 0;
            int idxtwo = -1;
            for(int i = 1; i < str.length()-1; i++){
                if(str.charAt(i) != str.charAt(idxone)){
                    idxtwo = i;
                    break;
                }
            }
            if(idxtwo == -1)System.out.println(-1);
            else{
                String ans = swap(str,0,idxtwo);
                System.out.println(ans);
            }
        }

    }
    public static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        str = String.valueOf(ch);
        return str;
    }

    public static boolean pal(String str){
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev+= str.charAt(i);
        }

        boolean ans= true; 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)!= rev.charAt(i)){
                ans = false;
                break;
            }
        }

        return ans;
    }
}
