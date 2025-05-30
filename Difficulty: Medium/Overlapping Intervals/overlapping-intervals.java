class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int n = arr.length;
        
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);
        
        for(int i=1; i<n; i++){
            int[] curr = arr[i];
            int[] last = ans.get(ans.size() -1);
            
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }
            else {
                ans.add(arr[i]);
            }
        }
        return ans;
        
    }
}