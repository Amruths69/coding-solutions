# Maximum Average Subarray I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose  **length is equal to**  `k` that has the maximum average value and return  *this value*. Any answer with a calculation error less than `10-5` will be accepted.

 

 **Example 1:** 

```
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

 **Example 2:** 

```
Input: nums = [5], k = 1
Output: 5.00000

```

 

 **Constraints:** 

- n == nums.length
- 1 <= k <= n <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 43.59%)  
**Memory:** 69.6 MB (beats 44.21%)  
**Submitted:** 2026-07-13T03:53:34.951Z  

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s+=nums[i];
        }
        double m=s;
        for(int i=k;i<nums.length;i++){
            s=s-nums[i-k]+nums[i];
            m=Math.max(m,s);
        }
        return (double)m/k;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)