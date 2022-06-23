class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                int x = max;
                max = min;
                min = x;
            }
            max = Math.max(max*nums[i], nums[i]);
            min = Math.min(min*nums[i], nums[i]);
            ans = Math.max(ans, max);
        }
        // int max = Integer.MIN_VALUE;
        // int n = nums.length;
        // int pr=1, pr2=1;
        // for(int i=0; i<n; i++){
        //     pr*=nums[i];
        //     if(max<pr)
        //         max=pr;
        //     pr2*=nums[i];
        //     if(max<pr2)
        //         max=pr2;
        //     if(pr<0)
        //         pr=1;
        // }
        return ans;
    }
}