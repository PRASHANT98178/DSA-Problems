class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int score = 0;
        Arrays.sort(tokens);
        int i=0;
        int j=n-1;
        int maxscore = 0;

        while(i<=j){
            if(power >= tokens[i]){
                score++;
                power -= tokens[i];
                i++;
                maxscore = Math.max(maxscore, score);
            }
            else if(score > 0){
                power += tokens[j];
                score--;
                j--;
            }
            else {
                break;
            }
        }

        return maxscore;
    }
}