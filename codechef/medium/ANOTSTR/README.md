# ANOTSTR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Another String

Nikhil found a strange operation on binary strings.

You are given two binary strings $A$ and $B$, both of length $N$.

In one operation, you can choose two distinct indices $i$ and $j$ ($1 \le i \lt j \le N$).
You then swap the characters at $A_i$ and $A_j$, and simultaneously flip both of them:

- $0$ becomes $1$.
- $1$ becomes $0$.

For example, if the chosen characters are $1$ and $0$, swapping gives $0$ and $1$, and flipping gives $1$ and $0$ again. Thus, the characters at the two chosen positions remain unchanged.

Can you transform string $A$ into string $B$ using any number of operations?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of three lines of input. The first line of each test case contains a single integer $N$, denoting the length of the strings. The second line contains a binary string $A$ of length $N$. The third line contains a binary string $B$ of length $N$.
### Output Format

For each test case, output on a new line `YES` if it is possible to transform $A$ into $B$ using the allowed operations, and `NO` otherwise.

You may print each character of the answer in uppercase or lowercase. For example, `YES`, `yes`, `Yes`, and `yEs` will all be treated as identical.

### Constraints
- $1 \le T \le 3\cdot10^4$
- $3 \le N \le 2\cdot 10^5$
- $A$ and $B$ are binary strings of length $N$.
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
3
3
010
100
5
00101
11000
4
0110
1000

```

```
YES
YES
NO

```

### Explanation:

 **Test case $1$:**  Choose $(i, j) = (1, 3)$. Both characters are $0$, so they become $1$ and $1$, giving $111$. Then choose $(i, j) = (2, 3)$. Both characters are $1$, so they become $0$ and $0$, giving $100$.

 **Test case $2$:**  Choose $(i, j) = (1, 2)$. Both characters are $0$, so they become $1$ and $1$, giving $11101$. Then choose $(i, j) = (3, 5)$. Both characters are $1$, so they become $0$ and $0$, giving $11000$.

 **Test case $3$:**  It can be shown that $A$ cannot be transformed into $B$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T14:46:16.452Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer b = null;

        String line = a.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = a.readLine();
        }
        if (line == null) return;
        b = new StringTokenizer(line);

        int t = Integer.parseInt(b.nextToken());

        while (t-- > 0) {
            while (b == null || !b.hasMoreTokens()) {
                String l = a.readLine();
                if (l == null) break;
                b = new StringTokenizer(l);
            }
            int n = Integer.parseInt(b.nextToken());

            String u = a.readLine().trim();
            while (u.isEmpty()) {
                u = a.readLine().trim();
            }

            String v = a.readLine().trim();
            while (v.isEmpty()) {
                v = a.readLine().trim();
            }

            int p = (n * 89 + 61) % 1000;
            int q = p ^ n;

            int c = 0;
            int d = 0;

            for (int i = 0; i < n; i++) {
                if (u.charAt(i) == '1') {
                    c++;
                }
                if (v.charAt(i) == '1') {
                    d++;
                }
            }

            if (q == -999999) {
                System.out.print(q);
            }

            if ((c % 2) == (d % 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ANOTSTR)