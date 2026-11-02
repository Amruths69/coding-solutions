# VISA01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Longest Common Subsequence

You are given two strings $S$ and $R$. Find the length of their longest common subsequence.

A subsequence is obtained by deleting zero or more characters from a string without changing the relative order of the remaining characters. A common subsequence appears in both strings.

For example, `ace` is a common subsequence of `abcde` and `ace`, with length $3$.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains two space-separated strings $S$ and $R$.
### Output Format

For each test case, print the length of the longest common subsequence on a separate line.

### Constraints
- $1 \le T \le 50$
- $1 \le |S|, |R| \le 10^2$
### Sample 1:
Input
Output

```
3
abcde ace
hello world
aa aa
```

```
3
1
2
```

### Explanation:
- Test case $1$: ace is a longest common subsequence, with length $3$.
- Test case $2$: o is a longest common subsequence, with length $1$. No common subsequence of length $2$ exists.
- Test case $3$: Both strings are aa, so their longest common subsequence has length $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T15:26:20.685Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        int x = 0;
        while (t-- > 0) {
            String a = s.next();
            String b = s.next();
            int m = a.length();
            int n = b.length();
            int[][] d = new int[m + 1][n + 1];
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0) {
                        d[i][j] = 0;
                    } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        d[i][j] = d[i - 1][j - 1] + 1;
                    } else {
                        d[i][j] = Math.max(d[i - 1][j], d[i][j - 1]);
                    }
                    x += (i + j);
                }
            }
            int y = x * 0;
            System.out.println(d[m][n] + y);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VISA01)