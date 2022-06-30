class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int l = 1, u = (x/2)+1;
        while(l<=u){
            int m = l+(u-l)/2;
            if(m <= x/m && (m+1)>x/(m+1)){
                System.out.println("m:"+m);
                return m;
            }
            if(m>x/m){
                u=m-1;
            }
            else{
                l=m+1;
            }
        }
        System.out.println("l:"+l+" u:"+u);
        return x/2;
    }
}