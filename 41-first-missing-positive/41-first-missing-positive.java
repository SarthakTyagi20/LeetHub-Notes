class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int m = 1, i = 0;
        int n = nums.length;
        while(i<n && nums[i]<=0){
            i++;
        }
        if(i>=n)
            return m;
        while(i<n){
            if(nums[i]==m){
                m++;
                i++;
            }
            else{
                i++;
            }    
        }
        return m;
    }
}