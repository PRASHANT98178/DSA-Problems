class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int maxwater = 0;

        while(i<j){
            int height = Math.min(arr[i], arr[j]);
            int width = j-i;
            int currwater  = height * width;
            maxwater = Math.max(currwater, maxwater);

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxwater;
    }
}