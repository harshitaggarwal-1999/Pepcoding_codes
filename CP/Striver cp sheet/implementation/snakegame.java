import java.util.*;

public class snakegame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            int n  = scn.nextInt();
            int m  = scn.nextInt();
        
            printSnake(n,m);
        }
        scn.close();
        
    }

    public static void printSnake(int n, int m){
        boolean flag = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < m; j++){
                if(i%2 != 0){//odd so all snake means #
                    System.out.print("#");
                }else{// i is even
                    if(flag && j == m-1){//true means end
                        System.out.print("#");
                        // flag = !flag;
                        continue;
                    }
                    if(!flag && j == 0){// false means start
                        System.out.print("#");
                        // flag = !flag; 
                        continue;
                    }
                    System.out.print(".");

                }
            }
            if(i%2 == 0){
                flag = !flag;
            }
            System.out.println();
        }
    } 
}