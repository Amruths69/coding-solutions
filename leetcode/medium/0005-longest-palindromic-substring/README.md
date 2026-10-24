# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 48.66%)  
**Memory:** 43.3 MB (beats 85.39%)  
**Submitted:** 2026-10-24T00:01:17.549Z  

```java
//daily-dump

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }

                left--;
                right++;
            }

            // Even-length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    start = left;
                    maxLen = right - left + 1;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)