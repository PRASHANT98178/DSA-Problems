class Solution {
    static List<List<Integer>> res;
    static int sum;
    public static void helper(int i, int[] arr, int sum, ArrayList<Integer> ans, int target){
        if(sum == target){
            res.add(new ArrayList(ans));
            return;
        }

        if(i == arr.length || sum > target){
            return;
        }

        ans.add(arr[i]);
        helper(i, arr, sum+arr[i], ans, target);
        ans.remove(ans.size()-1);
        helper(i+1, arr, sum, ans, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        sum = 0;
        helper(0, candidates, sum, ans, target);
        return res;
    }
}