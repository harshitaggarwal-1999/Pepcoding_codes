import java.util.*;
public class printrecursion {
    public static void printdec(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if (n==0)return;
        printinc(n-1);
        System.out.print(n+" ");

    }
    public static void printboth(int n){
        if(n==0)return;
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);
    } 
    public static void main(String[] args){
        printinc(6);
        System.out.println();
        printdec(6);
        System.out.println();
        printboth(6);

    }
}
