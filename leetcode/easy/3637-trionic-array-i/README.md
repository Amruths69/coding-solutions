# Trionic Array I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` of length `n`.

An array is  **trionic**  if there exist indices `0 < p < q < n − 1` such that:

- nums[0...p] is strictly increasing,
- nums[p...q] is strictly decreasing,
- nums[q...n − 1] is strictly increasing.

Return `true` if `nums` is trionic, otherwise return `false`.

 

 **Example 1:** 

 **Input:**  nums = [1,3,5,4,2,6]

 **Output:**  true

 **Explanation:** 

Pick `p = 2`, `q = 4`:

- nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
- nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
- nums[4...5] = [2, 6] is strictly increasing (2 < 6).

 **Example 2:** 

 **Input:**  nums = [2,1,3]

 **Output:**  false

 **Explanation:** 

There is no way to pick `p` and `q` to form the required three segments.

 

 **Constraints:** 

- 3 <= n <= 100
- -1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 71.63%)  
**Memory:** 44.6 MB (beats 51.30%)  
**Submitted:** 2026-07-01T01:04:30.436Z  

```java
//daily-bang
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // must have at least one increase
        if (i == 0 || i == n - 1) {
            return false;
        }

        // decreasing
        int down = i;

        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // must have at least one decrease
        if (i == down || i == n - 1) {
            return false;
        }

        // increasing again
        int up = i;

        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // must end properly
        return i == n - 1 && up != i;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trionic-array-i/)