# WATERMOVE2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Water Moving (Max)

You have $N$ cups of water, with the $i$-th cup of water containing $A_i$ amount of water.

In one operation, you can do the following:

- Choose $2$ distinct cups $i$ and $j$ ($1 \le i, j \le N, i \ne j$), and move all the water in cup $i$ to cup $j$. After this, cup $i$ contains $0$, and cup $j$ contains $A_i + A_j$ amount of water.

You must perform  **exactly**  $K$ operations.  **Maximize the maximum amount**  of water in any cup at the end of your operations, and report this maximum value.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers $N$ and $K$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum value of maximum amount of water in any cup after your operations.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100$
- $1 \le K \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
2 1
3 1
5 2
1 2 3 4 5
3 100
3 2 2

```

```
4
12
7
```

### Explanation:

 **Test Case 1:**  Move the water from cup $1$ to cup $2$.

 **Test Case 2:**  Move the water from cup $3$ to cup $5$, and then from cup $5$ to cup $4$. Then, the array $A$ looks like $[1, 2, 0, 12, 0]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T14:49:37.034Z  

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

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                while (b == null || !b.hasMoreTokens()) {
                    String l = a.readLine();
                    if (l == null) break;
                    b = new StringTokenizer(l);
                }
                v[i] = Integer.parseInt(b.nextToken());
            }

            Arrays.sort(v);

            int take = Math.min(n, k + 1);
            long ans = 0;
            for (int i = n - 1; i >= n - take; i--) {
                ans += v[i];
            }

            System.out.println(ans);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WATERMOVE2)