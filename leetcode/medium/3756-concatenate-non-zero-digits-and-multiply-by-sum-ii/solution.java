import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {

        ArrayList<Integer> positions = new ArrayList<>();
        ArrayList<Integer> digits = new ArrayList<>();

        // Store positions and values of non-zero digits
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                positions.add(i);
                digits.add(d);
            }
        }

        int m = digits.size();

        // Powers of 10
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // Prefix number and prefix digit sum
        long[] prefixNumber = new long[m + 1];
        long[] prefixSum = new long[m + 1];

        for (int i = 0; i < m; i++) {
            prefixNumber[i + 1] = (prefixNumber[i] * 10 + digits.get(i)) % MOD;
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int left = lowerBound(positions, l);
            int right = upperBound(positions, r) - 1;

            if (left > right) {
                answer[i] = 0;
                continue;
            }

            long sum = prefixSum[right + 1] - prefixSum[left];

            int len = right - left + 1;

            long number = (prefixNumber[right + 1]
                    - (prefixNumber[left] * pow10[len]) % MOD
                    + MOD) % MOD;

            answer[i] = (int) ((number * (sum % MOD)) % MOD);
        }

        return answer;
    }

    // First index >= target
    private int lowerBound(ArrayList<Integer> arr, int target) {
        int low = 0, high = arr.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) >= target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    // First index > target
    private int upperBound(ArrayList<Integer> arr, int target) {
        int low = 0, high = arr.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}