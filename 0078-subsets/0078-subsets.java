class Solution {
    static List<List<Integer>> res;
    public static void helper(int i, int[] arr, ArrayList<Integer> ans){
        if(i == arr.length){
            res.add(new ArrayList(ans));
            return;
        }
        ans.add(arr[i]);
        helper(i+1, arr, ans);
        ans.remove(ans.size()-1); 
        helper(i+1, arr, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        return res;
    }
}