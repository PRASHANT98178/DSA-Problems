class Solution {
    public int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public int fib(int n) {
        int a = fibo(n);
        return a;
    }
}