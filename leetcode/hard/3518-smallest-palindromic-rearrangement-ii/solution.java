import java.util.*;

class Solution {

    static final long LIMIT = 1000001L;

    long[][] C;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        int[] half = new int[26];
        char mid = 0;
        int len = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            len += half[i];
            if ((freq[i] & 1) == 1)
                mid = (char) ('a' + i);
        }

        buildCombination(len);

        if (countWays(half, len) < k)
            return "";

        StringBuilder first = new StringBuilder();

        while (len > 0) {

            for (int c = 0; c < 26; c++) {

                if (half[c] == 0)
                    continue;

                half[c]--;

                long ways = countWays(half, len - 1);

                if (ways >= k) {
                    first.append((char) ('a' + c));
                    len--;
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder(first);

        if (mid != 0)
            ans.append(mid);

        ans.append(first.reverse());

        return ans.toString();
    }

    void buildCombination(int n) {

        C = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            C[i][0] = C[i][i] = 1;

            for (int j = 1; j < i; j++) {
                C[i][j] = Math.min(LIMIT, C[i - 1][j - 1] + C[i - 1][j]);
            }
        }
    }

    long countWays(int[] cnt, int total) {

        long ans = 1;
        int rem = total;

        for (int x : cnt) {

            if (x == 0)
                continue;

            ans *= C[rem][x];

            if (ans > LIMIT)
                ans = LIMIT;

            rem -= x;
        }

        return ans;
    }
}