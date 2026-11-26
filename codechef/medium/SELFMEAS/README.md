# SELFMEAS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Self-Measured Segments

You are given an array $A$ of $N$ integers.

You want to cut $A$ into one or more non-empty contiguous  **pieces**, so that every element belongs to exactly one piece.
A piece is called  *self-measured*  if its length is equal to its maximum element.

Find the number of ways to cut $A$ so that  **every**  piece is self-measured. Since the answer can be large, output it modulo $998244353$.

More formally, count the sequences of indices $0 = i_0 \lt i_1 \lt \ldots \lt i_k = N$ (for any $k \geq 1$) such that for every $1 \leq j \leq k$:

- $\max(A_{i_{j-1}+1}, A_{i_{j-1}+2}, \ldots, A_{i_j}) = i_j - i_{j-1}$.
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the number of ways to cut $A$ into self-measured pieces, modulo $998244353$.

### Constraints
- $1 \leq T \leq 10^4$
- $2 \leq N \leq 2 \cdot 10^5$
- $1 \leq A_i \leq N$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
4
1 2 2 1
6
2 1 3 3 1 3
3
2 2 2
5
1 2 1 2 1

```

```
2
1
0
3

```

### Explanation:

 **Test case $1$:**  The two ways are $[1]\ [2, 2]\ [1]$ and $[1, 2]\ [2, 1]$.

 **Test case $2$:**  The only way is $[2, 1, 3]\ [3, 1, 3]$.

 **Test case $3$:**  Every piece has maximum $2$, so every piece must have length $2$. That is impossible with $3$ elements.

 **Test case $4$:**  The three ways are $[1, 2]\ [1, 2]\ [1]$, $[1, 2]\ [1]\ [2, 1]$ and $[1]\ [2, 1]\ [2, 1]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:19:41.081Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static final long M = 998244353L;

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(b.readLine());

        int t = Integer.parseInt(s.nextToken());
        StringBuilder o = new StringBuilder();

        while (t-- > 0) {
            if (!s.hasMoreTokens()) {
                s = new StringTokenizer(b.readLine());
            }
            int n = Integer.parseInt(s.nextToken());

            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (!s.hasMoreTokens()) {
                    s = new StringTokenizer(b.readLine());
                }
                a[i] = Integer.parseInt(s.nextToken());
            }

            long[] d = new long[n + 1];
            d[0] = 1L;

            int[] v = new int[n + 1];
            int[] l = new int[n + 1];
            int z = 0;

            for (int r = 1; r <= n; r++) {
                int x = a[r];
                int p = r - 1;

                while (z > 0 && v[z - 1] <= x) {
                    z--;
                    p = l[z];
                }

                v[z] = x;
                l[z] = p;
                z++;

                long c = 0L;
                for (int i = 0; i < z; i++) {
                    int u = l[i];
                    int w = (i + 1 < z) ? (l[i + 1] - 1) : (r - 1);
                    int k = r - v[i];
                    if (k >= u && k <= w) {
                        c += d[k];
                        if (c >= M) {
                            c -= M;
                        }
                    }
                }
                d[r] = c;
            }

            o.append(d[n]).append('\n');
        }

        System.out.print(o.toString());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SELFMEAS)