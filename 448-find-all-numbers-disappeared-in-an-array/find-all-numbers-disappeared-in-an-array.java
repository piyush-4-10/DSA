class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> num = new ArrayList();
        int n = nums.length;
        int j = 1, i = 0;
        
        while(j <= n){
            if(i<n && nums[i] < j){
                i++;
            }else if(i < n && nums[i] == j){
                i++;
                j++;
            }else{
                num.add(j);
                j++;
            }
        }
        return num;
    }
}