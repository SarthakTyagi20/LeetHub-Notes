class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length]; 
        for(int i=0; i<nums.length; i++)
            dp[i] = -1;
        return robin(nums, nums.length-1, dp);
    }
    public int robin(int[] nums, int i, int[] dp){
        if(i<0){
            return 0;
        }
        if(i==0){
            return nums[i];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob = nums[i] + robin(nums, i-2, dp);
        int notrob = robin(nums, i-1, dp);
        return dp[i] = Math.max(rob, notrob);
    }
}