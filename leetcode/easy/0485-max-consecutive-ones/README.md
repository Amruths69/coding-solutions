# Max Consecutive Ones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary array `nums`, return  *the maximum number of consecutive* `1` *'s in the array*.

 

 **Example 1:** 

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

 **Example 2:** 

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 60.40%)  
**Memory:** 52.8 MB (beats 10.41%)  
**Submitted:** 2026-07-13T08:11:16.566Z  

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int c=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==1)
            c++;
            else
            c=0;
            max=Math.max(c,max);
            i++;
        }
        return max;}}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)