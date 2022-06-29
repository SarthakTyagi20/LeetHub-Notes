class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        int[] dp = new int[arr.length]; 
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        int x = f(arr, start, dp);
        return (x==1);
    }
    public int f(int[] arr, int idx, int[] dp){
        if(idx<0 || idx>=arr.length){
            return 0;
        }
        if(arr[idx]==0){
            return 1;
        }
        if(dp[idx]!=-1){
            if(dp[idx]==-2){
                return 0;
            }
            return dp[idx];
        }
        dp[idx] = -2;
        return dp[idx] = Math.max(f(arr, idx-arr[idx], dp), f(arr, idx+arr[idx], dp));        
    }
}