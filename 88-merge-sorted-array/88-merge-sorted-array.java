class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                i++;
            }
            else{
                int x = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = x;
                i++;
                if(j<n-1 && nums2[j]>nums2[j+1]){
                    Arrays.sort(nums2);
                }
            }
        }
        while(j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}