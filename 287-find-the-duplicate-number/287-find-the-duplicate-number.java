class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // int t = n*(n-1)/2;
        // int x=0;
        // for(int i=0; i<n;i++){
        //     // t-=nums[i];
        //     x = p
        // }
        // return Math.abs(t);
        int slow = nums[0], fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        fast = nums[0];
        while(fast!=slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}