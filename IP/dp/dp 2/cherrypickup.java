class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int ans  = cherry(grid, 0,0,0,0, new Integer[n][m][n][m]);
        if(ans == Integer.MIN_VALUE){
            return 0;
        }else
            return ans;
    }

    public int cherry(int[][] grid, int row1, int col1, int row2, int col2, Integer[][][][] dp){

        if(row1 >= grid.length || row2 >= grid.length || col1 >= grid[0].length || col2 >= grid[0].length || grid[row1][col1] == -1 || grid[row2][col2] == -1){
            return Integer.MIN_VALUE;
        }

        if(dp[row1][col1][row2][col2] != null){
            return dp[row1][col1][row2][col2];
        }

        if(row1 == grid.length-1 && col1 == grid[0].length-1 && row2 == grid.length-1 && col2 == grid[0].length-1){
            return grid[row1][col1];
        }

        

        int ans = 0;

        if(row1 == row2 && col1 == col2){
            ans = grid[row1][col1];
        }else{
            ans = grid[row1][col1] + grid[row2][col2];
        }

        int temp1 = cherry(grid, row1, col1+1, row2, col2+1, dp); // R R
        int temp2 = cherry(grid, row1+1, col1, row2+1, col2, dp); // D D
        int temp3 = cherry(grid, row1, col1+1, row2+1, col2, dp); // R D
        int temp4 = cherry(grid, row1+1, col1, row2, col2+1, dp); // D R

        int max = Math.max(Math.max(temp1,temp2), Math.max(temp3, temp4));

        if(max == Integer.MIN_VALUE){
            dp[row1][col1][row2][col2] = Integer.MIN_VALUE;
            return Integer.MIN_VALUE;
        }else{
            dp[row1][col1][row2][col2] = ans+ max;
            return ans+max;
        }
    }
}
