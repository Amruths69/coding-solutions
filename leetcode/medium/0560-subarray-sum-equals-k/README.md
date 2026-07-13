# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 1570 ms (beats 5.03%)  
**Memory:** 48.7 MB (beats 69.92%)  
**Submitted:** 2026-07-13T10:27:09.889Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                
                s+=nums[j];
                if(s==k){
                    c++;
                }
            }
        }
        return c;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)