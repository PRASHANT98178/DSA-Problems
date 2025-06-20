class Solution {
    static int m = 1000000007;
    public int findPow(long a, long b){
        if(b == 0){
            return 1;
        }

        long half = findPow(a, b/2);
        long result = (half * half) % m;

        if(b % 2 ==1){
            result = (result * a) % m;
        }

        return (int)result;
    }
    public int countGoodNumbers(long n) {
        long ans = ((long)findPow(5, (n+1)/2) * findPow(4, n/2)) %m;
        return (int)ans;
    }
}