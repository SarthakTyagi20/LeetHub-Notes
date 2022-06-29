class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while(i>=0 && j>=0){
            System.out.println("i:"+i + " j:"+j);
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(i>=0){
            System.out.println("i:"+i);
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            System.out.println(" j:"+j);
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         i++;
        //     }
        //     else{
        //         int x = nums1[i];
        //         nums1[i] = nums2[j];
        //         nums2[j] = x;
        //         i++;
        //         if(j<n-1 && nums2[j]>nums2[j+1]){
        //             Arrays.sort(nums2);
        //         }
        //     }
        // }
        // while(j<n){
        //     nums1[i] = nums2[j];
        //     i++;
        //     j++;
        // }
    }
}