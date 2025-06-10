// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        int n = s.length();
        StringBuilder t = new StringBuilder();
        t.append(s.charAt(0));
        for(int i=1; i<n; i++){
            if(s.charAt(i-1) == s.charAt(i)) continue;
            t.append(s.charAt(i));
        }
        return t.toString();
    }
}