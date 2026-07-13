# Running Sum of 1d Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```

 **Example 2:** 

```
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```

 **Example 3:** 

```
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- -10^6 <= nums[i] <= 10^6

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 1.65%)  
**Memory:** 44.3 MB (beats 54.04%)  
**Submitted:** 2026-07-13T04:19:24.136Z  

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<=i;j++){
                
                ans[i]+=nums[j];

            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/running-sum-of-1d-array/)