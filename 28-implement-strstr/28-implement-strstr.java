class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int x = haystack.indexOf(needle);
        return x;
    }
}