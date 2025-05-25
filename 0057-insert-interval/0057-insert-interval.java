class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> allIntervals = new ArrayList<>();

        
        for (int[] interval : intervals) {
            allIntervals.add(interval);
        }
        allIntervals.add(newInterval);

        
        allIntervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : allIntervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        
        return merged.toArray(new int[merged.size()][]);
    }
}