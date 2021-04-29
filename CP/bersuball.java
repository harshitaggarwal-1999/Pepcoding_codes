import java.util.*;
import java.io.*;

//System.out.println();
public class bersuball {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int t = 1;
        while(t-->0) {
            int nboys = scn.nextInt();
            int[] boys = new int[nboys];
            for(int i = 0; i < nboys; i++)boys[i] = scn.nextInt();
            int ngirls = scn.nextInt();
            int[] girls = new int[ngirls];
            for(int i = 0; i < ngirls; i++)girls[i] = scn.nextInt();
            
            Arrays.sort(boys);
            Arrays.sort(girls);

            int idxby = nboys-1;
            int idxgl = ngirls-1;
            int count = 0;
            while(idxby >= 0 && idxgl >= 0){
                if(Math.abs(boys[idxby]-girls[idxgl]) <= 1){
                    idxby--;idxgl--;count++;
                    continue;
                }
                if(boys[idxby]<girls[idxgl]){
                    idxgl--;
                }
                else {
                    idxby--;
                }
            }
            System.out.println(count);


        }
    }

    public static void solve() {

    }
}