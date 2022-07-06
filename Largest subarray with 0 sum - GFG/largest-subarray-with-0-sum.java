// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)    {
        // Your code here
        // int[][] dp = new int[n+1][n+1];
        // int l=0, max=0;
        // for(int i=0; i<n; i++){
        //     int sum=arr[i];
        //     for(int j=i+1; j<n; j++){
        //         // dp[i][j]=-1;
        //         sum+=arr[j];
        //         if(sum==0){
        //             l=j-i+1;
        //             max=Math.max(max, l);
        //         }
        //     }
        // }
        // int x = f(arr, n, 0, 0, 0, dp);
        // if(x>0){
        //     x++;
        // }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, l=0, maxl=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(arr[i]==0 && maxl==0)
                maxl++;
            if(map.containsKey(sum)){
                // int j = map.get(sum);
                // if(j>=0)
                //     l=i-map.get(sum-arr[j]);
                // else
                    l=i-map.get(sum);
                if(sum==0)
                    l=i+1;
                maxl = Math.max(maxl, l);
            }
            else if(sum==0){
                maxl = i+1;
            }
            else{
                map.put(sum, i);
            }
        }
        return maxl;
    }
    // int f(int[] arr, int n, int i, int pr, int sum, int[][] dp){
    //     if(dp[i][pr]!=-1){
    //         return dp[i][pr];
    //     }
    //     if(sum==0 && i<n){
    //         // System.out.println("1: i:"+i+" pr:"+pr+" sum:"+sum);
    //         return (i-pr)+f(arr, n, i+1, i, sum+arr[i], dp);
    //     }
    //     if(i>=n && sum!=0){
    //         // System.out.println("2: i:"+i+" pr:"+pr+" sum:"+sum);
    //         return 0;
    //     }
    //     if(i>=n && sum==0){
    //         // System.out.println("3: i:"+i+" pr:"+pr+" sum:"+sum);
    //         return i-pr;
    //     }
    //     int take = f(arr, n, i+1, pr, sum+arr[i], dp);
    //     int notake = f(arr, n, i+1, i, arr[i], dp);
    //     return dp[i][pr]=Math.max(take, notake);
    // }
}