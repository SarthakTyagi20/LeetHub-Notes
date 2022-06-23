class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1]!=9){
            digits[n-1] += 1;
            return digits;
        }
        int i=n-1;
        while(i>0 && digits[i]==9){
            digits[i] = 0;
            i--;
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
                // i--;
            }
        }
        if(i==0 && digits[0]==9){
            int[] num = new int[n+1];
            digits[0]=0;
            num[0] = 1;
            for(int j=0; j<n; j++){
                num[j+1] = digits[j];
            }
            return num;
        }
        return digits;
    }
}