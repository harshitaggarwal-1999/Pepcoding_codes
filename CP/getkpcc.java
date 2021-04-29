import java.util.*;

public class getkpcc{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        List<String> ans = getkpc(str);
        System.out.println(ans);
    }

    static String[] keypad = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static List<String> getkpc(String str){

        if(str.length() == 0){
            List<String> tempans = new ArrayList<>();
            tempans.add("");
            return tempans;
        }
        char ch = str.charAt(0);
        List<String> tempans = getkpc(str.substring(1));

        List<String> finalans = new ArrayList<>();

        String currstring = keypad[ch-'0'];
        
        for(int i = 0; i < currstring.length(); i++){
            for(int j = 0; j < tempans.size(); j++){
                finalans.add(currstring.charAt(i)+tempans.get(j));
            }
        }

        return finalans;
    }
}

