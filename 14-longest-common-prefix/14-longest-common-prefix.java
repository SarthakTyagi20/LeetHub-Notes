class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx=0;
        int n = strs.length, maxl = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
             maxl = Math.min(maxl, strs[i].length());
        }
        int l = -2, f=0;
        while(idx<maxl && f!=1){
            // idx++;
            char s = strs[0].charAt(idx);
            for(int i=1; i<n; i++){
                // System.out.println("strs[i].charAt(idx):"+strs[i].charAt(idx)+" s:"+s);
                if(strs[i].charAt(idx)!=s){
                    l=idx-1;
                    System.out.println("idx:"+idx);
                    f=1;
                    break;
                }
            }
            idx++;
        }
        if(l==-2){
            return strs[0].substring(0, maxl);
        }
        if(l==-1)
            return "";
        return strs[0].substring(0, l+1);
    }
}