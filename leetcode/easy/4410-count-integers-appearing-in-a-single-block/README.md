# Q1. Count Integers Appearing in a Single Block

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

An integer `x` is  **special**  if all occurrences of `x` in `nums` appear in a single  **contiguous**  block.

Return the number of  **distinct**  special integers in `nums`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,2,1]

 **Output:**  1

 **Explanation:** 

- 1 appears at indices 0 and 3, forming two separate blocks, so it is not special.
- 2 appears in a single contiguous block at indices [1, 2], so it is special.

Therefore, there is one special integer.

 **Example 2:** 

 **Input:**  nums = [3,3,1,2,2,1]

 **Output:**  2

 **Explanation:** 

- 3 appears in a single contiguous block at indices [0, 1], so it is special.
- 1 appears at indices 2 and 5, forming two separate blocks, so it is not special.
- 2 appears in a single contiguous block at indices [3, 4], so it is special.

Therefore, there are two special integers.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 100.00%)  
**Memory:** 43.7 MB (beats 100.00%)  
**Submitted:** 2026-08-30T03:03:31.721Z  

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        ArrayList<Integer>c=new ArrayList<>();
        for(int i:nums){
            if(c.isEmpty()||c.get(c.size()-1)!=i){
                c.add(i);
            }
        }
        HashMap<Integer,Integer>f=new HashMap<>();
        for(int i:c){
            f.put(i,f.getOrDefault(i,0)+1);
        }
        int sc=0;
        for(int p:f.values()){
            if(p==1)
                sc++;
        }
        return sc;
        
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-integers-appearing-in-a-single-block/)