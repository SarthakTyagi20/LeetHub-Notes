class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length]; 
        int n = nums.length;
        dp[0] = nums[0];
        if(n>1)
        dp[1] = Math.max(dp[0], nums[1]);
        
        for(int i=2; i<n; i++){
            int rob = nums[i] + dp[i-2];
            int notrob = dp[i-1];
            dp[i] = Math.max(rob, notrob);
        }
        return dp[n-1];
        // for(int i=0; i<nums.length; i++)
        //     dp[i] = -1;
        // return robin(nums, nums.length-1, dp);
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