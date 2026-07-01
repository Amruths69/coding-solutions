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
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-07-01T01:02:44.457Z  

```java
class Solution {
    public boolean isTrionic(int[] nums) {
        int g=nums[0];
        int f=0;
        for(int i=1;i<nums.length;i++){
            if(g<nums[i]){
                g=nums[i];

            }else if(g>nums[i]){
                f=nums[i];

            }

        }
        if(g<f){
            return true;
        }
        return false;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trionic-array-i/)