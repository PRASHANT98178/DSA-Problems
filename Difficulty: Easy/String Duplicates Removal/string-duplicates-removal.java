// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        String ans = "";
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                ans += ch;
                set.add(ch);
            }
        }
        
        
        return ans;
    }
}
