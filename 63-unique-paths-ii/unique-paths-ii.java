class Solution {
    int[][] dp = new int[101][101];
     int fun(int i, int j, int[][] obstacleGrid, int n, int m){
    if(i>=n || j>=m || i<0 || j<0 || obstacleGrid[i][j]==1) return 0;
    if(i==n-1 && j==m-1) return 1;

    if(dp[i][j] != -1) return dp[i][j];

    int c1 = fun(i+1,j,obstacleGrid,n,m);
    int c2 = fun(i,j+1,obstacleGrid,n,m);

    dp[i][j] = c1+c2;
    return c1+c2;
     }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;

        if(obstacleGrid[0][0]==1 || obstacleGrid[n-1][m-1]==1) return 0;

        for (int[] row : dp) Arrays.fill(row, -1);  
      
        return fun(0,0,obstacleGrid,n,m);
    }
}