# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 79.14%)  
**Submitted:** 2026-11-26T15:21:51.120Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]>target && nums[i-1]<target){
                return i;
            }
        }
        if(nums[nums.length-1]<target){
                return nums.length;
            }
            else if(target<nums[0]){
                return 0;
            }else if(nums.length==1){
                return 0;
            }else if(nums[0]==target){
                return 0;
            }
        return -1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)