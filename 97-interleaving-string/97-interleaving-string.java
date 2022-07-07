class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int l1 = s1.length(), l2 = s2.length(), l3 = s3.length();
        if(l3!=l1+l2){
            System.out.println("1");
            return false;
        }
        int[][] dp = new int[l1+1][l2+1];
        // dp[l1][l2] = 1;
        for(int i=0; i<=l1; i++){
            for(int j=0; j<=l2; j++){
                dp[i][j]=-1;
            }
        }
        int x = f(s1, s2, s3, 0, 0, l1, l2, dp);
        if(x==1)
            return true;
        return false;
        // 
        // int i=0, j=0, k=0;
        // while(i<l1 && j<l2 && k<l3){
        //     if(s3.charAt(k)==s1.charAt(i)){
        //         i++;
        //         k++;
        //         while(i<l1 && k<l3 && s3.charAt(k)==s1.charAt(i)){
        //             i++;
        //             k++;
        //         }
        //     }
        //     else if(s3.charAt(k)==s2.charAt(j)){
        //         j++;
        //         k++;
        //         while(j<l2 && k<l3 && s3.charAt(k)==s2.charAt(j)){
        //             j++;
        //             k++;
        //         }
        //     }
        //     else{
        //         System.out.println("2 i:"+i+" j:"+j+" k:"+k);
        //         return false;
        //     }
        // }
        // while(i<l1 && k<l3){
        //     if(s3.charAt(k)==s1.charAt(i)){
        //         i++;
        //         k++;
        //     }
        //     else{
        //         System.out.println("3 i:"+i+" k:"+k);
        //         return false;
        //     }
        // }
        // while(j<l2 && k<l3){
        //     if(s3.charAt(k)==s2.charAt(j)){
        //         j++;
        //         k++;
        //     }
        //     else{
        //         System.out.println("4 j:"+j+" k:"+k);
        //         return false;
        //     }
        // }
        // return true;
    }
    public int f(String s1, String s2, String s3, int i, int j, int l1, int l2, int[][] dp){
        if(i>=l1 && j>=l2)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(i<l1 && s1.charAt(i)==s3.charAt(i+j) && f(s1, s2, s3, i+1, j, l1, l2, dp)==1)
            return 1;
        if(j<l2 && s2.charAt(j)==s3.charAt(i+j) && f(s1, s2, s3, i, j+1, l1, l2, dp)==1)
            return 1;
        return dp[i][j]=0;
    }
}