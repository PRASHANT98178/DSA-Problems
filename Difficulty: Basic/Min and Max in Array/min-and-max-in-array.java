// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int ele : arr){
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }
        
        return new Pair(min, max);
    }
}
