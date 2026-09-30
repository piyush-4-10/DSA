class Solution {
     List<String> ans = new ArrayList<>();
    void fun(int n, String s, int po, int pc){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(po < n){
            fun(n,s+"(",po+1,pc);
        }
        if(pc < po){
            fun(n,s+")",po,pc+1);
        }

    }
   
    public List<String> generateParenthesis(int n) {
         fun(n,"",0,0);
         return ans;
    }
}