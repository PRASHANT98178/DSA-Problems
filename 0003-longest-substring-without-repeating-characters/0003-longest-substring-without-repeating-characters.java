class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int maxLen = Integer.MIN_VALUE;

        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >= i){
                int len = j-i;
                maxLen = Math.max(maxLen, len);

                while(s.charAt(i) != ch) i++;
                i++;

            }
            map.put(ch, j);
            j++;
        }
        int len = j-i;
        maxLen = Math.max(maxLen, len);

        return maxLen;
    }
}