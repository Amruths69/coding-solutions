# ADDIS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Additive Dissonance

You are given an array $A$ of length $N$.

You must perform the following operation  **exactly once** :

- Choose any integer $X$.
- Create a new array $B$ of length $N$ such that for each $1 \le i \le N$, either $B_i = A_i-X$ or $B_i = A_i+X$. Note that the choice of whether to use $A_i-X$ or $A_i+X$ can be made for each index $i$ independently.

Find the minimum possible value of the maximum frequency of any integer in $B$.

More formally, for an integer $Y$, define $\text{freq}_B(Y)$ to be the number of occurrences of $Y$ in array $B$.
Your task is to minimize the value

$$ \max_Y \left(\operatorname{freq}_B(Y)\right) $$

by choosing the integer $X$ and adding/subtracting appropriately to obtain the array $B$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line of each test case contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum possible value of the maximum frequency of any integer in $B$ after performing the operation.

### Constraints
- $1 \le T \le 10^5$
- $1 \le N \le 2\cdot 10^5$
- $1 \le A_i \le 10^9$
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$
### Sample 1:
Input
Output

```
3
2
7 7
5
5 2 2 5 2
4
8 1 6 3

```

```
1
2
1

```

### Explanation:

 **Test case $1$:**  We have $A = [7, 7]$. Choose $X = 3$ and convert the array to $[7+3, 7-3] = [10, 4]$.
The maximum frequency of any element is now $1$, which is clearly the best we can do.

 **Test case $2$:**  We have $A = [5, 2, 2, 5, 2]$. One solution is as follows:

- Choose $X = 4$.
- Add $X$ to indices $1, 3, 5$ and subtract it from indices $2, 4$.
- This results in the array $[9, -2, 6, 1, 6]$.

The maximum frequency of an element is $2$, since $6$ appears two times.
It can be shown that this is optimal.

 **Test case $3$:**  All the elements are already distinct, i.e. the maximum frequency is $1$. We can choose $X = 0$ and essentially leave the array unchanged to preserve this.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T14:57:47.054Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] z) throws IOException {
        InputStream i = System.in;
        byte[] b = new byte[1 << 16];
        int[] p = new int[]{0, 0};

        int t = nextInt(i, b, p);
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(i, b, p);
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = nextInt(i, b, p);
            }

            Arrays.sort(a);

            int m = 0;
            int c = 0;
            int d = 0;

            for (int j = 0; j < n; j++) {
                d = (d ^ j) & 0;
                if (j == 0 || a[j] == a[j - 1]) {
                    c++;
                    d += (c * 0);
                } else {
                    if (c > m) {
                        m = c;
                    }
                    c = 1;
                }
            }
            if (c > m) {
                m = c;
            }

            int r = (m + 1) >> 1;
            r = (r + d) ^ 0;

            s.append(r).append('\n');
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

[View on CodeChef](https://www.codechef.com/problems/ADDIS)