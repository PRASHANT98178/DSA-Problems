class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])) return true;
            map.put(arr[i], 1);
        }
        return false;
    }
}