# Q1. Sum of Integers with Maximum Digit Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

The  **digit range**  of an integer is defined as the difference between its  **largest**  digit and  **smallest**  digit.

For example, the digit range of 5724 is `7 - 2 = 5`.

Return the sum of all integers in `nums` whose  **digit range**  is equal to the  **maximum digit range**  among all integers in the array.

 

 **Example 1:** 

 **Input:**  nums = [5724,111,350]

 **Output:**  6074

 **Explanation:** 

`i`	`nums[i]`	Largest	Smallest	Digit Range
0	5724	7	2	5
1	111	1	1	0
2	350	5	0	5

The maximum digit range is 5. The integers with this digit range are 5724 and 350, so the answer is `5724 + 350 = 6074`.

 **Example 2:** 

 **Input:**  nums = [90,900]

 **Output:**  990

 **Explanation:** 

`i`	`nums[i]`	Largest	Smallest	Digit Range
0	90	9	0	9
1	900	9	0	9

The maximum digit range is 9. Both integers have this digit range, so the answer is `90 + 900 = 990`.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 10 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 45.2 MB (beats 100.00%)  
**Submitted:** 2026-07-05T03:12:49.950Z  

```java
class Solution {
    public int maxDigitRange(int[] nums) {
        
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
                int h=nums[i];
                int max=0;
                int min=9;
                while(h>0){
                    int d=h%10;
                    if(d>max){
                        max=d;
                    }if(d<min){
                        min=d;
                    }
                    h=h/10;
                }
            ans[i]=max-min;
            
            
            
        }
        int r=0;
        int k=0;
        
        for(int i=0;i<ans.length;i++){
            
            if(ans[i]>r){
                r=ans[i];
                    
            }
            
        }
        
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(ans[i]==r){
                s+=nums[i];
            }
        }
        return s;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-integers-with-maximum-digit-range/)