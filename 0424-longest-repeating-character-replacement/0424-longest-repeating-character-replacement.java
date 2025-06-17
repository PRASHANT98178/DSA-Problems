class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0, j = 0;
        int maxLen = 0;
        int maxCount = 0;
        int[] freq = new int[26];

        while (j < n) {
            char ch = s.charAt(j);
            freq[ch - 'A']++;
            maxCount = Math.max(maxCount, freq[ch - 'A']);

            // If more than k chars need to be replaced, shrink window
            while ((j - i + 1) - maxCount > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }

        return maxLen;
    }
}
