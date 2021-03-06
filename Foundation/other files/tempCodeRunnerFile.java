import java.util.*;
public class Main{
    public static void main(String[] args) {
        int n = 20;
        if(n < 10) {
            System.out.println("smaller than 10");
        } else if (n < 15 && n > 10){
            System.out.println("greater than 10 but less tha 15");
        }else {
            System.out.println("greater than 15");
        }
    }
}