class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);
        int i=0;
        int j = tokens.length-1;

        while(i<=j){
            if(tokens[i] <= power){
                score++;
                power -= tokens[i++];
                maxScore = Math.max(maxScore, score);
              
            }
            else if(score > 0){
                power += tokens[j--];
                score--;
            }
            else {
                break;
            }
           
        }
        return maxScore;
    }
}