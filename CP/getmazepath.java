import java.util.*;

public class getmazepath{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int sr = 0;
        int sc = 0;

        int dr = n-1;
        int dc =m-1;

        List<String> ans = getpath(sr,sc,dr,dc);
        System.out.println(ans);
    }

    public static List<String> getpath(int sr,int sc,int dr,int dc){

        if(sr>dr || sc>dc){
            return new ArrayList<>();
        }
        if(sr == dr && sc == dc){
            ArrayList<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        List<String> tempans1 = getpath(sr+1, sc, dr, dc);
        List<String> tempans2 = getpath(sr,sc+1,dr,dc);

        List<String> finalans =  new ArrayList<>();

        for(int i = 0; i < tempans2.size() ;i++){
            finalans.add('h'+tempans2.get(i));
        }
        for(int i = 0; i < tempans1.size() ;i++){
            finalans.add('v'+tempans1.get(i));
        }
        // System.out.println(finalans);
        return finalans;
    }
}