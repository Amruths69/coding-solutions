# Minimum Moves to Clean the Classroom

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` grid `classroom` where a student volunteer is tasked with cleaning up litter scattered around the room. Each cell in the grid is one of the following:

- 'S': Starting position of the student
- 'L': Litter that must be collected (once collected, the cell becomes empty)
- 'R': Reset area that restores the student's energy to full capacity, regardless of their current energy level (can be used multiple times)
- 'X': Obstacle the student cannot pass through
- '.': Empty space

You are also given an integer `energy`, representing the student's maximum energy capacity. The student starts with this energy from the starting position `'S'`.

Each move to an adjacent cell (up, down, left, or right) costs 1 unit of energy. If the energy reaches 0, the student can only continue if they are on a reset area `'R'`, which resets the energy to its  **maximum**  capacity `energy`.

Return the  **minimum**  number of moves required to collect all litter items, or `-1` if it's impossible.

 

 **Example 1:** 

 **Input:**  classroom = ["S.", "XL"], energy = 2

 **Output:**  2

 **Explanation:** 

- The student starts at cell (0, 0) with 2 units of energy.
- Since cell (1, 0) contains an obstacle 'X', the student cannot move directly downward.
- A valid sequence of moves to collect all litter is as follows: Move 1: From (0, 0) → (0, 1) with 1 unit of energy and 1 unit remaining. Move 2: From (0, 1) → (1, 1) to collect the litter 'L'.
- The student collects all the litter using 2 moves. Thus, the output is 2.

 **Example 2:** 

 **Input:**  classroom = ["LS", "RL"], energy = 4

 **Output:**  3

 **Explanation:** 

- The student starts at cell (0, 1) with 4 units of energy.
- A valid sequence of moves to collect all litter is as follows: Move 1: From (0, 1) → (0, 0) to collect the first litter 'L' with 1 unit of energy used and 3 units remaining. Move 2: From (0, 0) → (1, 0) to 'R' to reset and restore energy back to 4. Move 3: From (1, 0) → (1, 1) to collect the second litter 'L'.
- The student collects all the litter using 3 moves. Thus, the output is 3.

 **Example 3:** 

 **Input:**  classroom = ["L.S", "RXL"], energy = 3

 **Output:**  -1

 **Explanation:** 

No valid path collects all `'L'`.

 

 **Constraints:** 

- 1 <= m == classroom.length <= 20
- 1 <= n == classroom[i].length <= 20
- classroom[i][j] is one of 'S', 'L', 'R', 'X', or '.'
- 1 <= energy <= 50
- There is exactly one 'S' in the grid.
- There are at most 10 'L' cells in the grid.

## Solution

**Language:** Java  
**Runtime:** 482 ms (beats 66.67%)  
**Memory:** 285.5 MB (beats 9.52%)  
**Submitted:** 2026-09-01T00:47:06.512Z  

```java
import java.util.*;

class Solution {
    public int minMoves(String[] a, int e) {

        int m = a.length;
        int n = a[0].length();

        int sr = 0;
        int sc = 0;

        int[][] l = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(l[i], -1);

            for (int j = 0; j < n; j++) {
                if (a[i].charAt(j) == 'S') {
                    sr = i;
                    sc = j;
                }
            }
        }

        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i].charAt(j) == 'L') {
                    l[i][j] = k++;
                }
            }
        }

        int f = (1 << k) - 1;

        boolean[][][][] v =
            new boolean[m][n][e + 1][1 << k];

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr, sc, e, 0});
        v[sr][sc][e][0] = true;

        int d = 0;

        int[] r = {-1, 1, 0, 0};
        int[] c = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int s = q.size();

            while (s-- > 0) {

                int[] x = q.poll();

                int i = x[0];
                int j = x[1];
                int z = x[2];
                int b = x[3];

                if (b == f)
                    return d;

                for (int t = 0; t < 4; t++) {

                    int ni = i + r[t];
                    int nj = j + c[t];

                    if (ni < 0 || ni >= m || nj < 0 || nj >= n)
                        continue;

                    if (a[ni].charAt(nj) == 'X')
                        continue;

                    if (z == 0)
                        continue;

                    int nz = z - 1;

                    if (a[ni].charAt(nj) == 'R')
                        nz = e;

                    int nb = b;

                    if (a[ni].charAt(nj) == 'L')
                        nb |= (1 << l[ni][nj]);

                    if (!v[ni][nj][nz][nb]) {

                        v[ni][nj][nz][nb] = true;

                        q.offer(new int[]{
                            ni, nj, nz, nb
                        });
                    }
                }
            }

            d++;
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/)