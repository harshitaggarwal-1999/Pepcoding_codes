public class Solution {
    /**
     * @param costs: n x 3 cost matrix
     * @return: An integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // write your code here
        if(costs.length == 0)return 0;
        return mincosthelp(-1,-1,costs,new int[costs.length][3]);
        

    }

    public int mincosthelp(int row, int col, int[][] costs, int[][] dp){
        if(row == costs.length-1)return costs[row][col];

        if(row > 0 && dp[row][col] != 0){
            return dp[row][col];
        }

        int cost = Integer.MAX_VALUE;

        for(int k = 0; k < 3; k++){
            if(k != col){
                int temp  = mincosthelp(row+1, k, costs,dp);

                cost = Math.min(cost,temp);
            }
        }

        if(row < 0)return cost;
        else{
            dp[row][col] = costs[row][col]+cost;
            return costs[row][col]+cost;
        } 
    }



}