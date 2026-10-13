class Solution {
    int[][] dp = new int[201][201];
    public int minimumTotal(List<List<Integer>> triangle) {
        
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                dp[i][j] = -9999999;
            }
        }
            return fun(0,0,triangle);
        }
    
    int fun(int i, int j, List<List<Integer>> grid){
        int n = grid.size();

        if(dp[i][j]!=-9999999) return dp[i][j];

        if(i == n-1){
            return grid.get(i).get(j);
        }

        int x = grid.get(i).get(j) + fun(i+1,j,grid);
        int y = grid.get(i).get(j) + fun(i+1,j+1,grid);

        return dp[i][j]= Math.min(x,y);
    }
}