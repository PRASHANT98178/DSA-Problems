class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb  = new StringBuilder(s);
        StringBuilder tb  = new StringBuilder(t);

        char[] chars = sb.toString().toCharArray();
        char[] chars2 = tb.toString().toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        StringBuilder sortedSb = new StringBuilder(new String(chars));
        StringBuilder sortedSb2 = new StringBuilder(new String(chars2));

        if(sortedSb.length() != sortedSb2.length()) return false;

        if(sortedSb.length() > sortedSb2.length()){
            for(int i=0; i<sortedSb.length(); i++){
                if(sortedSb.charAt(i) != sortedSb2.charAt(i)){
                    return false;
                }
            }
        }
        else {
            for(int i=0; i<sortedSb2.length(); i++){
                if(sortedSb2.charAt(i) != sortedSb.charAt(i)){
                    return false;
                }
            }
        }

        
        return true;


    }
}