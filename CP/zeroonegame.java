// Nothing is impossible
// scoobie doobie dooooooooo
import java.util.*;
import java.io.*;

public class zeroonegame {

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
        int count0 = 0;
        int count1 = 0;


        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i)-'0' == 0)count0++;
            else count1++;
        }

        if(count1 == 0 || count0 == 0){
            System.out.println("NET");
            return;
        }
        if(count0 == 1&& count0 == 1){
            System.out.println("DA");
            return;
        }

        int turn = 0;

        for(int i = 0; i < str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if((ch1 == '0' && ch2 == '1')|| (ch1 == '1' && ch2 == '0')){
                turn++;
                i++;
            }
        }

        if(turn%2 == 1)System.out.println("NET");
        else System.out.println("DA"); 
    }
}
