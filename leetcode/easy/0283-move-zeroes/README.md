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
**Runtime:** 11 ms (beats 7.57%)  
**Memory:** 48.2 MB (beats 6.71%)  
**Submitted:** 2026-07-13T09:00:08.378Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int sm=0;
        int c=0;
        int bi=nums.length;
        
        int r=nums.length;
        
        int t=0;
        while(l<r){
            if(nums[l]!=0){
                nums[t]=nums[l];
                t++;
                c++;
            }
           
            
            l++;


        }
        while(c<bi){
            
            nums[c]=0;
            
        c++;
        }
        
        System.out.println(Arrays.toString(nums));
        
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)