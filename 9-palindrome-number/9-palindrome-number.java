class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0)
            return true;
        int rev = 0, y = x;
        // ArrayList<Integer> a = new ArrayList<>();
        while(y>0){
            rev = rev*10 + y%10;
            y/=10;
            // a.add(r);
        }
        // int i=0, j=a.size()-1;
        // while(i<j){
        //     if(a.get(i)!=a.get(j)){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        return rev==x;
    }
}