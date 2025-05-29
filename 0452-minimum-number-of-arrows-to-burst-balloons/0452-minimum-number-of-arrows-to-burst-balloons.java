class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int n = arr.length;
        int last = arr[0][1];
        int arrow = n;

        for(int i=1; i<n; i++){
            if(last >= arr[i][0]){
                arrow--;
                last = Math.min(last, arr[i][1]);
            }
            else{
                last =  arr[i][1];
            }
        }
        return arrow;
    }
}