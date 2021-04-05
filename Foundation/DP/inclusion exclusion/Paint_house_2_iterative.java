public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCostII(int[][] costs) {
        // write your code here


        // this is O(n*k^2) approach 
        // we can inprove this by using min1 , min2, temp1, temp2


        if(costs.length == 0)return 0;

        int n = costs.length;
        int k = costs[0].length;
        int[][] dp = new int[costs.length][k];

        for(int i = 0; i <n; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

        for(int i = 0 ; i < k; i++){
            dp[n-1][i] = costs[n-1][i];
        }

        // dp[n-1][0] = costs[n-1][0];
        // dp[n-1][1] = costs[n-1][1];
        // dp[n-1][2] = costs[n-1][2];

        for(int row = n-2; row >= 0; row--){
            for(int col = 0; col < k; col++){


                for(int i = 0; i < k; i++){
                    if(i != col){
                        dp[row][col] = Math.min(dp[row][col],dp[row+1][i]);
                    }
                }


                dp[row][col] += costs[row][col];
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++){
            ans = Math.min(ans, dp[0][i]);
        }
        return ans;
            
    }


}


