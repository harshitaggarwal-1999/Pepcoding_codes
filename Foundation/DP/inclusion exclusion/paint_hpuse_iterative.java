public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
        if(costs.length == 0)return 0;

        int n = costs.length;
        int[][] dp = new int[costs.length][3];

        for(int i = 0; i <n; i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }


        // filled lower most row values as they wont change because there are no down rows so that it values can be changed
        
        dp[n-1][0] = costs[n-1][0];
        dp[n-1][1] = costs[n-1][1];
        dp[n-1][2] = costs[n-1][2];

        for(int row = n-2; row >= 0; row--){
            for(int col = 0; col < 3; col++){
                if(col == 0){
                    dp[row][col] = Math.min(dp[row+1][1],dp[row+1][2]);

                }else if(col == 1){
                    dp[row][col] = Math.min(dp[row+1][0], dp[row+1][2]);

                }else{
                    dp[row][col] = Math.min(dp[row+1][0], dp[row+1][1]);
                }

                dp[row][col] += costs[row][col];
            }
        }

        int ans = Math.min(dp[0][0],dp[0][1]);
        ans = Math.min(ans,dp[0][2]);
        return ans;
            
    }

}

// ------------------recurscive -------------------------------------
// public class Solution {
//     /**
//      * @param costs: n x 3 cost matrix
//      * @return: An integer, the minimum cost to paint all houses
//      */
//     public int minCost(int[][] costs) {
//         // write your code here
//         if(costs.length == 0)return 0;
//         return mincosthelp(-1,-1,costs,new int[costs.length][3]);
        

//     }

//     public int mincosthelp(int row, int col, int[][] costs, int[][] dp){
//         if(row == costs.length-1)return costs[row][col];

//         if(row > 0 && dp[row][col] != 0){
//             return dp[row][col];
//         }

//         int cost = Integer.MAX_VALUE;

//         for(int k = 0; k < 3; k++){
//             if(k != col){
//                 int temp  = mincosthelp(row+1, k, costs,dp);

//                 cost = Math.min(cost,temp);
//             }
//         }

//         if(row < 0)return cost;
//         else{
//             dp[row][col] = costs[row][col]+cost;
//             return costs[row][col]+cost;
//         } 
//     }

