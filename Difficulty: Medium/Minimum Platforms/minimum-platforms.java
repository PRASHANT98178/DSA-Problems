import java.util.*;

class Solution {
    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        
        int[][] trains = new int[n][2];
        for (int i = 0; i < n; i++) {
            trains[i][0] = arr[i]; 
            trains[i][1] = dep[i]; 
        }
        
        
        Arrays.sort(trains, (a, b) -> Integer.compare(a[0], b[0]));

        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(trains[0][1]); 

        int maxPlatforms = 1;

        for (int i = 1; i < n; i++) {
            
            while (!pq.isEmpty() && trains[i][0] > pq.peek()) {
                pq.poll();
            }

            
            pq.add(trains[i][1]);

            
            maxPlatforms = Math.max(maxPlatforms, pq.size());
        }

        return maxPlatforms;
    }
}
