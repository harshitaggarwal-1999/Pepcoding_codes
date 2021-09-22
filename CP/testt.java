import java.util.*;

public class testt{
    class Parent{
        int i = 0; 
        public Parent(String str){
            i = 1;
        }
    }


    class Sub extends Parent{
        public Sub(String str){
            i = 2;
        }

        public static void main(String[] args){
            Parent sub = new Sub("Hello");
            System.out.println(sub.i);
        }
    }
}