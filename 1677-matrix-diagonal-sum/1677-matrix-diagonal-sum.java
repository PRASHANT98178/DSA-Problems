class Solution {
    public int diagonalSum(int[][] arr) {
        int n = arr.length;
        int sum = 0;
       
        for(int i=0; i<n; i++){
            sum += arr[i][i];
            sum += arr[i][n-i-1];
        }

        if(n%2 != 0){
            int b = n/2;
            sum -= arr[b][b];
        }

    
        return sum;

    }
}