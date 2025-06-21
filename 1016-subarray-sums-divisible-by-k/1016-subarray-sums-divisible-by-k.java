class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int remainder = sum % k;

            
            if (remainder < 0) {
                remainder += k;
            }

            
            count += map.getOrDefault(remainder, 0);
            // if(map.containsKey(remainder)){
            //     count += map.get(remainder);
            // }

            
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
