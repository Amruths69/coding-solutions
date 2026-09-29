# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 76.88%)  
**Memory:** 108 MB (beats 57.15%)  
**Submitted:** 2026-09-29T13:46:44.525Z  

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)