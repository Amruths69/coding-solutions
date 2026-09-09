# MONMED

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Monotone Median

*This is the easy version of the problem. Here, $N$ is odd and you must construct a valid sequence of subarrays for $K = \frac{N+1}{2}$.
The setup of both problems is otherwise the same.*

You are given a permutation $P$ of length $N$, where $N$ is  **odd**.
A permutation of length $N$ is an array of length $N$ that contains every integer from $1$ to $N$ exactly once each.

Let $K = \frac{N+1}{2}$.
Find a sequence of $K$ subarrays $[L_1,R_1], [L_2,R_2], \ldots, [L_K,R_K]$ such that all the following conditions hold:

- For each $1 \le i \le K$, the length of $[L_i,R_i]$ is exactly $2i-1$. That is, $R_i-L_i+1=2i-1$.
- For each $2 \le i \le K$, the subarray $[L_i,R_i]$ contains $[L_{i-1},R_{i-1}]$. That is, $L_i \le L_{i-1}$ and $R_{i-1} \le R_i$.
- The medians of these $K$ subarrays are strictly increasing.

The median of an array of odd length is its middle element after sorting it. For example, the median of $[4,1,3]$ is $3$.

If many such sequences exist, you may find any of them.
If no such sequence exists, print $-1$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the permutation. The second line of each test case contains $N$ space-separated integers $P_1, \ldots, P_N$.
### Output Format

For each test case:

- If no valid sequence exists, print $-1$ on a new line.
- Otherwise, print $K=\frac{N+1}{2}$ lines. On the $i$-th line, print two space-separated integers $L_i$ and $R_i$, denoting the endpoints of the $i$-th subarray.

If there are multiple valid sequences, you may print any of them.

### Constraints
- $1 \le T \le 10^5$
- $1 \le N \lt 2\cdot 10^5$
- $N$ is odd.
- $P$ is a permutation of $[1,N]$.
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
5
1
1
3
2 3 1
5
1 3 4 2 5
7
4 7 2 6 1 5 3
7
1 2 4 5 6 3 7

```

```
1 1
3 3
1 3
-1
5 5
3 5
3 7
1 7
-1

```

### Explanation:

 **Test case $1$:**  There's only a single subarray, and it satisfies the condition.

 **Test case $2$:**  We have $P = [2, 3, 1]$. Consider the sequence of subarrays $[1], [2, 3, 1]$. They satisfy the conditions, because:

- Their lengths are $1$ and $3$.
- The first subarray is contained in the second.
- Their medians are $1$ and $2$ in order, which is strictly increasing.

So, this is a valid sequence of subarrays.
We print the endpoints of the subarrays, which is $[3, 3]$ for $[1]$ and $[1, 3]$ for $[2, 3, 1]$.

 **Test case $3$:**  It can be verified that no valid sequence of subarrays satisfying the conditions exists.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T15:01:36.771Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        byte[] buf = new byte[1 << 16];
        int[] ptr = new int[]{0, 0};

        int t = nextInt(in, buf, ptr);
        if (t == -1) return;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in, buf, ptr);
            int[] pos = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int val = nextInt(in, buf, ptr);
                pos[val] = i;
            }

            int k = (n + 1) / 2;

            int[] minPos = new int[k + 1];
            int[] maxPos = new int[k + 1];
            minPos[1] = pos[1];
            maxPos[1] = pos[1];

            for (int i = 2; i <= k; i++) {
                minPos[i] = Math.min(minPos[i - 1], pos[i]);
                maxPos[i] = Math.max(maxPos[i - 1], pos[i]);
            }

            int[] low = new int[k + 1];
            int[] high = new int[k + 1];
            boolean possible = true;

            for (int i = 1; i <= k; i++) {
                low[i] = Math.max(1, maxPos[i] - 2 * i + 2);
                high[i] = Math.min(minPos[i], n - 2 * i + 2);
                if (low[i] > high[i]) {
                    possible = false;
                }
            }

            if (!possible) {
                sb.append("-1\n");
                continue;
            }

            int[] A = new int[k + 1];
            int[] B = new int[k + 1];
            A[k] = 1;
            B[k] = 1;

            for (int i = k; i >= 2; i--) {
                A[i - 1] = Math.max(low[i - 1], A[i]);
                B[i - 1] = Math.min(high[i - 1], B[i] + 2);
                if (A[i - 1] > B[i - 1]) {
                    possible = false;
                    break;
                }
            }

            if (!possible || pos[1] < A[1] || pos[1] > B[1]) {
                sb.append("-1\n");
                continue;
            }

            int[] L = new int[k + 1];
            int[] R = new int[k + 1];
            L[1] = pos[1];
            R[1] = pos[1];

            for (int i = 2; i <= k; i++) {
                L[i] = Math.max(A[i], L[i - 1] - 2);
                R[i] = L[i] + 2 * i - 2;
            }

            for (int i = 1; i <= k; i++) {
                sb.append(L[i]).append(' ').append(R[i]).append('\n');
            }
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

[View on CodeChef](https://www.codechef.com/problems/MONMED)