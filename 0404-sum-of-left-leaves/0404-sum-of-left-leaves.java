/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int ans;
    public void helper(TreeNode root){
        if(root == null) return;
        
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                ans += root.left.val;
            }
        }
        helper(root.left);
        helper(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        ans = 0;
        helper(root);
        return ans;
    }
}