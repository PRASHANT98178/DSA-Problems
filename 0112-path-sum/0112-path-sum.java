
class Solution {
    // static int sum;

    // public boolean helper(TreeNode root, target){
    //     if(sum == target) return true;
    //     if(root == null) return false;

    //     sum += target;
    //     helper(root.left, target);
    //     helper(root.right, target);

    // }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(targetSum == 0) return true; 
        if(root == null) return false;

        targetSum -= root.val;
        if(root.left == null && root.right == null && targetSum == 0) return true;
        

        
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}