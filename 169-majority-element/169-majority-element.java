class Solution {
    public int majorityElement(int[] nums) {
        int c=1, m = nums[0], n= nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]==m){
                c++;
            }
            else{
                c--;
                if(c<=0){
                    m = nums[i];
                    c=1;
                }
            }
        }
        return m;
    }
}