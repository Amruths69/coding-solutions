# Smallest Palindromic Rearrangement II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a  **palindromic**  string `s` and an integer `k`.

Return the  **k-th**   **lexicographically smallest**  palindromic permutation of `s`. If there are fewer than `k` distinct palindromic permutations, return an empty string.

 **Note:**  Different rearrangements that yield the same palindromic string are considered identical and are counted once.

 

 **Example 1:** 

 **Input:**  s = "abba", k = 2

 **Output:**  "baab"

 **Explanation:** 

- The two distinct palindromic rearrangements of "abba" are "abba" and "baab".
- Lexicographically, "abba" comes before "baab". Since k = 2, the output is "baab".

 **Example 2:** 

 **Input:**  s = "aa", k = 2

 **Output:**  ""

 **Explanation:** 

- There is only one palindromic rearrangement: "aa".
- The output is an empty string since k = 2 exceeds the number of possible rearrangements.

 **Example 3:** 

 **Input:**  s = "bacab", k = 1

 **Output:**  "abcba"

 **Explanation:** 

- The two distinct palindromic rearrangements of "bacab" are "abcba" and "bacab".
- Lexicographically, "abcba" comes before "bacab". Since k = 1, the output is "abcba".

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of lowercase English letters.
- s is guaranteed to be palindromic.
- 1 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 1022 ms (beats 6.45%)  
**Memory:** 287.1 MB (beats 6.45%)  
**Submitted:** 2026-07-29T15:58:12.253Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/)