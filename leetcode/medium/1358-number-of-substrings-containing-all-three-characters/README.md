# Number of Substrings Containing All Three Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` consisting only of characters  *a*,  *b*  and  *c*.

Return the number of substrings containing  **at least**  one occurrence of all these characters  *a*,  *b*  and  *c*.

 

 **Example 1:** 

```
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 

```

 **Example 2:** 

```
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

```

 **Example 3:** 

```
Input: s = "abc"
Output: 1

```

 

 **Constraints:** 

- 3 <= s.length <= 5 x 10^4
- s only consists of a, b or c characters.

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 40.27%)  
**Memory:** 46.4 MB (beats 45.69%)  
**Submitted:** 2026-06-30T13:20:35.298Z  

```java
//daily-workout

class Solution {
    public int numberOfSubstrings(String s) {

        int[] count = new int[3];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            // add current character
            count[s.charAt(right) - 'a']++;

            // while window has a,b,c
            while (count[0] > 0 &&
                   count[1] > 0 &&
                   count[2] > 0) {

                // all substrings from right to end are valid
                ans += s.length() - right;

                // remove left character
                count[s.charAt(left) - 'a']--;

                left++;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)