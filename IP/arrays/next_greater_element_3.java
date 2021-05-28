import java.util.*;

public class next_greater_element_3 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        String str = String.valueOf(n);
        
        int smallestvalueidx = -1;

        // smallest value idx ko fetch karna hai
        for(int i = str.length() - 2; i >= 0; i--){
            if(str.charAt(i) < str.charAt(i+1)){
                smallestvalueidx = i;
                break;
            }
        }
        if(smallestvalueidx == -1)return -1;
    
        // aab smallest value idx ke right me se usse just bigger value fetch karke lao
        int idxofvaluewillbegettingswapped = str.length()-1;
//         iss loop ko smallestvalueidx+1 -> end tak nahi le ja sakte kyuki ye fail ho jaega as ho sakta hai kahi pr vo smaller value mile hi nahi to hum usme default value yaani str.length()-1 ka use kar lenge and vo bhi galat ho jaega as ho sakta hai vo dono value same ho like smallestidx ki value = 2 ho and str.legth()-1 pr rahi value bhi 2 ho to hum koi change nahi kar rhe aur sort karke posibly aur chota no. bana rhe hai. too loop ulta lagao 
        for(int j = str.length()-1; j >= 0; j--){ 
            if((str.charAt(smallestvalueidx) < str.charAt(j))){
                idxofvaluewillbegettingswapped = j;
                break;
            }
        }

        // swap
        int i = smallestvalueidx;
        int j = idxofvaluewillbegettingswapped;
        
        char[] swaphelper = str.toCharArray();
        char ch = swaphelper[i];
        swaphelper[i] = swaphelper[j];
        swaphelper[j] = ch;
    
        // sort 
        Arrays.sort(swaphelper, i+1, str.length());
        str = String.valueOf(swaphelper);
        long val=Long.valueOf(str);
        return val<=Integer.MAX_VALUE ? (int)val : -1;
       
    }
    
}
