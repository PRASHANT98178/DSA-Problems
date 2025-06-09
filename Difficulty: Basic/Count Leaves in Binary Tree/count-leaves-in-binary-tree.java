/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    static int count;
    static void helper(Node root){
        if(root.left == null && root.right == null){
            count++;
            return;
        }
        
        
        if(root.left != null)  helper(root.left);
        if(root.right != null) helper(root.right);
    }
    int countLeaves(Node node) {
        // Your code
        count = 0;
        helper(node);
        return count;
    }
}