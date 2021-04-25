import java.util.*;
import java.io.*;
import java.lang.Math; 

public class basicDiplomacy{
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int m = scn.nextInt();

            HashMap<Integer,Integer> mymap = new HashMap<>();
            for(int i = 1; i <= n; i++){
                mymap.put(i,0);
            }
            // System.out.println(mymap);
            float temp =(float) m/2;
            int ceilvalue = (int)Math.ceil(temp);
            int lastvaluemarked  = Integer.MIN_VALUE;
            int lastmissed = Integer.MIN_VALUE;
            ArrayList<Integer> ansarr = new ArrayList<>();
            for(int i = 0; i < m; i++){
                int availfriends = scn.nextInt();
                boolean markedfortheday = false;
                for(int j = 0; j < availfriends; j++){
                    int idx = scn.nextInt();
                    if(idx == lastvaluemarked && j < availfriends-1){
                        lastmissed = idx;
                        continue;
                    }
                    if(!markedfortheday && mymap.containsKey(idx)){
                        markedfortheday = true;
                        ansarr.add(idx);
                        lastvaluemarked = idx;
                        mymap.put(idx,mymap.get(idx)+1);
                        // System.out.println(mymap);
                        if(mymap.get(idx) >= ceilvalue){
                            mymap.remove(idx);
                        }
                    }
                    if(!markedfortheday && mymap.containsKey(lastmissed)){
                        markedfortheday = true;
                        ansarr.add(lastmissed);
                        lastvaluemarked = lastmissed;
                        mymap.put(lastmissed,mymap.get(lastmissed)+1);
                        // System.out.println(mymap);
                        if(mymap.get(lastmissed) >= ceilvalue){
                            mymap.remove(lastmissed);
                        }
                    }
                }

            }

            if(ansarr.size() == m){
                System.out.println("YES");
                for(int i = 0; i < ansarr.size(); i++){
                    System.out.print(ansarr.get(i)+ " ");
                }
                System.out.println("");

            }else{
                System.out.println("NO");
            }
        }
    }
}