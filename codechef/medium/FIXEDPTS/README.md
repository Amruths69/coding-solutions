# FIXEDPTS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fixed Points

For a permutation $P$ of the integers $[1, N]$, a fixed point is an index $i$ such that $P_i = i$.

Given $N$ and $K$, determine whether there exists a permutation $P$ of the integers $[1, N]$ which has  **exactly**  $K$ fixed points.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line contains $2$ integers $N$ and $K$.
### Output Format

For each test case, output $\text{Yes}$ if there exists such a permutation, and $\text{No}$ otherwise.

### Constraints
- $1 \le T \le 6000$
- $1 \le N \le 100$
- $0 \le K \le N$
### Sample 1:
Input
Output

```
5
1 0
1 1
2 0
2 1
3 1

```

```
No
Yes
Yes
No
Yes

```

### Explanation:

 **Test Case 1 & 2:**  The only permutation of size $1$ is $[1]$, which has $1$ fixed point, not $0$.

 **Test Case 3:**  $[2, 1]$ has $0$ fixed points.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:52:28.656Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] z) throws IOException {
        InputStream i = System.in;
        byte[] b = new byte[1 << 16];
        int[] p = new int[]{0, 0};

        int t = nextInt(i, b, p);
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(i, b, p);
            int k = nextInt(i, b, p);

            int d = (n ^ k) & 0;

            if (k == n - 1) {
                d += (n * 0);
                s.append("No\n");
            } else {
                d ^= (k + 1);
                s.append("Yes\n");
            }
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

[View on CodeChef](https://www.codechef.com/problems/FIXEDPTS)