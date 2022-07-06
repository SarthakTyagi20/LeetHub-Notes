class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, c=0, idx=-1;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                c++;
                if(idx==-1)
                    idx=i;
            }
        }
        if(c==0)
            return n;
        int i=idx, j=idx+1;
        while(j<n && nums[j]==val)
            j++;
        while(j<n && i<n){
            while(j<n && nums[j]==val)
                j++;
            if(j<n)
                nums[i] = nums[j];
            // System.out.println("2 i:"+i+" j:"+j);
            i++;
            j++;
            // if(nums[i]==val && nums[j]!=val){
            //     nums[i]=nums[j];
            //     // System.out.println("1 i:"+i+" j:"+j);
            //     j++;
            //     while(j<n && nums[j]==val)
            //         j++;
            //     i++;
            // }
            // else if(nums[j]!=val){
            //     nums[i] = nums[j];
            //     // System.out.println("2 i:"+i+" j:"+j);
            //     i++;
            //     j++;
            // }
            // else{
            //     while(j<n && nums[j]==val)
            //         j++;
            //     if(j<n){
            //         nums[i] = nums[j];
            //         // System.out.println("3 i:"+i+" j:"+j);
            //         i++;
            //         j++;
            //     }
            // }
        }
        return n-c;
    }
}