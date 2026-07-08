# Concatenate Non-Zero Digits and Multiply by Sum II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` of length `m` consisting of digits. You are also given a 2D integer array `queries`, where `queries[i] = [li, ri]`.

For each `queries[i]`, extract the  **substring**  `s[li..ri]`. Then, perform the following:

- Form a new integer x by concatenating all the non-zero digits from the substring in their original order. If there are no non-zero digits, x = 0.
- Let sum be the sum of digits in x. The answer is x * sum.

Return an array of integers `answer` where `answer[i]` is the answer to the `ith` query.

Since the answers may be very large, return them  **modulo**  `109 + 7`.

 

 **Example 1:** 

 **Input:**  s = "10203004", queries = [[0,7],[1,3],[4,6]]

 **Output:**  [12340, 4, 9]

 **Explanation:** 

- s[0..7] = "10203004" x = 1234 sum = 1 + 2 + 3 + 4 = 10 Therefore, answer is 1234 * 10 = 12340.
- s[1..3] = "020" x = 2 sum = 2 Therefore, the answer is 2 * 2 = 4.
- s[4..6] = "300" x = 3 sum = 3 Therefore, the answer is 3 * 3 = 9.

 **Example 2:** 

 **Input:**  s = "1000", queries = [[0,3],[1,1]]

 **Output:**  [1, 0]

 **Explanation:** 

- s[0..3] = "1000" x = 1 sum = 1 Therefore, the answer is 1 * 1 = 1.
- s[1..1] = "0" x = 0 sum = 0 Therefore, the answer is 0 * 0 = 0.

 **Example 3:** 

 **Input:**  s = "9876543210", queries = [[0,9]]

 **Output:**  [444444137]

 **Explanation:** 

- s[0..9] = "9876543210" x = 987654321 sum = 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45 Therefore, the answer is 987654321 * 45 = 44444444445. We return 44444444445 modulo (109 + 7) = 444444137.

 

 **Constraints:** 

- 1 <= m == s.length <= 105
- s consists of digits only.
- 1 <= queries.length <= 105
- queries[i] = [li, ri]
- 0 <= li <= ri < m

## Solution

**Language:** Java  
**Runtime:** 86 ms (beats 6.67%)  
**Memory:** 151.2 MB (beats 6.67%)  
**Submitted:** 2026-07-08T03:45:52.276Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii/)