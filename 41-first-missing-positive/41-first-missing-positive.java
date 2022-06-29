class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int m = 1, i = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i] = n+1;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]<=0 && nums[i]>n){
                nums[i] = n+1;
            }
        }
        for(int i=0; i<n; i++){
            int x = Math.abs(nums[i]);
            if(x<=n){
                x--;
                if(nums[x]>0){
                    nums[x] = -1*nums[x];
                }
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        // ArrayList<Integer> a= new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     a.add(nums[i]);
        // }
        // for(int i=1; i<Integer.MAX_VALUE; i++){
        //     if(!a.contains(i)){
        //         return i;
        //     }
        // }
        // while(i<n && nums[i]<=0){
        //     i++;
        // }
        // if(i>=n)
        //     return m;
        // while(i<n){
        //     if(nums[i]==m){
        //         m++;
        //         i++;
        //     }
        //     else{
        //         i++;
        //     }    
        // }
        return n+1;
    }
}