class Solution {
    static int m = 1000000007;
    public static long findPow(long a, long b){
        if(b == 0) return 1;
        
        long half = findPow(a, b/2);
        long result = (half * half) % m;
        
        if(b % 2 !=0){
            result = (result * a) % m;
        }
        
        return  result;
    }
    public static int countGoodNumbers(long N) {
        // code here
        long res = (findPow(5, (N+1)/2) * findPow(4, N/2)) % m;
        return (int) res;
    }
}
