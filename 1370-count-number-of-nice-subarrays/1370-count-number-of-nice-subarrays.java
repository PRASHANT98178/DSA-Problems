class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] %=2;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int remaining = sum - k;

            if (map.containsKey(remaining)) {
                count += map.get(remaining); 
            }

          
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}