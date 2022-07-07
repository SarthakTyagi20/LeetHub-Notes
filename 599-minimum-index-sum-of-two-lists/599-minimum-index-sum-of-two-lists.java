class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> ans = new HashMap<>();
        int m = list1.length, n = list2.length;
        for(int i=0; i<m; i++){
            map.put(list1[i], i);
        }
        int l=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            // arr2.add(list2[i]);
            if(map.containsKey(list2[i])){
                ans.put(list2[i], i+map.get(list2[i]));
                l = Math.min(l, i+map.get(list2[i]));
            }
        }
        for(Map.Entry e : ans.entrySet()){
            int x = (int)e.getValue(); 
            if(x==l){
                res.add((String)e.getKey());
            }
        }        
        return res.toArray(new String[res.size()]);
    }
}