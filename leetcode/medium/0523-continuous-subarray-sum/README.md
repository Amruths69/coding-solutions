# Continuous Subarray Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums and an integer k, return `true`  *if* `nums` *has a  **good subarray**  or* `false` *otherwise*.

A  **good subarray**  is a subarray where:

- its length is at least two, and
- the sum of the elements of the subarray is a multiple of k.

 **Note**  that:

- A subarray is a contiguous part of the array.
- An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

 

 **Example 1:** 

```
Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.

```

 **Example 2:** 

```
Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.

```

 **Example 3:** 

```
Input: nums = [23,2,6,4,7], k = 13
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 0 <= nums[i] <= 109
- 0 <= sum(nums[i]) <= 231 - 1
- 1 <= k <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 43.95%)  
**Memory:** 140 MB (beats 6.96%)  
**Submitted:** 2026-07-14T08:23:07.227Z  

```java
/////daily-dump
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            p += nums[i];

            int r = p % k;

            if (m.containsKey(r)) {
                if (i - m.get(r) >= 2) {
                    return true;
                }
            } else {
                m.put(r, i);
            }
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/continuous-subarray-sum/)