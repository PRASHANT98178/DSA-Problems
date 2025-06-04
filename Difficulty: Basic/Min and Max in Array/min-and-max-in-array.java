

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        
        return new Pair(min, max);
    }
}
