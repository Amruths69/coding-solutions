# Sequential Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An integer has  *sequential digits*  if and only if each digit in the number is one more than the previous digit.

Return a  **sorted**  list of all the integers in the range `[low, high]` inclusive that have sequential digits.

 

 **Example 1:** 

```
Input: low = 100, high = 300
Output: [123,234]

```

 **Example 2:** 

```
Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

```

 

 **Constraints:** 

- 10 <= low <= high <= 10^9

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.7 MB (beats 6.32%)  
**Submitted:** 2026-07-13T04:33:34.198Z  

```java
//daily-dump

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String s = "123456789";

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {

            for (int i = 0; i + len <= 9; i++) {

                int num = Integer.parseInt(s.substring(i, i + len));

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sequential-digits/)