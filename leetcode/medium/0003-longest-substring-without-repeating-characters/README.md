# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 5 * 104
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 37.50%)  
**Memory:** 46.5 MB (beats 38.55%)  
**Submitted:** 2026-07-14T06:15:07.898Z  

```java
//////daily-dump
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> fg = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (fg.contains(s.charAt(right))) {
                fg.remove(s.charAt(left));
                left++;
            }

            fg.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)