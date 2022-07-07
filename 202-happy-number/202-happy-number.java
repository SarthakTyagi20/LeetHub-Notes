class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            int x = n;
            int sum=0;
            while(x>0){
                int y=x%10;
                x=x/10;
                sum+=(y*y);
            }            
            if(sum==1){
                return true;
            }
            if(arr.contains(sum)){
                return false;
            }
            arr.add(sum);
            n=sum;
        }
        // return false;
    }
}