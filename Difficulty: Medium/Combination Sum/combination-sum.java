// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static void solve(int i, int[] arr, int target, int sum, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> res){
        if(sum == target){
            res.add(new ArrayList(ans));
            return;
        }
        if(i >= arr.length || sum > target) return;
        ans.add(arr[i]);
        
        solve(i, arr, target, sum + arr[i], ans, res);
        ans.remove(ans.size()-1);
        solve(i+1, arr, target, sum, ans, res);
    }
    
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        
        solve(0, arr, target, 0, ans, res);
        return res;
    }
}