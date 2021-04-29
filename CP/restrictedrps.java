/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class restrictedrps {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    int n = scn.nextInt();
		    int arock= scn.nextInt();
		    int apap =scn.nextInt();
		    int asci = scn.nextInt();
		    
		    
		    String str = scn.next();
		    
		    int brock = 0;
		    int bpap = 0;
		    int bsci = 0;
		    
		    for(int i = 0 ;i < str.length(); i++){
		        if(str.charAt(i) == 'R')brock++;
		        if(str.charAt(i) == 'S')bsci++;
		        if(str.charAt(i) == 'P')bpap++;
		    }
		    
		    int wins = 0;
		    
		    int frock = Math.min(bsci, arock);
		    int fpap = Math.min(brock, apap);
		    int fsci =  Math.min(bpap, asci);
		    
            // System.out.println("fsci: "+ fsci);
            // System.out.println("fpap: "+ fpap);
            // System.out.println("frock: "+ frock);
		    wins+=fsci;
		    wins+=fpap; 
		    wins+=frock;
            // System.out.println("Wins: "+ wins);
		    double check =(double)n/2; 
            // System.out.println("n/2: "+ check);
		    if(wins < Math.ceil(check)){
		        System.out.println("NO");
		        continue;
		    }
		    
		    else{
		        
		        arock-=frock;
		        apap-=fpap;
		        asci-=fsci;
		        System.out.println("YES");
		        for(int i=0;i<str.length();i++)
		        {
		            if(str.charAt(i)=='P')
		             { if(fsci > 0)
		                 {
		                   System.out.print("S");
		                   fsci--;
		                 }
		                 else
		                 {
		                     if(asci > 0)
		                     {
		                     System.out.print("S");
		                   asci--;
		                         
		                     }
		                     else if(apap > 0)
		                     {
		                      System.out.print("P");
		                   apap--;
		                         
		                     }
		                     else if(arock >0)
		                     {
		                      System.out.print("R");
		                   arock--;
		                         
		                     }
		                 }
		             }
		             else  if(str.charAt(i)=='R')
		             { if(fpap > 0)
		                 {
		                   System.out.print("P");
		                   fpap--;
		                 }
		                 else
		                 {
		                     if(asci > 0)
		                     {
		                     System.out.print("S");
		                   asci--;
		                         
		                     }
		                     else if(apap > 0)
		                     {
		                      System.out.print("P");
		                   apap--;
		                         
		                     }
		                     else if(arock >0)
		                     {
		                      System.out.print("R");
		                   arock--;
		                         
		                     }
		                 }
		             }
		             else  
		             { 
		                 if(frock > 0)
		                 {
		                   System.out.print("R");
		                   frock--;
		                 }
		                 else
		                 {
		                     if(asci > 0)
		                     {
		                     System.out.print("S");
		                   asci--;
		                         
		                     }
		                     else if(apap > 0)
		                     {
		                      System.out.print("P");
		                   apap--;
		                         
		                     }
		                     else if(arock >0)
		                     {
		                      System.out.print("R");
		                   arock--;
		                         
		                     }
		                 }
		             }
		             
		        }
		        System.out.println();
		        
		        
		        
		    }
		    
		    
		}
		
	}
}