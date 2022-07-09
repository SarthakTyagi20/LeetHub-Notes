class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int n = queries.length;
        int in = (int)Math.pow(10, (intLength-1)/2);
        long[] res = new long[n];
        for(int i=0; i<n; i++){
            int no = in+queries[i]-1;
            String s = Integer.toString(no);
            // System.out.println("s:"+s);
            char[] a;
            // if(intLength%2!=0)
            //     a = s.substring(0,s.length()-1).toCharArray();
            // else 
                a = s.toCharArray();
            
            String t = (new StringBuffer(s)).reverse().toString();
            
            // Collections.reverse(Arrays.asList(a));
            // String t = String.valueOf(a);
            // System.out.println("t:"+t);
            if(intLength%2!=0)
                t=t.substring(1, t.length());
            
            // System.out.println("s:"+s+" t:"+t);
            s+=t;
            if(s.length()==intLength)
                res[i] = Long.valueOf(s);
            else
                res[i] = -1;
        }
        return res;
    }
}