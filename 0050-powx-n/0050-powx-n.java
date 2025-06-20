class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        double ans = 1;

        if( nn < 0) nn = -1 * nn;
        while(nn > 0){
            if(nn % 2 == 1){
                ans *= x;
                nn -= 1;
            }
            else {
                x *= x;
                nn /= 2;
            }
        }

        if(n < 0) return (double) 1.0/ (double) ans;
        return ans;
    }
}