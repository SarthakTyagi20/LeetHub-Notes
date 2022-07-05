class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length, cons = 0, maxl = 0;
        for(int i=0; i<n; i++)
            set.add(nums[i]);
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i]-1)){
                int x = nums[i]+1;
                while(set.contains(x))
                    x++;
                cons = x-nums[i];
                maxl = Math.max(maxl, cons);
            }
        }
//         if(n>0){
//             cons=1;
//             maxl=1;
//         }
        // for(int i=0; i<n-1; i++){
        //     if(nums[i+1]==nums[i]+1)
        //         cons++;
        //     else if(nums[i+1]==nums[i]){
        //         continue;
        //     }
        //     else{
        //         cons=1;
        //     }
        //     maxl = Math.max(maxl, cons);
        // }
        return maxl;
    }
}