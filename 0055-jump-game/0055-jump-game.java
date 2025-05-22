class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int goal = n-1;
        for(int i=n-2; i>=0; i--){
            if(i+arr[i] >= goal){
                goal = i;
            }
        }
        if(goal == 0) return true;
        return false;
    }
}