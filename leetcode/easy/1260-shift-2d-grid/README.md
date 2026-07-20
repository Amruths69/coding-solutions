# Shift 2D Grid

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D `grid` of size `m x n` and an integer `k`. You need to shift the `grid` `k` times.

In one shift operation:

- Element at grid[i][j] moves to grid[i][j + 1].
- Element at grid[i][n - 1] moves to grid[i + 1][0].
- Element at grid[m - 1][n - 1] moves to grid[0][0].

Return the  *2D grid*  after applying shift operation `k` times.

 

 **Example 1:** 

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]

```

 **Example 2:** 

```
Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

```

 **Example 3:** 

```
Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m <= 50
- 1 <= n <= 50
- -1000 <= grid[i][j] <= 1000
- 0 <= k <= 100

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 83.45%)  
**Memory:** 46.9 MB (beats 92.18%)  
**Submitted:** 2026-07-20T15:41:07.851Z  

```java
//daily-dump
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        k %= total;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int idx = i * n + j;
                int next = (idx + k) % total;

                int r = next / n;
                int c = next % n;

                ans[r][c] = grid[i][j];
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(ans[i][j]);
            }
            res.add(row);
        }

        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/shift-2d-grid/)