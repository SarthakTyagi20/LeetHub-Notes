/*We make a hashmap having key as the elements of the input array and value as an array of size 3 such that:

0th index of each array stores the frequency of the given element
1st index stores first index in input array where the element is found
2nd index stores last index in input array where the element is found
After forming the hashmap, we iterate over the keys such that there occurence is equal to the degree and choose the least difference between the starting and end index where the element was found.*/

class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = Integer.MIN_VALUE;
        int lengthMinSubarray = Integer.MAX_VALUE;
        HashMap<Integer,Integer[]> hsh = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(hsh.get(nums[i])!=null){
                hsh.put(nums[i],new Integer[]{hsh.get(nums[i])[0]+1,hsh.get(nums[i])[1],i});
            }
            else{
                hsh.put(nums[i],new Integer[]{1,i,i});
            }
            
            if(hsh.get(nums[i])[0]>degree)
                degree = hsh.get(nums[i])[0];
        }
        
        for(int i: hsh.keySet()){
            if(hsh.get(i)[0]==degree){
                lengthMinSubarray = Math.min(lengthMinSubarray, hsh.get(i)[2] - hsh.get(i)[1] + 1);
            }
        }
        
        return lengthMinSubarray;
    }
}