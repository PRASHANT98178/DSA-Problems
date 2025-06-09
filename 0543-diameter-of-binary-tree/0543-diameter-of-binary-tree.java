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
    static int maxDepth;
    public static int helper(TreeNode root){
        if(root == null) return 0;

        int leftdepth = helper(root.left);
        int rightdepth = helper(root.right);

        int depth = leftdepth + rightdepth;
        maxDepth = Math.max(depth, maxDepth);
        return 1 + Math.max(leftdepth, rightdepth);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth = 0;
        helper(root);
        return maxDepth;
    }
}