# Q1. Number of Intersecting Interval Pairs I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a 2D integer array `intervals` of `n` elements, where `intervals[i] = [starti, endi]` represents the  **closed** interval from `starti` to `endi`.

Return the number of pairs of indices `(i, j)` such that `0 <= i < j < n` and `intervals[i]` and `intervals[j]`  **intersect**.

Two intervals  **intersect**  if they have at least one point in common, including when they only share an endpoint.

 

 **Example 1:** 

 **Input:**  intervals = [[1,2],[2,3],[3,4]]

 **Output:**  2

 **Explanation:** 

There are 2 intersecting interval pairs:

- Intervals [1, 2] and [2, 3] intersect at the point 2.
- Intervals [2, 3] and [3, 4] intersect at the point 3.

 **Example 2:** 

 **Input:**  intervals = [[1,5],[2,4],[3,6]]

 **Output:**  3

 **Explanation:** 

There are 3 intersecting interval pairs:

- The intersection of [1, 5] and [2, 4] is [2, 4].
- The intersection of [1, 5] and [3, 6] is [3, 5].
- The intersection of [2, 4] and [3, 6] is [3, 4].

 **Example 3:** 

 **Input:**  intervals = [[1,2],[3,4],[5,6]]

 **Output:**  0

 **Explanation:** 

There are no intersecting interval pairs. Hence, the answer is 0.

 

 **Constraints:** 

- 2 <= n == intervals.length <= 100
- intervals[i] = [starti, endi]
- 0 <= starti <= endi <= 100

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 100.00%)  
**Memory:** 47.1 MB  
**Submitted:** 2026-09-20T03:51:13.821Z  

```java
class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int c=0;
        int n=intervals.length;
        for(int i=0;i<n;i++){
        
        for(int j=i+1;j<n;j++){
            if(intervals[i][0]<=intervals[j][1]&&intervals[j][0]<=intervals[i][1]){
                c++;
            }
        }}
        return c;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-intersecting-interval-pairs-i/)