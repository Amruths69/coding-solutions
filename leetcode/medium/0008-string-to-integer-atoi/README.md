# String to Integer (atoi)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement the `myAtoi(string s)` function, which converts a string to a 32-bit signed integer.

The algorithm for `myAtoi(string s)` is as follows:

- Whitespace: Ignore any leading whitespace (" ").
- Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
- Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
- Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.

 **Note:** ​​​​​​​ You must not use any built-in library function that converts a string to a number (for example, `atoi`, `stoi`, `Integer.parseInt`, `int()`, `parseInt`, `Number()`). Perform the conversion manually.

 

 **Example 1:** 

 **Input:**  s = "42"

 **Output:**  42

 **Explanation:** 

```
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^

```

 **Example 2:** 

 **Input:**  s = " -042"

 **Output:**  -42

 **Explanation:** 

```
Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
               ^

```

 **Example 3:** 

 **Input:**  s = "1337c0d3"

 **Output:**  1337

 **Explanation:** 

```
Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
             ^

```

 **Example 4:** 

 **Input:**  s = "0-1"

 **Output:**  0

 **Explanation:** 

```
Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
          ^

```

 **Example 5:** 

 **Input:**  s = "words and 987"

 **Output:**  0

 **Explanation:** 

Reading stops at the first non-digit character 'w'.

 

 **Constraints:** 

- 0 <= s.length <= 200
- s consists of English letters (lower-case and upper-case), digits (0 - 9), ' ', '+', '-', and '.'.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 19.22%)  
**Memory:** 43.3 MB (beats 90.76%)  
**Submitted:** 2026-10-25T23:47:03.812Z  

```java
//daily-dump
class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // Step 3: Read digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            num = num * 10 + (s.charAt(i) - '0');

            // Step 4: Handle 32-bit integer overflow
            if (sign * num <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (sign * num >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) (sign * num);
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/string-to-integer-atoi/)