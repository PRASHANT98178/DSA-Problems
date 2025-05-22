class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int preff = 1;
        int maxp = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            preff *= arr[i];
            maxp = Math.max(maxp, preff);
            if(arr[i] == 0) preff = 1;
        }
        int suff = 1;
        for(int i=n-1; i>=0; i--){
            suff *= arr[i];
            maxp = Math.max(maxp, suff);
            if(arr[i] == 0) suff = 1;
        }
       
        return maxp;
    }
}