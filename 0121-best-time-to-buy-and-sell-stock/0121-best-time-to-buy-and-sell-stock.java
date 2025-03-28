import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            int curPro = prices[i] - min;
            maxProfit = Math.max(maxProfit, curPro);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}