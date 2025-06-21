class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
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
