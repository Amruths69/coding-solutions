# Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return `-1`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

```

 **Example 2:** 

```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 < nums[i], target < 104
- All the integers in nums are unique.
- nums is sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.6 MB (beats 13.96%)  
**Submitted:** 2026-09-05T13:29:41.746Z  

```java
class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-search/)