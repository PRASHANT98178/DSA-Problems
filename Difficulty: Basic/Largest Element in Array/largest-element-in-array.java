class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        return max;
    }
}
