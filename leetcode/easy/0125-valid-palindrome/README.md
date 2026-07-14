# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 99.28%)  
**Memory:** 44.2 MB (beats 84.57%)  
**Submitted:** 2026-07-14T06:12:49.123Z  

```java
////daily-dump
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            // Skip non-alphanumeric characters from the left
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // Skip non-alphanumeric characters from the right
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));

            if (left != right) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)