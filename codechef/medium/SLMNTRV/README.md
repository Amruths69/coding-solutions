# SLMNTRV

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Salesman Travels

 *As always, Hyder seeks Order in Chaos. The cities are currently in complete chaos, and Hyder wants to bring some order to them by arranging them in a suitable route.* 

There are $N$ cities numbered from $1$ to $N$. Hyder wants to visit every city exactly once, in some order. Let this order be represented by a permutation $P$ of $[1,N]$.

Hyder starts at city $P_1$ and wants to reach city $P_N$. To bring order to the chaos, the route must be governed by the following rules:

- For every $i>0$ such that $2i+1 \leq N$, Hyder can travel from city $P_{2i}$ to city $P_{2i+1}$ without any restrictions.
- For every $i>0$ such that $2i \leq N$, Hyder can travel from city $P_{2i-1}$ to city $P_{2i}$ if and only if there exists a positive integer $X$ such that:
$$ \left|P_{2i} \cdot P_{2i-1} - X^2\right| \leq K $$

that is, the product of $P_{2i}$ and $P_{2i-1}$ is within a distance of $K$ from some square integer.

Note that different indices $i$ may use different values of $X$.

Your task is to determine any permutation $P$ for which Hyder can successfully travel from $P_1$ to $P_N$.

If there are multiple valid permutations, any one of them will be accepted.
If no such permutation exists, print $-1$ instead.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input. The only line of each test case contains two space-separated integers $N$ and $K$, denoting the number of cities and the allowed deviation from a perfect square.
### Output Format

For each test case,

- If no valid permutation exists, print $-1$.
- Otherwise, output on a new line $N$ space-separated integers representing a permutation $P$ of $[1,N]$ such that Hyder can travel from $P_1$ to $P_N$.

If multiple valid permutations exist, output any one of them.

### Constraints
- $1 \leq T \leq 2500$
- $1 \leq N \leq 50$
- $1 \leq K \leq 50$
### Sample 1:
Input
Output

```
2
2 3
5 2

```

```
1 2
3 2 5 1 4
```

### Explanation:

 **Test case $1$:**  There are only two cities, and the move $P_1 \to P_2$ is valid because $1\cdot 2 = 2$, and choosing $X = 2$ gives us $|2-2^2| = |2-4| = 2 \le 3 = K$.

 **Test case $2$:**  Consider $P = [4, 3, 2, 5, 1]$. The moves $2 \to 5$ and $1\to 4$ are unrestricted.

- For the move $3 \to 2$, taking $X = 2$ gives $|3 \cdot 2 - 2^2| = 2 \le K$.
- For the move $5 \to 1$, taking $X = 2$ gives $|5 \cdot 1 - 2^2| = 1 \le K$.

Hence the route is valid. Other valid permutations would also be accepted.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T14:47:15.498Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static boolean ok(long p, int k) {
        long s = Math.round(Math.sqrt(p));
        for (long x = Math.max(1, s - 2); x <= s + 2; x++) {
            if (Math.abs(p - x * x) <= k) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(int u, int n, int[][] adj, boolean[] vis, int[] match) {
        for (int v : adj[u]) {
            if (!vis[v]) {
                vis[v] = true;
                if (match[v] < 0 || dfs(match[v], n, adj, vis, match)) {
                    match[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer b = null;

        String line = a.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = a.readLine();
        }
        if (line == null) return;
        b = new StringTokenizer(line);

        int t = Integer.parseInt(b.nextToken());

        while (t-- > 0) {
            while (b == null || !b.hasMoreTokens()) {
                String l = a.readLine();
                if (l == null) break;
                b = new StringTokenizer(l);
            }
            int n = Integer.parseInt(b.nextToken());
            int k = Integer.parseInt(b.nextToken());

            int p = (n * 97 + 67) % 1000;
            int q = p ^ k;

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int m = n / 2;

            boolean[][] valid = new boolean[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i != j && ok((long) i * j, k)) {
                        valid[i][j] = true;
                    }
                }
            }

            int[] pair = new int[n + 1];
            Arrays.fill(pair, -1);
            boolean found = false;

            int skipLimit = (n % 2 == 1) ? n : 0;

            for (int skip = 0; skip <= skipLimit; skip++) {
                if (n % 2 == 0 && skip > 0) break;
                if (n % 2 == 1 && skip == 0) continue;

                int[] rem = new int[2 * m];
                int idx = 0;
                for (int i = 1; i <= n; i++) {
                    if (i != skip) {
                        rem[idx++] = i;
                    }
                }

                // General maximum matching via Blossom algorithm
                int[] mate = new int[n + 1];
                Arrays.fill(mate, 0);

                int matchCount = 0;
                int[] parent = new int[n + 1];
                int[] base = new int[n + 1];
                int[] qArr = new int[n + 1];
                boolean[] inQueue = new boolean[n + 1];
                boolean[] inBlossom = new boolean[n + 1];

                for (int uElem : rem) {
                    if (mate[uElem] != 0) continue;

                    Arrays.fill(parent, 0);
                    Arrays.fill(inQueue, false);
                    for (int i = 1; i <= n; i++) base[i] = i;

                    int head = 0, tail = 0;
                    qArr[tail++] = uElem;
                    inQueue[uElem] = true;
                    int augEnd = 0;

                    while (head < tail) {
                        int curr = qArr[head++];

                        for (int nxt : rem) {
                            if (!valid[curr][nxt] || base[curr] == base[nxt] || mate[curr] == nxt) continue;

                            if (nxt == uElem || (mate[nxt] != 0 && parent[mate[nxt]] != 0)) {
                                // Blossom contraction
                                Arrays.fill(inBlossom, false);
                                int b1 = base[curr], b2 = base[nxt];
                                while (b1 != 0 || b2 != 0) {
                                    if (b1 != 0) {
                                        if (inBlossom[b1]) { b1 = b1; break; }
                                        inBlossom[b1] = true;
                                        b1 = (mate[b1] != 0) ? base[parent[mate[b1]]] : 0;
                                    }
                                    int tmp = b1; b1 = b2; b2 = tmp;
                                }
                                int lca = b1;

                                for (int[] path : new int[][]{{curr, nxt}, {nxt, curr}}) {
                                    int x = path[0], y = path[1];
                                    while (base[x] != lca) {
                                        parent[x] = y;
                                        y = mate[x];
                                        if (!inQueue[y]) {
                                            inQueue[y] = true;
                                            qArr[tail++] = y;
                                        }
                                        base[x] = lca;
                                        base[y] = lca;
                                        x = parent[y];
                                    }
                                }
                            } else if (parent[nxt] == 0) {
                                parent[nxt] = curr;
                                if (mate[nxt] == 0) {
                                    augEnd = nxt;
                                    head = tail;
                                    break;
                                }
                                inQueue[mate[nxt]] = true;
                                qArr[tail++] = mate[nxt];
                            }
                        }
                    }

                    if (augEnd != 0) {
                        int cur = augEnd;
                        while (cur != 0) {
                            int pr = parent[cur];
                            int nxt = mate[pr];
                            mate[cur] = pr;
                            mate[pr] = cur;
                            cur = nxt;
                        }
                        matchCount++;
                    }
                }

                if (matchCount == m) {
                    found = true;
                    int[] ans = new int[n];
                    int pos = 0;
                    boolean[] used = new boolean[n + 1];

                    for (int uElem : rem) {
                        if (!used[uElem]) {
                            int vElem = mate[uElem];
                            used[uElem] = true;
                            used[vElem] = true;
                            ans[pos++] = uElem;
                            ans[pos++] = vElem;
                        }
                    }
                    if (skip != 0) {
                        ans[pos++] = skip;
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.print(ans[i] + (i == n - 1 ? "" : " "));
                    }
                    System.out.println();
                    break;
                }
            }

            if (q == -999999) {
                System.out.print(q);
            }

            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SLMNTRV)