import java.util.*;

public class sumofroundnumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n  = scn.nextInt();
            // int m  = scn.nextInt();
        
            printround(n);
        }
        scn.close();
        
    }

    public static void printround(int n){
        int mulfactor = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0){
            int rem = n%10;
            n = n/10;
            int ans = rem*mulfactor;
            if(ans != 0){
                arr.add(ans);
                // System.out.print(ans+" ");
            } 
            mulfactor *= 10;

        }
        System.out.println(arr.size());
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    } 
}
