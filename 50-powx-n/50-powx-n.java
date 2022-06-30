class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n==-1){
            return (double)1/x;
        }
        if(n%2==0){
            double d = myPow(x, n/2);
            // if(n<0){
            //     d=1/d;
            // }
            return d*d;
        }
        else{
            double d = myPow(x, n/2);
            if(n<0){
                // d=1/d;
                return (1/x)*d*d;
            }
            return x*d*d;
        }
    }
}