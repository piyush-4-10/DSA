class Solution {
    int[][] dp = new int [1002][1002];
    int fun(int i, int j, String s, String t){
        if(i >= s.length() || j >= t.length()) return 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = 1 + fun(i+1,j+1,s,t);
        }
        int a = fun(i+1,j,s,t);
        int b = fun(i,j+1,s,t);

        return dp[i][j] = Math.max(a,b);
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        dp = new int [word1.length()][word2.length()];

        for(int i = 0; i< word1.length(); i++){
            for(int j = 0; j < word2.length();j++){
                dp[i][j] = -1;
            }
        }
        return n+m-2*fun(0,0,word1,word2);

    }
}