# Find Greatest Common Divisor of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return  *the  **greatest common divisor**  of the smallest number and largest number in* `nums`.

The  **greatest common divisor**  of two numbers is the largest positive integer that evenly divides both numbers.

 

 **Example 1:** 

```
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.

```

 **Example 2:** 

```
Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.

```

 **Example 3:** 

```
Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.

```

 

 **Constraints:** 

- 2 <= nums.length <= 1000
- 1 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.8 MB (beats 94.14%)  
**Submitted:** 2026-07-18T08:07:31.436Z  

```java
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int j=nums[0];
        int g=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=Math.max(nums[i],max);
        }

        }
        for(int i:nums){
            if(i<min){
                min=Math.min(i,min);
            }
        }
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                g=Math.max(i,g);
            }
        }
        return g;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)