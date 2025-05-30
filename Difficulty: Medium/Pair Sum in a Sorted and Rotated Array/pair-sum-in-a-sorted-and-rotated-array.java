
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
       int n = arr.length;
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for(int i=0; i<n; i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
       }
       
        for (int key : map.keySet()) {
            int complement = target - key;

            if (map.containsKey(complement)) {
                if (key == complement && map.get(key) >= 2) {
                    return true;
                } else if (key != complement) {
                    return true;
                }
            }
        }
        return false;
    }
}
