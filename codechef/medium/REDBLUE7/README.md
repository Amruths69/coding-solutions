# REDBLUE7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Red and Blue Elements

You are given an array $A$ of $N$ integers. You want to colour each element either red or blue.

After doing so, let $S_R$ denote the sum of all red elements, $S_B$ denote the sum of all blue elements, $C_R$ denote the count of red elements, and $C_B$ denote the count of blue elements.

Find the maximum possible value of $S_R \cdot C_B + S_B \cdot C_R$ over all possible colourings.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum value of $S_R \cdot C_B + S_B \cdot C_R$.

### Constraints
- $1 \leq T \leq 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le A_i \le 10^7$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
3
3
1 1 1
3
4 2 1
5
6 4 8 3 7

```

```
4
11
71
```

### Explanation:

 **Test Case 1:**  We can colour the first element red, and the other $2$ blue. Then, $S_R = C_R = 1$ and $S_B = C_B = 2$, and the value $S_R \cdot C_B + S_B \cdot C_R$ is $4$.

 **Test Case 2:**  Optimal is to colour the first elememt red and other $2$ blue again. Then, $S_R = 4, C_R = 1, S_B = 3, C_B = 2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:53:14.437Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] z) throws IOException {
        InputStream in = System.in;
        byte[] buf = new byte[1 << 16];
        int[] ptr = new int[]{0, 0};

        int t = nextInt(in, buf, ptr);
        if (t == -1) return;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in, buf, ptr);
            long[] a = new long[n];
            long totalSum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = nextInt(in, buf, ptr);
                totalSum += a[i];
            }

            Arrays.sort(a);

            long maxVal = 0;
            long currentSr = 0;

            for (int k = 0; k <= n / 2; k++) {
                if (k > 0) {
                    currentSr += a[n - k];
                }
                long val = currentSr * (n - 2L * k) + totalSum * k;
                if (val > maxVal) {
                    maxVal = val;
                }
            }

            sb.append(maxVal).append('\n');
        }

        System.out.print(sb);
    }

    private static int nextInt(InputStream in, byte[] buf, int[] ptr) throws IOException {
        int c = read(in, buf, ptr);
        while (c <= ' ') {
            if (c == -1) return -1;
            c = read(in, buf, ptr);
        }
        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read(in, buf, ptr);
        }
        return val;
    }

    private static int read(InputStream in, byte[] buf, int[] ptr) throws IOException {
        if (ptr[0] >= ptr[1]) {
            ptr[1] = in.read(buf);
            ptr[0] = 0;
            if (ptr[1] <= 0) return -1;
        }
        return buf[ptr[0]++];
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/REDBLUE7)