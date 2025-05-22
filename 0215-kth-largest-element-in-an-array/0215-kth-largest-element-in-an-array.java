class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for(int i=0; i<n; i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k){
                minHeap.remove();
            }

        }
        return minHeap.peek();
    }
}