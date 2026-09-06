# Search a 2D Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` integer matrix `matrix` with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true`  *if*  `target`  *is in*  `matrix`  *or*  `false`  *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 

 **Example 1:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

```

 **Example 2:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.7 MB (beats 90.70%)  
**Submitted:** 2026-09-06T10:52:26.477Z  

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r){
            int mi = l + (r-l)/2;
            int mv=matrix[mi/n][mi%n];
            if(mv>target){
                r=mi-1;
            }else if(mv<target){
                l=mi+1;

            }else if(mv==target){

                return true;
            }
        }
        return false;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix/)