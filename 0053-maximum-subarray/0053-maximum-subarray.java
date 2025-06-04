class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return maxsum;
    }
}