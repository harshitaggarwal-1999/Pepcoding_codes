import java.util.*;

public class chocolates {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int x = scn.nextInt();
            int[]  arr = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                int type = scn.nextInt();
                arr[i] = type;
                if(map.containsKey(type))map.put(type,map.get(type)+1);
                else map.put(type,1);
            }

            if(map.size()==n)System.out.println(n-x);
            if(x > map.size()){}
            if(x < map.size())System.out.println(map.size());
        }
    }    
}
