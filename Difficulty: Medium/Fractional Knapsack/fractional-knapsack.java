import java.util.Arrays;

class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;

        
        double[][] ans = new double[n][2];
        for (int i = 0; i < n; i++) {
            ans[i][0] = (double) values[i] / weights[i];
            ans[i][1] = i;
        }

        
        Arrays.sort(ans, (a, b) -> Double.compare(b[0], a[0]));

        double maxProfit = 0.0;

        for (int i = 0; i < n && W > 0; i++) {
            int idx = (int) ans[i][1];
            int wt = weights[idx];
            int val = values[idx];

            if (W >= wt) {
                maxProfit += val;
                W -= wt;
            } else {
         
                maxProfit += ans[i][0] * W;
                W = 0;
            }
        }

        return maxProfit;
    }
}
