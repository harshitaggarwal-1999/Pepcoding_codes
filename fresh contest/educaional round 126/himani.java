import java.util.*;

import javax.swing.DebugGraphics;

public class himani {

    public static String maximiser(String str, int swaps) {
        int[] ans = new int[str.length()];
        int ansidx = ans.length - 1;
        
        int a = Integer.parseInt(str);
        while (a != 0) {
            int quo = a / 10;
            int rem = a % 10;
            ans[ansidx] = rem;
            a = quo;
            ansidx--;
        }
        String ansstr = maximizeArray(ans, ans.length, swaps);
        return ansstr;
    }

    public static void swapMax(int[] arr, int tp,
            int cp) {
        int an = 0;
        for (int i = cp; i > tp; i--) {
            an = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = an;
        }
    }

    public static String maximizeArray(int[] arr, int n, int swps) {
        int arrsum = 0;
        for(int i =0;i < arr.length; i++){
            arrsum += arr[i];
        }
        if(arrsum == 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            return sb.toString();
        }

        if (swps == 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            return sb.toString();
        }

        for (int i = 0; i < n; i++) {
            int mi = 0, mx = Integer.MIN_VALUE;
            int lt = 0;
            if((swps+i) > n){
                lt = n;
            }else{
                lt = swps+i;
            }

            for (int j = i; j <= lt; j++) {
                if (arr[j] > mx) {
                    mx = arr[j];
                    mi = j;
                }
            }

            swps -= (mi - i);
            swapMax(arr, i, mi);
            if (swps == 0)
                break;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int swaps = scn.nextInt();
        String ansstr = maximiser(str, swaps);
        System.out.println(ansstr);
    }
}

