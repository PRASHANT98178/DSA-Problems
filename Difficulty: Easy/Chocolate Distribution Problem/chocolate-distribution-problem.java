// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n = arr.size();
        int i = 0;
        int j = m-1;
        int min = arr.get(j) - arr.get(i);
        
        while(j<n-1){
            j++;
            i++;
            
            min = Math.min(min, arr.get(j) - arr.get(i));
        }
        return min;
    }
}