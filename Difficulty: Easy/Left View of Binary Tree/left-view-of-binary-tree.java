/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    
    ArrayList<Integer> leftView(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();
    if (root == null) return ans;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        int size = q.size(); 
        for (int i = 0; i < size; i++) {
            Node current = q.poll();
            if (i == 0) {
              
                ans.add(current.data);
            }
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }
    return ans;
}

}