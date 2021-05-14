import java.util.*;

public class getmazepathwithjump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sr = 0; int sc = 0; int dr = n-1;int dc = m-1;

        List<String> ans = getpath(sr,sc,dr,dc);
        System.out.println(ans);
    }

    public static List<String> getpath(int sr,int sc,int dr,int dc){

        if(sr>dr || sc>dc){
            return new ArrayList<>();
        }
        if(sr == dr && sc == dc){
            List<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        List<String> finalans = new ArrayList<>();
        for(int i = 1;i <= dc-sc; i++){
            List<String> tempans1 = getpath(sr, sc+i, dr, dc);
            for(int j = 0; j < tempans1.size(); j++){
                finalans.add("h"+i+tempans1.get(j));
            }
        }
        for(int i = 1;i <= dr-sr; i++){
            List<String> tempans2 = getpath(sr+i, sc, dr, dc);
            for(int j = 0; j < tempans2.size(); j++){
                finalans.add("v"+i+tempans2.get(j));
            }
        }
        for(int i = 1;i <= Math.min(dc-sc,dr-sr); i++){
            List<String> tempans3 = getpath(sr+i, sc+i, dr, dc);
            for(int j = 0; j < tempans3.size(); j++){
                finalans.add("d"+i+tempans3.get(j));
            }
        }

        return finalans;
    }

}
