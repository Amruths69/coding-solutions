# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.7 MB (beats 54.72%)  
**Submitted:** 2026-09-04T00:10:26.810Z  

```java
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int t=0;
        int lm=height[0];
        int rm=height[r];
        while(l<r){
            if(height[l]<height[r]){
                lm=Math.max(lm,height[l]);
                if(lm-height[l]>0)
                t=t+lm-height[l];
                l++;
                
            }else{
                rm=Math.max(rm,height[r]);
                if(rm-height[r]>0)
                t=t+rm-height[r];
                r--;
            }
        }
        return t;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)