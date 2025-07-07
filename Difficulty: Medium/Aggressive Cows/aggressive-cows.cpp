class Solution {
  public:
    // Helper function to check if we can place k cows with at least 'dist' between them
    bool canPlace(vector<int>& stalls, int k, int dist) {
        int count = 1;  // Place first cow at the first stall
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.size(); i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
                if (count == k) return true;
            }
        }
        return false;
    }

    int aggressiveCows(vector<int> &stalls, int k) {
        sort(stalls.begin(), stalls.end());  // Sort stall positions

        int low = 1;
        int high = stalls.back() - stalls.front();
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(stalls, k, mid)) {
                ans = mid;        // Valid, try for larger distance
                low = mid + 1;
            } else {
                high = mid - 1;   // Not possible, try smaller
            }
        }

        return ans;
    }
};
