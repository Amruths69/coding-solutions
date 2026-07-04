# Network Recovery Pathways

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a directed acyclic graph of `n` nodes numbered from 0 to `n − 1`. This is represented by a 2D array `edges` of length `m`, where `edges[i] = [ui, vi, costi]` indicates a one‑way communication from node `ui` to node `vi` with a recovery cost of `costi`.

Some nodes may be offline. You are given a boolean array `online` where `online[i] = true` means node `i` is online. Nodes 0 and `n − 1` are always online.

A path from 0 to `n − 1` is  **valid**  if:

- All intermediate nodes on the path are online.
- The total recovery cost of all edges on the path does not exceed k.

For each valid path, define its  **score**  as the minimum edge‑cost along that path.

Return the  **maximum**  path score (i.e., the largest  **minimum** -edge cost) among all valid paths. If no valid path exists, return -1.

 

 **Example 1:** 

 **Input:**  edges = [[0,1,5],[1,3,10],[0,2,3],[2,3,4]], online = [true,true,true,true], k = 10

 **Output:**  3

 **Explanation:** 

- The graph has two possible routes from node 0 to node 3: Path 0 → 1 → 3 Total cost = 5 + 10 = 15, which exceeds k (15 > 10), so this path is invalid. Path 0 → 2 → 3 Total cost = 3 + 4 = 7 <= k, so this path is valid. The minimum edge‐cost along this path is min(3, 4) = 3.
- There are no other valid paths. Hence, the maximum among all valid path‐scores is 3.

 **Example 2:** 

 **Input:**  edges = [[0,1,7],[1,4,5],[0,2,6],[2,3,6],[3,4,2],[2,4,6]], online = [true,true,true,false,true], k = 12

 **Output:**  6

 **Explanation:** 

- Node 3 is offline, so any path passing through 3 is invalid.
- Consider the remaining routes from 0 to 4: Path 0 → 1 → 4 Total cost = 7 + 5 = 12 <= k, so this path is valid. The minimum edge‐cost along this path is min(7, 5) = 5. Path 0 → 2 → 3 → 4 Node 3 is offline, so this path is invalid regardless of cost. Path 0 → 2 → 4 Total cost = 6 + 6 = 12 <= k, so this path is valid. The minimum edge‐cost along this path is min(6, 6) = 6.
- Among the two valid paths, their scores are 5 and 6. Therefore, the answer is 6.

 

 **Constraints:** 

- n == online.length
- 2 <= n <= 5 * 104
- 0 <= m == edges.length <= min(105, n * (n - 1) / 2)
- edges[i] = [ui, vi, costi]
- 0 <= ui, vi < n
- ui != vi
- 0 <= costi <= 109
- 0 <= k <= 5 * 1013
- online[i] is either true or false, and both online[0] and online[n − 1] are true.
- The given graph is a directed acyclic graph.

## Solution

**Language:** Java  
**Runtime:** 168 ms (beats 42.57%)  
**Memory:** 173.5 MB (beats 60.40%)  
**Submitted:** 2026-07-03T14:02:28.079Z  

```java
import java.util.*;

class Solution {

    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {

        int n = online.length;

        List<int[]>[] g = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }

        int[] indeg = new int[n];

        int mx = 0;

        for (int[] e : edges) {

            int u = e[0];
            int v = e[1];
            int w = e[2];

            g[u].add(new int[]{v, w});

            indeg[v]++;

            mx = Math.max(mx, w);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {

            int u = q.poll();

            topo.add(u);

            for (int[] e : g[u]) {

                int v = e[0];

                indeg[v]--;

                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }

        int l = 0;
        int r = mx;

        int ans = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (ok(mid, g, topo, online, k, n)) {

                ans = mid;

                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return ans;
    }

    boolean ok(int x,
               List<int[]>[] g,
               List<Integer> topo,
               boolean[] online,
               long k,
               int n) {

        long INF = Long.MAX_VALUE / 4;

        long[] dp = new long[n];

        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int u : topo) {

            if (dp[u] == INF) {
                continue;
            }

            if (u != 0 && u != n - 1 && !online[u]) {
                continue;
            }

            for (int[] e : g[u]) {

                int v = e[0];
                int w = e[1];

                if (w < x) {
                    continue;
                }

                if (v != n - 1 && !online[v]) {
                    continue;
                }

                dp[v] = Math.min(dp[v], dp[u] + w);
            }
        }

        return dp[n - 1] <= k;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/network-recovery-pathways/)