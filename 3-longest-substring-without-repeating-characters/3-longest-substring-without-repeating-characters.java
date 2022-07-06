class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0, ans=0, str=0;
        HashMap<Character, Integer> map = new HashMap<>();
        if(l>0)
            ans++;
        for(int i=0; i<n; i++){
            if(!map.containsKey(s.charAt(i)) || (map.containsKey(s.charAt(i)) && map.get(s.charAt(i))<str)){
                l++;
                ans = Math.max(ans, l);
                map.put(s.charAt(i), i);
                System.out.println("str:"+str+" l:"+l+" i:"+i);
            }
            else{
                l=i-map.get(s.charAt(i));
                str=map.get(s.charAt(i))+1;
                // map.put(s.charAt(i), i);
                // i=str;
                // map = new HashMap<>();
                map.put(s.charAt(i), i);
                System.out.println("str:"+str);
            }
        }
        return ans;
    }
}