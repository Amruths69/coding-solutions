# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 6.83%)  
**Memory:** 48.2 MB (beats 6.82%)  
**Submitted:** 2026-07-27T17:22:53.028Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int c=0;
        int g=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[g]=nums[i];
                c++;
                g++;
            }
        }
        for(int j=c;j<n;j++){
            nums[j]=0;
        }
        System.out.println(Arrays.toString(nums));
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)