class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        if(nums[0]>=0){
            for(int i=0; i<n; i++){
                nums[i] = nums[i]*nums[i];
            }
            return nums;
        }
        if(nums[n-1]<=0){
            int[] a = new int[n];
            int j = n-1;
            for(int i=0; i<n; i++){
                a[j] = nums[i]*nums[i];
                j--;
            }
            return a;
        }
        int idx=0;
        for(int i=1; i<n; i++){
            if(i==n-1){
                if(Math.abs(nums[i-1])>nums[i]){
                    idx = i;
                }
            }
            else if(Math.abs(nums[i])<=Math.abs(nums[i-1]) && Math.abs(nums[i])<=nums[i+1]){
                int x = Math.abs(nums[i]);
                int y = Math.abs(nums[i-1]);
                int z = Math.abs(nums[i+1]);  
                // System.out.println("Math.abs(nums[i])"+ x + " Math.abs(nums[i-1])"+ y + " Math.abs(nums[i+1])"+ z);
                idx = i;
                break;
            }
        }
        // System.out.println("idx:"+idx);
        int k=0, i=idx-1, j=idx;
        int[] a = new int[n];
        while(i>=0 && j<n){
            if(Math.abs(nums[i])>nums[j]){
                a[k] = nums[j];
                j++;
                k++;
            }
            else{
                a[k] = nums[i];
                i--;
                k++;
            }
        }
        while(i>=0){
            a[k] = nums[i];
            i--;
            k++;
        }
        while(j<n){
            a[k] = nums[j];
            k++;
            j++;
        }
        for(i=0; i<n; i++){
            a[i] = a[i]*a[i];
        }
        return a;
    }
}