# Concatenate Non-Zero Digits and Multiply by Sum I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`.

Form a new integer `x` by concatenating all the  **non-zero digits**  of `n` in their original order. If there are no  **non-zero**  digits, `x = 0`.

Let `sum` be the  **sum of digits**  in `x`.

Return an integer representing the value of `x * sum`.

 

 **Example 1:** 

 **Input:**  n = 10203004

 **Output:**  12340

 **Explanation:** 

- The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
- The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
- Therefore, the answer is x  *sum = 1234*  10 = 12340.

 **Example 2:** 

 **Input:**  n = 1000

 **Output:**  1

 **Explanation:** 

- The non-zero digit is 1, so x = 1 and sum = 1.
- Therefore, the answer is x  *sum = 1*  1 = 1.

 

 **Constraints:** 

- 0 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.85%)  
**Memory:** 42.7 MB (beats 34.98%)  
**Submitted:** 2026-07-07T03:27:40.940Z  

```java
//daily-dump
class Solution {
    public long sumAndMultiply(int n) {

        long x = 0;
        long sum = 0;
        long place = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit != 0) {
                x = digit * place + x;
                place *= 10;
                sum += digit;
            }

            n /= 10;
        }

        return x * sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/)