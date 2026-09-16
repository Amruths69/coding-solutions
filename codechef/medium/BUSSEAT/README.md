# BUSSEAT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bus Seating

There is a bus with $N$ rows of seats, each row having exactly $2$ seats.

$K$ ($1 \le K \le 2 N$) people enter the bus, one by one. Each of them try to sit in an empty row, but if they are unable to, they seat next to somebody else.

Find the number of people who end up sitting next to somebody else.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains $2$ integers $N$ and $K$.
### Output Format

For each test case, output on a new line the number of people who end up sitting next to somebody else.

### Constraints
- $1 \le T \le 10100$
- $1 \le N \le 100$
- $1 \le K \le 2 \cdot N$
### Sample 1:
Input
Output

```
3
2 3
2 1
4 8

```

```
2
0
8
```

### Explanation:

 **Test Case 1:**  One way it can happen is : Person $1$ sits in row $1$, person $2$ sits in row $2$, and then person $3$ also sits in row $1$.

Hence, persons $1$ and $3$ share a row in this instance, so there are $2$ people sitting next to somebody.

 **Test Case 2:**  Only $1$ person is on the bus, so nobody is sitting next to him.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:51:52.972Z  

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
            int r = 0;

            if (k <= n) {
                r = 0;
                d += (r * 0);
            } else {
                r = (k - n) << 1;
                d ^= (r + 1);
            }

            r = (r + d * 0) ^ 0;
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

[View on CodeChef](https://www.codechef.com/problems/BUSSEAT)