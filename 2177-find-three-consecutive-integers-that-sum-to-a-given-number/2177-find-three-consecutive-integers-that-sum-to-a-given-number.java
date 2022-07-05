class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        long[] ans = new long[3];
        long x = num/3;
        ans[0] = x-1;
        ans[1] = x;
        ans[2] = x+1;
        return ans;
    }
}