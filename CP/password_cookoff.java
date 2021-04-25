import java.util.*;
import java.io.*;

public class password_cookoff{
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        int t = Integer.parseInt(scn.nextLine());

        while(t > 0){
            String password = scn.nextLine();

            int smallchararray = 0; 
            int largechararray = 0;
            int specialchararray = 0;
            int numbersarray = 0;

            // System.out.println(password.length());

            char firstletter = password.charAt(0); 
            char lastletter = password.charAt(password.length()-1);

            int asciifirst = firstletter;
            int asciilast = lastletter;

            if(asciifirst > 96 && asciifirst < 123){
                smallchararray++;
            }

            if(asciilast > 96 && asciilast < 123){
                smallchararray++;
            }
            
            if(password.length() < 10){
                System.out.println("NO");
                t--;
                continue;
                
            }

            // if((password.length() > 1) && (asciifirst < 123 && asciifirst > 96)&& (asciilast < 123 && asciilast > 96)){
            

                for(int i = 1; i < password.length()-1; i++){
                    char currletter = password.charAt(i);

                    int asciicurrletter = currletter;

                    if(asciicurrletter > 47 && asciicurrletter < 58){
                        numbersarray++;
                    } else if(asciicurrletter > 64 && asciicurrletter < 91){
                        largechararray++;
                    }else if(asciicurrletter > 96 && asciicurrletter < 123){
                        smallchararray++;
                    }else if(currletter == '@' || currletter == '#' || currletter == '&' || currletter == '?' || currletter == '%'){
                        specialchararray++;
                    }
                }

                
                if(smallchararray >=1 && largechararray >=1 && numbersarray >= 1 && specialchararray >= 1){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

            
            t--;
        }
    }
}