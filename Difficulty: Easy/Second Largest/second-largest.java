class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i : arr){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }
            else if(i < max1 && i > max2){
                max2 = i;
            }
        }
        return max2 == Integer.MIN_VALUE ? -1 : max2;
    }
}