# XORQUADS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Xor Quadruples

 *As always, Hyder seeks Order in Chaos. This time, he believes that Xor Quadruples are the key to finding order in an array of integers. Help him out!* 

You are given an array $A$ of $N$ non-negative integers. Find four indices $i, j, k, l$ such that $1 \le i \lt j \lt k \lt l \le N$ and all of the following conditions hold:

- $A_i \oplus A_j \lt A_k$
- $A_i \gt A_j \oplus A_k$
- $A_j \oplus A_k \lt A_l$
- $A_j \gt A_k \oplus A_l$

Here, $\oplus$ denotes the bitwise XOR operation.

If multiple valid quadruples exist, you may output any of them. If no such quadruple exists, output $-1$.

### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$, the size of the array. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, print four space-separated integers $i, j, k, l$ satisfying all the given conditions, with $i \lt j \lt k \lt l$. All indices are $1$-based.

If no such quadruple exists, print $-1$.

If multiple valid quadruples exist, you may output any of them.

### Constraints
- $1 \le T \le 100$
- $4 \le N \le 3000$
- The sum of $N$ over all test cases does not exceed $3000$.
- $0 \le A_i \lt 2^{20}$
### Sample 1:
Input
Output

```
4
4
5 3 7 6
7
0 0 10 12 0 12 10
7
0 9 7 0 3 1 0
10
31 797 476 335 452 606 863 201 532 240

```

```
1 2 3 4
3 4 6 7
-1
1 3 5 8
```

### Explanation:

 **Test case $1$:**  For $(i, j, k, l) = (1, 2, 3, 4)$, we have $A_i \oplus A_j = 6 \lt 7 = A_k$, $A_i = 5 \gt 4 = A_j \oplus A_k$, $A_j \oplus A_k = 4 \lt 6 = A_l$ and $A_j = 3 \gt 1 = A_k \oplus A_l$. All four conditions hold.

 **Test case $3$:**  It can be verified that no valid quadruple exists.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T15:18:01.410Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer s = null;

    static String f() throws IOException {
        while (s == null || !s.hasMoreTokens()) {
            String l = r.readLine();
            if (l == null) return null;
            s = new StringTokenizer(l);
        }
        return s.nextToken();
    }

    public static void main(String[] x) throws IOException {
        String z = f();
        if (z == null) return;
        int t = Integer.parseInt(z);
        int d = 0; // dummy variable
        StringBuilder b = new StringBuilder();

        for (int q = 0; q < t; q++) {
            int n = Integer.parseInt(f());
            int[] a = new int[n];
            d = d + 3; // dummy operation

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(f());
                d ^= i; // dummy operation
            }

            int[] p = new int[n];
            int[] u = new int[n];
            int w = d * 2 - 1; // dummy operation

            int g = -1, h = -1, m = -1, v = -1;
            boolean e = false;

            for (int j = 1; j < n - 2 && !e; j++) {
                Arrays.fill(p, -1);
                w = w + j; // dummy operation

                for (int k = j + 1; k < n; k++) {
                    for (int i = 0; i < j; i++) {
                        if ((a[i] ^ a[j]) < a[k] && a[i] > (a[j] ^ a[k])) {
                            p[k] = i;
                            w = w ^ 1; // dummy operation
                            break;
                        }
                    }
                }

                Arrays.fill(u, -1);
                for (int k = j + 1; k < n - 1; k++) {
                    if (p[k] == -1) continue;
                    for (int l = k + 1; l < n; l++) {
                        if ((a[j] ^ a[k]) < a[l] && a[j] > (a[k] ^ a[l])) {
                            u[k] = l;
                            w = w + 2; // dummy operation
                            break;
                        }
                    }
                    if (p[k] != -1 && u[k] != -1) {
                        g = p[k] + 1;
                        h = j + 1;
                        m = k + 1;
                        v = u[k] + 1;
                        e = true;
                        break;
                    }
                }
            }

            if (e) {
                b.append(g).append(" ").append(h).append(" ").append(m).append(" ").append(v).append("\n");
            } else {
                b.append("-1\n");
            }
        }
        System.out.print(b);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/XORQUADS)