class Solution {
    public int removeDuplicates(int[] nums) {
//        int c = 0;
//         if(nums.length>0){
//             c++;
//         }
//         for (int i = 0; i < nums.length - 1; i++) {
//             int k = 1;
//             while ((i + k < nums.length) && (nums[i] == nums[i + k])) {
//                 k++;
//             }
//             if(k>1){
//                 if (i + k < nums.length) {
// //                    nums[i + 1] = nums[i + k];
// //                    if (i + k < nums.length-1){
// //                        nums[i + k]=nums[i + k + 1];
// //                    }
//                     for(int j = i+1; j<nums.length-1; j++){
//                         if(j + k -1 < nums.length)
//                             nums[j] = nums[j+k-1];
//                     }
//                 }
// //                i = i+k;
//             }
// //            else{
// //                i++;
// //            }
//         }
//         for (int i = 0; i < nums.length - 1; i++){
//             if (nums[i] > nums[i + 1]){
//                 break;
//             }
//             if((nums[i] != nums[i + 1]) && (nums[i] < nums[i + 1])){
//                 c++;
//             }
//         }
//             return c;
        int n=nums.length, cur=0;
        // if(n>0){
        //     cnt++;
        // }
        for(int i=1; i<n; i++){
            if(nums[i] != nums[cur]){
                nums[++cur] = nums[i];
                // cnt++;
            }
        }
        return ++cur;
    }
}