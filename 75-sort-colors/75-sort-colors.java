class Solution {
    public void sortColors(int[] nums) {
        int z=0, o=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                z++;
            if(nums[i] == 1)
                o++;
            // if(nums[i] == 2)
            //     t++;            
        }
        for(int i=0; i<nums.length; i++){
            if(z>0){
                nums[i]=0;
                z--;
            }
            else if(o>0){
                nums[i]=1;
                o--;
            }
            else {
                nums[i]=2;
                // t--;
            }
        }
    }
}