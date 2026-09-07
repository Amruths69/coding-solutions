# Largest Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

 **Example 1:** 

```
Input: nums = [10,2]
Output: "210"

```

 **Example 2:** 

```
Input: nums = [3,30,34,5,9]
Output: "9534330"

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 94.11%)  
**Memory:** 44.4 MB (beats 97.67%)  
**Submitted:** 2026-09-07T13:41:18.791Z  

```java
import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {

        String[] S1 = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            S1[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(S1, new Comparator<String>() {
            public int compare(String a, String b) {
                String o1 = a + b;
                String o2 = b + a;

                return o2.compareTo(o1);
            }
        });

        if (S1[0].equals("0"))
            return "0";

        StringBuilder ln = new StringBuilder();

        for (String i : S1) {
            ln.append(i);
        }

        return ln.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)