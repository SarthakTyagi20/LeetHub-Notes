class Solution {
    public int titleToNumber(String columnTitle) {
        // System.out.println('Z'-'A'+1);
        int sum=0, n=columnTitle.length();
        for(int i=0; i<n; i++){
            sum+=Math.pow(26,(n-i-1))*(columnTitle.charAt(i)-'A'+1);
        }
        return sum;
    }
}