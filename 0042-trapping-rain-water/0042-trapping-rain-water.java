class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            left[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            max = Math.max(max, arr[i]);
            right[i] = max;
        }
        int water = 0;

        for(int i=1; i<n-1; i++){
           int m =  Math.min(left[i], right[i]);
           int w = m-arr[i];
           water += w;
        }
        return water;
    }
}