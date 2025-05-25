class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int[] interval:intervals){
            list.add(interval);
        } 
        list.add(newInterval);
        list.sort((a, b)->Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(list.get(0));
        for (int i = 1; i< list.size(); ++i){
            int[] last = res.get(res.size()-1);
            int[] current = list.get(i);
            if (last[1]< current[0]){
                res.add(current);
            }
    
            else {
                last[1]= Math.max(last[1], current[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}