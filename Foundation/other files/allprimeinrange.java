import java.util.*;

public class allprimeinrange{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i = low; i <= high; i++){
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }

            } 
            if(isprime){
                System.out.println(i);
            }
        }

        
    }
}