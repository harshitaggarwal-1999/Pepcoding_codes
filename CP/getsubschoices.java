import java.util.*;
public class getsubschoices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printss(str,"");
    }

    public static void printss(String str,String subseq){
        if(str.length() == 0){
            System.out.println(subseq);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printss(ros,subseq+ch);
        printss(ros, subseq+"");
    }


}
