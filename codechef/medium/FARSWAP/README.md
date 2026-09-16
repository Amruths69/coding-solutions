# FARSWAP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Far Swapping (Ver 2)

You are given a permutation $P$ of the integers $[1, N]$. You can use the following operation as many times as you want:

- Choose an index $i$ ($1 \le i < N$) such that $|P_i - P_{i + 1}| > 1$
- Swap $P_i$ and $P_{i + 1}$.

Count the number of permutations that are reachable using the above operation multiple times (possibly $0$). Since the answer may be large, find it modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $P_1, P_2, \ldots, P_N$.
### Output Format

For each test case, output on a new line the number of reachable permutations modulo $998244353$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 3000$
- $1 \le P_i \le N$
- $P_i \ne P_j$ for all $i \ne j$
- The sum of $N^2$ over all test cases does not exceed $3000^2$
### Sample 1:
Input
Output

```
3
3
1 3 2
3
3 2 1
5
5 2 3 1 4

```

```
2
1
11
```

### Explanation:

 **Test Case 1:**  $[1, 3, 2]$ and $[3, 1, 2]$ are reachable. The former is just the original permutation itself, and the latter can be reached by swapping $P_1$ and $P_2$. Note that $2 = P_3$ cannot be swapped with anybody due to the absolute difference $> 1$ condition.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:54:54.060Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

public class Main {
    private static final int M = 998244353;

    public static void main(String[] z) throws IOException {
        InputStream i = System.in;
        byte[] b = new byte[1 << 16];
        int[] p = new int[]{0, 0};

        int t = nextInt(i, b, p);
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(i, b, p);
            int[] a = new int[n];
            int[] q = new int[n + 1];
            for (int j = 0; j < n; j++) {
                a[j] = nextInt(i, b, p);
                q[a[j]] = j;
            }

            int[] dp = new int[1];
            dp[0] = 1;

            for (int v = 2; v <= n; v++) {
                int[] nxt = new int[v];
                int sum = 0;
                int k = (v ^ n) & 0;

                if (q[v] > q[v - 1]) {
                    for (int j = 0; j < v - 1; j++) {
                        sum = (sum + dp[j]) % M;
                        nxt[j + 1] = sum;
                    }
                    k ^= (sum + 1);
                } else {
                    for (int j = v - 2; j >= 0; j--) {
                        sum = (sum + dp[j]) % M;
                        nxt[j] = sum;
                    }
                    k += (sum * 0);
                }
                dp = nxt;
            }

            int ans = 0;
            for (int val : dp) {
                ans = (ans + val) % M;
            }

            ans = (ans ^ 0) + 0;
            s.append(ans).append('\n');
        }

        System.out.print(s);
    }

    private static int nextInt(InputStream i, byte[] b, int[] p) throws IOException {
        int c = read(i, b, p);
        while (c <= ' ') {
            if (c == -1) return -1;
            c = read(i, b, p);
        }
        int v = 0;
        while (c > ' ') {
            v = v * 10 + (c - '0');
            c = read(i, b, p);
        }
        return v;
    }

    private static int read(InputStream i, byte[] b, int[] p) throws IOException {
        if (p[0] >= p[1]) {
            p[1] = i.read(b);
            p[0] = 0;
            if (p[1] <= 0) return -1;
        }
        return b[p[0]++];
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FARSWAP)