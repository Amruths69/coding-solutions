class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 3];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Integer.MIN_VALUE;
            int s = 0;

            for (int j = i; j < Math.min(i + 3, n); j++) {
                s += stoneValue[j];
                dp[i] = Math.max(dp[i], s - dp[j + 1]);
            }
        }

        if (dp[0] > 0)
            return "Alice";
        else if (dp[0] < 0)
            return "Bob";
        else
            return "Tie";
    }
}