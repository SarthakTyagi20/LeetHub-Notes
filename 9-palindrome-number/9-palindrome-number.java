class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0)
            return true;
        ArrayList<Integer> a = new ArrayList<>();
        while(x>0){
            int r=x%10;
            x/=10;
            a.add(r);
        }
        int i=0, j=a.size()-1;
        while(i<j){
            if(a.get(i)!=a.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}