# Q1. Count Values With Equally Spaced Occurrences I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

An integer `x` is called  **special**  if:

- x appears exactly three times in nums.
- All three occurrences of x are equally spaced in nums. In other words, if all occurrences of x are at indices i1 < i2 < i3, then i2 - i1 = i3 - i2.

Return the number of  **distinct**  special integers in `nums`.

 

 **Example 1:** 

 **Input:**  nums = [1,8,1,5,1,5,8,5]

 **Output:**  2

 **Explanation:** 

- 1 is special because it occurs exactly three times at equally spaced indices 0, 2, and 4.
- 5 is special because it occurs exactly three times at equally spaced indices 3, 5, and 7.
- 8 is not special because it occurs only twice.

Therefore, the answer is 2.

 **Example 2:** 

 **Input:**  nums = [8,8,8,8]

 **Output:**  0

 **Explanation:** 

8 is not special because it does not occur exactly three times. Therefore, the answer is 0.

 **Example 3:** 

 **Input:**  nums = [8,6,6,8,8]

 **Output:**  0

 **Explanation:** 

8 occurs at indices 0, 3, and 4, which are not equally spaced. 6 occurs only twice. Therefore, no integer is special.

 

 **Constraints:** 

- 3 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 100.00%)  
**Memory:** 47.1 MB  
**Submitted:** 2026-09-12T14:51:21.510Z  

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.putIfAbsent(nums[i],new ArrayList<>());
            hm.get((nums[i])).add(i);
            
        }
        int c=0;
        for(List<Integer> i: hm.values()){
            if(i.size()==3){
            int i1=i.get(0);
            int i2=i.get(1);
            int i3=i.get(2);
            if(i2-i1==i3-i2){
                c++;
            }}
        }
        return c;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/)