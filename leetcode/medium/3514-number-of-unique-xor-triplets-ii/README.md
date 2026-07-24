# Number of Unique XOR Triplets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`.

A  **XOR triplet**  is defined as the XOR of three elements `nums[i] XOR nums[j] XOR nums[k]` where `i <= j <= k`.

Return the number of  **unique**  XOR triplet values from all possible triplets `(i, j, k)`.

 

 **Example 1:** 

 **Input:**  nums = [1,3]

 **Output:**  2

 **Explanation:** 

The possible XOR triplet values are:

- (0, 0, 0) → 1 XOR 1 XOR 1 = 1
- (0, 0, 1) → 1 XOR 1 XOR 3 = 3
- (0, 1, 1) → 1 XOR 3 XOR 3 = 1
- (1, 1, 1) → 3 XOR 3 XOR 3 = 3

The unique XOR values are `{1, 3}`. Thus, the output is 2.

 **Example 2:** 

 **Input:**  nums = [6,7,8,9]

 **Output:**  4

 **Explanation:** 

The possible XOR triplet values are `{6, 7, 8, 9}`. Thus, the output is 4.

 

 **Constraints:** 

- 1 <= nums.length <= 1500
- 1 <= nums[i] <= 1500

## Solution

**Language:** Java  
**Runtime:** 655 ms (beats 32.73%)  
**Memory:** 47.2 MB (beats 16.36%)  
**Submitted:** 2026-07-24T07:45:16.688Z  

```java
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] present = new boolean[2048];

        for (int x : nums) {
            present[x] = true;
        }

        boolean[] pair = new boolean[2048];

        for (int i = 0; i < 2048; i++) {
            if (!present[i]) continue;
            for (int j = 0; j < 2048; j++) {
                if (!present[j]) continue;
                pair[i ^ j] = true;
            }
        }

        boolean[] ans = new boolean[2048];

        for (int x = 0; x < 2048; x++) {
            if (!pair[x]) continue;
            for (int y = 0; y < 2048; y++) {
                if (!present[y]) continue;
                ans[x ^ y] = true;
            }
        }

        int count = 0;
        for (boolean b : ans) {
            if (b) count++;
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-unique-xor-triplets-ii/)