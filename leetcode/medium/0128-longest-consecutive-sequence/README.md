# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 13.71%)  
**Memory:** 95.8 MB (beats 27.25%)  
**Submitted:** 2026-09-26T23:54:31.039Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }
        int lcs=1;
        for(int n:hs){
            if(hs.contains(n-1)){
                continue;
            }
            else{
                int cn=n;
                int cs=1;
                while(hs.contains(cn+1)){
                    cn++;
                    cs++;
                }
                lcs=Math.max(lcs,cs);
            }
        }
        return lcs;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)