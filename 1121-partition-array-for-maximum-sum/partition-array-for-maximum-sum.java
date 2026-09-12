class Solution {
    int[][] dp = new int[501][501];
     int fun(int[] arr, int p, int i, int m, int k){
        if(i >= arr.length) return 0;
        int ans = 0;

        if(dp[i][p] != -1) {
            return dp[i][p];
        }

        m = Math.max(m,arr[i]);
        int len = i-p+1;
        if(len==k){
            int c1= (m*len)+fun(arr,i+1,i+1,0,k);
            ans = Math.max(ans,c1);
        }else{
            int c1= (m*len)+fun(arr,i+1,i+1,0,k);
            int c2 = fun(arr,p,i+1,m,k);
            ans = Math.max(ans,c1);
            ans = Math.max(ans,c2);
        }
        return dp[i][p] = ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for(int i = 0; i < 500; i++){
            for(int j = 0; j<501; j++){
                dp[i][j] = -1;
            }
        }
         return fun(arr,0,0,0,k);
     }
}