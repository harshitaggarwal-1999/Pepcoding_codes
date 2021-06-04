import java.util.*;
import java.io.*;

public class mainansA{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str =scn.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='a'||  str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
                int mul = i*5;
                int val = 0;
                if(mul%2 == 0)
                {
                    int n = mul/2;
                    val  = (n*(2 + (n-1)*2))/2;
                }
                else
                {
                    int n = (mul-1)/2;
                    n++;
                    val  = (n*(2 + (n-1)*2))/2;
                }
                int final_index = reduce(val);
                
                String newName = str.substring(0,i)+ final_index +str.substring(i+1);
                str = newName;
            }
        }
        if (count == 0)System.out.println(-1);
        else System.out.println(str);
    }
    public static int reduce(int num){
        if(num>=0 && num<=9)return num;

        int sum=0;
        while(num > 0)
        {
            sum+=(num%10);
            num/=10;
        } 
        num=sum; 
        return reduce(num);       
        
    }

    
}

    

