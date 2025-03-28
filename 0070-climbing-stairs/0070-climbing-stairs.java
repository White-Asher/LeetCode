import java.util.*;

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        if(n >= 2) {
            dp[2] = 2;
        }
        for(int i = 2; i < n; i++) {
            dp[i + 1] = dp[i] + dp[i - 1];
        }
        return dp[n];
    }

}