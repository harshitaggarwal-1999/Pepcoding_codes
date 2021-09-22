
import java.util.Arrays;
 
public class newww {
 
    // Function to count the number of tower
    static int number_of_tower(int hss[], int rng, int num)
    {
 
        
        Arrays.sort(hss);
 
        
        int numOfTower = 0;
 
        
        int i = 0;
        while (i < num) {
 
            
            numOfTower++;
 
            
            int loc = hss[i] + rng;
 
            
            while (i < num && hss[i] <= loc)
                i++;
 
            
            --i;
 
            
            loc = hss[i] + rng;
 
           
            while (i < num && hss[i] <= loc)
                i++;
        }
 
       
        return numOfTower;
    }
 
 
     
    public static void main(String args[])
    {
       
        int hss[] = { 7, 2, 4, 6, 5, 9, 12, 11 };
        int rng = 2;
        int num = hss.length;

        System.out.println(number_of_tower(hss, rng, num));
    }
    
}

