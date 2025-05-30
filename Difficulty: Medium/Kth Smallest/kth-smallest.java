// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
            while(pq.size() > k) pq.remove();
        }
        
        return pq.peek();
    }
}
