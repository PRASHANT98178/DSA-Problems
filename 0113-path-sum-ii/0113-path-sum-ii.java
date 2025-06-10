class Solution {
    // public List<Integer> copy(List<Integer> arr){
    //     List<Integer> list = new ArrayList<>();
    //     for(int ele : arr){
    //         list.add(ele);
    //     }
    //     return list;
    // }
    public void helper(TreeNode root, int target,  List<Integer> arr, List<List<Integer>> ans){
        if(root == null) return;
        target -= root.val;
        arr.add(root.val);
        if(target == 0 && root.left == null && root.right == null ){
            ans.add(new ArrayList<>(arr));
        }
        // List<Integer> arr1 = copy(arr);
        // List<Integer> arr2 = copy(arr);
        helper(root.left, target, arr, ans);
        helper(root.right, target, arr, ans);
        arr.remove(arr.size() - 1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(root, targetSum, arr, ans);
        return ans;
    }
}