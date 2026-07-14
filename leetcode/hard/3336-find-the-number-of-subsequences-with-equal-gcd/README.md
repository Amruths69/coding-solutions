# Find the Number of Subsequences With Equal GCD

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums`.

Your task is to find the number of pairs of  **non-empty**  subsequences `(seq1, seq2)` of `nums` that satisfy the following conditions:

- The subsequences seq1 and seq2 are disjoint, meaning no index of nums is common between them.
- The GCD of the elements of seq1 is equal to the GCD of the elements of seq2.

Return the total number of such pairs.

Since the answer may be very large, return it  **modulo**  `109 + 7`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  10

 **Explanation:** 

The subsequence pairs which have the GCD of their elements equal to 1 are:

- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])
- ([1, 2, 3, 4], [1, 2, 3, 4])

 **Example 2:** 

 **Input:**  nums = [10,20,30]

 **Output:**  2

 **Explanation:** 

The subsequence pairs which have the GCD of their elements equal to 10 are:

- ([10, 20, 30], [10, 20, 30])
- ([10, 20, 30], [10, 20, 30])

 **Example 3:** 

 **Input:**  nums = [1,1,1,1]

 **Output:**  50

 

 **Constraints:** 

- 1 <= nums.length <= 200
- 1 <= nums[i] <= 200

## Solution

**Language:** Java  
**Runtime:** 554 ms (beats 19.44%)  
**Memory:** 58.1 MB (beats 52.78%)  
**Submitted:** 2026-07-14T03:22:42.789Z  

```java
//daily-dump
class Solution {
    static final int MOD = 1_000_000_007;

    public int subsequencePairCount(int[] nums) {
        int MAX = 200;

        long[][] dp = new long[MAX + 1][MAX + 1];
        dp[0][0] = 1;

        for (int x : nums) {

            long[][] next = new long[MAX + 1][MAX + 1];

            for (int g1 = 0; g1 <= MAX; g1++) {
                for (int g2 = 0; g2 <= MAX; g2++) {

                    long ways = dp[g1][g2];
                    if (ways == 0) continue;

                    // Ignore
                    next[g1][g2] = (next[g1][g2] + ways) % MOD;

                    // Put in seq1
                    int ng1 = (g1 == 0) ? x : gcd(g1, x);
                    next[ng1][g2] = (next[ng1][g2] + ways) % MOD;

                    // Put in seq2
                    int ng2 = (g2 == 0) ? x : gcd(g2, x);
                    next[g1][ng2] = (next[g1][ng2] + ways) % MOD;
                }
            }

            dp = next;
        }

        long ans = 0;

        for (int g = 1; g <= MAX; g++) {
            ans = (ans + dp[g][g]) % MOD;
        }

        return (int) ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/)