import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        fans = 1;
        int temp = LIS(nums, nums.length-1,new int[nums.length]);
        return fans;
    }
    
    int fans;


    public int LISiter(int[] arr){
        int [] dp = new int[arr.length];

        Arrays.fill(dp, 1);

        int ans = 1;

        for(int ei = 1; ei < arr.length; ei++){
            for(int si = 0; si < ei; si++){
                if(arr[ei] > arr[si]){
                    dp[ei] = Math.max(dp[ei],dp[si]+1);
                }
            }
            ans = Math.max(ans,dp[ei]);
        }

        return ans;
    }
    
    public int LIS(int[] nums, int ei, int[] dp){
        if(ei == 0)return 1;
        
        if(dp[ei] != 0)return dp[ei];
        
        int omax = 1;// as per no. ek to LIS to hoga hi
        
        for(int si = 0; si < ei; si++){
            int ans = LIS(nums, si, dp);
            
            if(nums[si] < nums[ei] && ans+1 > omax){
                omax = ans + 1;
            }
            
        }
        
        fans = Math.max(omax,fans);
        dp[ei] = omax;
        return omax;
    }
}