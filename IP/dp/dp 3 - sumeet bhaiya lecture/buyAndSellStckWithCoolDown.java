class Solution {
    public int maxProfit(int[] prices) {
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i = 1; i < prices.length; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }else{
                nbsp =  obsp;   
            }

            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }else{
                nssp = ossp;
            }

            if(ossp > occp){
                nccp = ossp;
            }else{
                nccp = occp;
            }

        
        }
        return ossp;
    }
}