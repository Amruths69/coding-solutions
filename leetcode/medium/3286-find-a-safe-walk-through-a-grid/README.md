# Find a Safe Walk Through a Grid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` binary matrix `grid` and an integer `health`.

You start on the upper-left corner `(0, 0)` and would like to get to the lower-right corner `(m - 1, n - 1)`.

You can move up, down, left, or right from one cell to another adjacent cell as long as your health  *remains*   **positive**.

Cells `(i, j)` with `grid[i][j] = 1` are considered  **unsafe**  and reduce your health by 1.

Return `true` if you can reach the final cell with a health value of 1 or more, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  grid = [[0,1,0,0,0],[0,1,0,1,0],[0,0,0,1,0]], health = 1

 **Output:**  true

 **Explanation:** 

The final cell can be reached safely by walking along the gray cells below.

 **Example 2:** 

 **Input:**  grid = [[0,1,1,0,0,0],[1,0,1,0,0,0],[0,1,1,1,0,1],[0,0,1,0,1,0]], health = 3

 **Output:**  false

 **Explanation:** 

A minimum of 4 health points is needed to reach the final cell safely.

 **Example 3:** 

 **Input:**  grid = [[1,1,1],[1,0,1],[1,1,1]], health = 5

 **Output:**  true

 **Explanation:** 

The final cell can be reached safely by walking along the gray cells below.

Any path that does not go through the cell `(1, 1)` is unsafe since your health will drop to 0 when reaching the final cell.

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 50
- 2 <= m * n
- 1 <= health <= m + n
- grid[i][j] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 63.11%)  
**Memory:** 47 MB (beats 70.49%)  
**Submitted:** 2026-07-02T03:19:13.396Z  

```java
class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int start = grid.get(0).get(0);

        dist[0][0] = start;
        pq.offer(new int[]{start, 0, 0});

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!pq.isEmpty()) {

            int[] cur = pq.poll();

            int cost = cur[0];
            int r = cur[1];
            int c = cur[2];

            if (r == m - 1 && c == n - 1) {
                return cost < health;
            }

            if (cost > dist[r][c]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n) {

                    int newCost = cost + grid.get(nr).get(nc);

                    if (newCost < dist[nr][nc]) {

                        dist[nr][nc] = newCost;
                        pq.offer(new int[]{newCost, nr, nc});
                    }
                }
            }
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-a-safe-walk-through-a-grid/)