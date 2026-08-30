# Contains Duplicate II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return `true`  *if there are two  **distinct indices*** `i` *and* `j` *in the array such that* `nums[i] == nums[j]` *and* `abs(i - j) <= k`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], k = 3
Output: true

```

 **Example 2:** 

```
Input: nums = [1,0,1,1], k = 1
Output: true

```

 **Example 3:** 

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 21.16%)  
**Memory:** 104.5 MB (beats 53.06%)  
**Submitted:** 2026-08-30T06:09:40.369Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                return true;


            }
            a.add(nums[i]);
            if(a.size()>k)
            a.remove(nums[i-k]);
        }
        return false;
        
       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)