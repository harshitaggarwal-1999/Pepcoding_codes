import java.io.*;
import java.util.*;

public class getCommonElements_2{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    HashMap<Integer,Integer> map = new HashMap<>();

    int n1 = scn.nextInt();
    int[] a1 = new int[n1];
    for(int i = 0; i < n1; i++){
        a1[i] = scn.nextInt();
        if(map.containsKey(a1[i])){
            map.put(a1[i],map.get(a1[i])+1);
        }else{
            map.put(a1[i],1);
        }
    }

    

    int n2 = scn.nextInt();
    int[] a2 = new int[n2];
    for(int i = 0; i < n2; i++){
        a2[i] = scn.nextInt();
    }

    

    for(int i = 0; i < n2; i++){
        int currint = a2[i];

        if(map.containsKey(currint) == true && map.get(currint)>=1){
            System.out.println(currint);
            map.put(currint,map.get(currint)-1);

        }
    }    
 }

}




// 7
// 1
// 1
// 2
// 2
// 2
// 3
// 5
// 7
// 1
// 1
// 1
// 2
// 2
// 4
// 5