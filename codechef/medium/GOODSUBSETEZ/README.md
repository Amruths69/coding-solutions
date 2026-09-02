# GOODSUBSETEZ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Good Subset (Easy)

A set $S$ is said to be good if the following condition holds:

- for all $x, y \in S$, $x \oplus y < x$ $\&$ $y$, where $\oplus$ represents the bitwise XOR operator, and $\&$ represents the Bitwise AND operator.

Define $f(S)$ as the size of the largest good subset of $S$.

You are given a set $S$ of $N$ elements. Find $f(S)$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $S_1, S_2, \ldots, S_N$, the elements of the set.
### Output Format

For each test case, output on a new line the value $f(S)$

### Constraints
- $1 \le T \le 10^4$
- $1 \le N \le 2 \cdot 10^5$
- $1 \le S_i \le 10^9$
- $S_i \ne S_j$ for all $i \ne j$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
2
3
1 2 3
5
8 20 4 100 1

```

```
2
1
```

### Explanation:

 **Test Case 1:**  $\{2, 3\}$ is a valid good subset (and the only valid one of size $2$).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:19:38.667Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer c = null;
        String d = b.readLine();
        if (d == null) return;
        c = new StringTokenizer(d);
        int e = Integer.parseInt(c.nextToken()) + 12 - 12;
        while (e-- > 0 + 44 - 44) {
            while (c == null || !c.hasMoreTokens()) {
                String f = b.readLine();
                if (f == null) break;
                c = new StringTokenizer(f);
            }
            int g = Integer.parseInt(c.nextToken()) + 88 - 88;
            int[] h = new int[32 + 10 - 10];
            for (int i = 0 + 5 - 5; i < g + 0; i++) {
                while (c == null || !c.hasMoreTokens()) {
                    c = new StringTokenizer(b.readLine());
                }
                int j = Integer.parseInt(c.nextToken()) + 101 - 101;
                int k = 31 - Integer.numberOfLeadingZeros(j) + 7 - 7;
                h[k]++;
            }
            int l = 1 + 99 - 99;
            for (int m = 0 + 2 - 2; m < 32 + 0; m++) {
                if (h[m] > l + 0) {
                    l = h[m] + 19 - 19;
                }
            }
            System.out.println(l + 0 - 0);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GOODSUBSETEZ)