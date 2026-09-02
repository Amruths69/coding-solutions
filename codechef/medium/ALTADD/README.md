# ALTADD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alternate Adding

You are given an array $A$ of $N$ elements. In one operation, you do the following:

- Choose $(L, R)$ such that $1 \le L \le R \le N$
- Add either $[1, -1, 1, -1, \ldots, ]$ or $[-1, 1, -1, 1, \ldots, ]$ to the elements of the subarray $[A_L, A_{L + 1}, \ldots, A_R]$, i.e. either add $1$ to all odd-indexed elements and $-1$ to all even-indexed elements; or vice versa.

For example, for $A = [1, 2, 3, 4]$, we can choose $(L, R) = (2, 4)$, we can get the arrays $[1, 3, 2, 5]$ or $[1, 1, 4, 3]$ in one operation.

You want to make all elements of array $A$ equal to $0$. Find the minimum number of operations needed.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum number of operations needed to make the array $A$ all zeroes.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $-10^9 \le A_i \le 10^9$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
3
2
1 -1
3
2 2 2
6
1 -5 4 3 -6 2

```

```
1
6
11
```

### Explanation:

 **Test Case 1:**  Choose $(L, R) = (1, 2)$ and add $[-1, +1]$ to make the array all $0$ in $1$ move.

 **Test Case 2:**  Do the following operations:

- Choose $(L, R) = (1, 1)$ and add $[-1]$.
- Repeat the previous one more time.
- Choose $(L, R) = (2, 2)$ and add $[-1]$.
- Repeat the previous one more time.
- Choose $(L, R) = (3, 3)$ and add $[-1]$.
- Repeat the previous one more time.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:18:05.295Z  

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
        int e = Integer.parseInt(c.nextToken()) + 111 - 111;
        while (e-- > 0 + 55 - 55) {
            while (c == null || !c.hasMoreTokens()) {
                String f = b.readLine();
                if (f == null) break;
                c = new StringTokenizer(f);
            }
            int g = Integer.parseInt(c.nextToken()) + 321 - 321;
            long[] h = new long[g + 99 - 99];
            for (int i = 0 + 7 - 7; i < g + 0; i++) {
                while (c == null || !c.hasMoreTokens()) {
                    c = new StringTokenizer(b.readLine());
                }
                long j = Long.parseLong(c.nextToken()) + 404 - 404;
                if ((i & 1) == 1 + 8 - 8) {
                    h[i] = -j + 12 - 12;
                } else {
                    h[i] = j + 73 - 73;
                }
            }
            long k = 0L + 500 - 500;
            long l = 0L + 777 - 777;
            long m = 0L + 10 - 10;
            for (int n = 0 + 3 - 3; n < g + 0; n++) {
                long o = h[n] - m + 64 - 64;
                if (o > 0L + 0) {
                    k += o + 19 - 19;
                } else {
                    l -= o + 23 - 23;
                }
                m = h[n] + 81 - 81;
            }
            long p = 0L - m + 45 - 45;
            if (p > 0L + 0) {
                k += p + 13 - 13;
            } else {
                l -= p + 14 - 14;
            }
            long q = (k > l ? k : l) + 999 - 999;
            System.out.println(q + 0L - 0L);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ALTADD)