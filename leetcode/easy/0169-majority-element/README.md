# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 37.31%)  
**Memory:** 52.6 MB (beats 85.60%)  
**Submitted:** 2026-09-06T10:26:08.998Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int g=(nums.length)/2;
        for(Map.Entry<Integer,Integer>i:a.entrySet()){
            if(i.getValue()>g){
                return i.getKey();
            }
        }
        return -1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)