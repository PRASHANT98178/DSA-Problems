class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n = arr.length;
        HashSet<Integer> window = new HashSet<>();
        int left = 0;

        for(int right = 0; right<n; right++){
            if(right > k){
                window.remove(arr[left]);
                left++;
            }

            if(window.contains(arr[right])) return true;

            window.add(arr[right]);
        }

        return false;
    }
}