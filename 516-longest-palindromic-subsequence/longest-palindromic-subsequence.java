class Solution {
    int[][] memo;

    int fun(int i, int j, String s){
        if(i > j) return 0;
        if(i == j) return 1;

        if(memo[i][j] != -1) return memo[i][j];

        int m = 0;

        if(s.charAt(i) == s.charAt(j)){
            int a = 2 + fun(i+1,j-1,s);
            m = Math.max(m,a);
        }else{
            int a = fun(i+1,j,s);
            int b = fun(i,j-1,s);

            m = Math.max(m,a);
            m = Math.max(m,b);
        }
        memo[i][j] = m;
        return m;
    }
    
    public int longestPalindromeSubseq(String s) {
        memo = new int[s.length()][s.length()];
        for (int[] row : memo) Arrays.fill(row, -1);
         return fun(0,s.length()-1,s);
    }
}