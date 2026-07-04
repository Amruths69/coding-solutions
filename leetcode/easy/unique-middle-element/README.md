# Q1. Unique Middle Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums` of odd length `n`.

Return `true` if the middle element of `nums` appears  **exactly**  once in the array. Otherwise return `false`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3]

 **Output:**  true

 **Explanation:** 

The middle element of `nums` is 2, which appears exactly once.

Thus, the answer is `true`.

 **Example 2:** 

 **Input:**  nums = [1,2,2]

 **Output:**  false

 **Explanation:** 

The middle element of `nums` is 2, which appears twice.

Thus, the answer is `false`.

 

 **Constraints:** 

- 1 <= n == nums.length <= 100
- n is odd.
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.4 MB  
**Submitted:** 2026-07-04T14:40:18.389Z  

```java
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int g=nums[nums.length/2];
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==g){
                c++;
            }else{
                continue;
            }
            
        }
        if(c==1){
            return true;
        }
        return false;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/unique-middle-element/)