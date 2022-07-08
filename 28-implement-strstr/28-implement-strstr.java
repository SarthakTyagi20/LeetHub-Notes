class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int n = needle.length(), h = haystack.length();
        for(int i=0; i<=h-n; i++){
            if(haystack.substring(i, i+n).equals(needle))
                return i;
        }
        // while()
        // int x = haystack.indexOf(needle);
        return -1;
    }
}