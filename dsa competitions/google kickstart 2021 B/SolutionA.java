import java.util.*;
import java.io.*;

//System.out.println();
class SolutionA {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int casecount = 1;
        while(t-->0) {
            int n = scn.nextInt();
            String waste  = scn.nextLine();
            String str = scn.nextLine();
            int prev = 0;
            int curr = 0;
            int count = 1;
            System.out.print("Case #"+casecount+": ");
            for(int i = 0; i < n; i++){
                if(i == 0){
                    prev =(int) str.charAt(i);
                    System.out.print(count+" ");
                    continue;
                }else{
                    curr = (int)str.charAt(i);
                    if(prev < curr){
                        count++;
                        System.out.print(count+ " ");
                    }else{
                        count = 1;
                        System.out.print(count+ " ");
                    }
                    prev =(int) curr;
                }
                
            }
            System.out.println();
            casecount++;
        }
    }
}