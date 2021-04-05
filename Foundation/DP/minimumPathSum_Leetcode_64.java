class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][]dp = new int[row][col];
        return minpath(grid,row-1,col-1,dp);
    }
    
    public int minpath(int[][]grid, int row, int col, int[][] dp){
        if(row < 0 || col < 0)return Integer.MAX_VALUE;
        
        if(row == 0 && col == 0){
            return grid[0][0];
        }
        
        if(dp[row][col] != 0)return dp[row][col];
        
        
        
        int up = minpath(grid, row-1,col,dp);
        int left = minpath(grid, row, col-1,dp);
        
        int ans = Math.min(up,left)+grid[row][col];
        dp[row][col] = ans;
        return ans;
    }
}