// User function Template for Java
class Solution {
    String printSequence(String S) {
        String ans = "";
        int[] keyboard = new int[26];
        int f = 2;
        int s = 22;
        int l = 222;
        int count = 1;
        for(int i=0; i<keyboard.length; i++){
            if( i == 25){
                keyboard[i] = 9999;
            }
            else if( i == 18){
                keyboard[i] = 7777;
            }
            else if(count == 1){
                keyboard[i] = f;
                f+=1;
                count++;
            }
            else if(count == 2){
                keyboard[i] = s;
                s+=11;
                count++;
            }
            else if( count == 3){
                keyboard[i] = l;
                l+=111;
                count = 1;
            }
        }
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            int ascii = (int) ch;
            ascii -= 65;
            if(ch == ' ') ans += '0';
            else {
                ans += keyboard[ascii];
            }
            
        }
        return ans;
    }
}