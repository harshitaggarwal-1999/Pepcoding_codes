
import java.util.*;
import java.io.*;

public class vasub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for(int  i = 0; i < n; i++){
            arr[i] = scn.nextLong();
        }
        long[] ans = temperature(arr);
        
        for(int  i = 0; i < n; i++){
            System.out.print(ans[i]+ " ");
        }
        

    }
    public static long[] temperature(long[] arr) {
        long[] result = new long[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int index = st.pop();
                result[index] = i - index;
            }
            st.push(i);
        }
        return result;
    }
}



