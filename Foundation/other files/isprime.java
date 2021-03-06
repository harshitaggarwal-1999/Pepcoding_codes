import java.util.*;

public class isprime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print57("enter the no.: ");
        int n = scn.nextInt();

        boolean isprimee = true;
        for (int i = 2; i <= Math.sqrt(n); i++){ //optimisation that the factors of an no. cant be greater than square root of the no. e.g. 10 has  2 5 which is less than or equal to sqare root of 10 which is 3.
            if(n % i == 0){
                isprimee = false;
                break;
            }
        }
        if(isprimee){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }


    }
    
}
