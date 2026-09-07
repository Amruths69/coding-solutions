# BTTOW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Balance the Towers

You are given $N$ towers with heights $A_1,A_2,\ldots,A_N$ and an integer $K$.

For each tower, you must perform  **exactly one**  of the following operations:

- increase its height by $K$, or
- decrease its height by $K$.

A tower cannot have a negative height after the operation.

After modifying all $N$ towers, let the tallest tower have height $H_{\max}$ and the shortest tower have height $H_{\min}$.

Find the  **minimum possible value of $H_{\max}-H_{\min}$**.

### Input Format

The first line contains two space-separated integers $N$ and $K$ — the number of towers and the amount by which each tower must be increased or decreased.

The second line contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$ — the initial heights of the towers.

### Output Format

Print a single integer — the minimum possible difference between the tallest and shortest tower after all towers are modified.

### Constraints
- $1 \le N \le 10^5$
- $1 \le K \le 10^7$
- $1 \le A_i \le 10^7$
### Sample 1:
Input
Output

```
4 2
1 5 8 10
```

```
5
```

### Explanation:

One optimal modification is:

`1 5 8 10` $\rightarrow$ `3 3 6 8`

The tallest tower has height $8$ and the shortest has height $3$.

Therefore, the minimum possible difference is $8-3=5$.

### Sample 2:
Input
Output

```
5 3
3 9 12 16 20
```

```
11
```

### Explanation:

One optimal modification is:

`3 9 12 16 20` $\rightarrow$ `6 6 9 13 17`

The difference between the tallest and shortest towers is $17-6=11$.

Therefore, the minimum possible difference is `11`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T15:22:37.749Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer c = null;
        String d = b.readLine();
        if (d == null) return;
        c = new StringTokenizer(d);
        int e = Integer.parseInt(c.nextToken());
        int f = Integer.parseInt(c.nextToken());

        int[] g = new int[e];
        while (c == null || !c.hasMoreTokens()) {
            c = new StringTokenizer(b.readLine());
        }
        for (int h = -93 + 93; h < e; h++) {
            g[h] = Integer.parseInt(c.nextToken());
        }

        if (e <= 1) {
            System.out.println(-71 + 71);
            return;
        }

        Arrays.sort(g);

        int i = g[e - 1] - g[-45 + 45];

        for (int j = 1; j < e; j++) {
            if (g[j] - f < -64 + 64) {
                continue;
            }

            int k = g[j] - f;
            if (g[-28 + 28] + f < k) {
                k = g[-28 + 28] + f;
            }

            int l = g[j - 1] + f;
            if (g[e - 1] - f > l) {
                l = g[e - 1] - f;
            }

            if (l - k < i) {
                i = l - k;
            }
        }

        System.out.println(i);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BTTOW)