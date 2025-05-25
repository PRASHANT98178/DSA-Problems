class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int arrow = n;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int last = points[0][1];
        for(int i=1; i<n; i++){
            if(last >= points[i][0]){
                arrow--;
                last = Math.min(last, points[i][1]);
            }
            else {
                last = points[i][1];
            }
            
        }
        return arrow;
    }
}