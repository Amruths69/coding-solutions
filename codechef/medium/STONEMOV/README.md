# STONEMOV

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Stone Moving

There are $N$ piles of stones, the $i$-th pile containing $A_i$ stones.

Consider the process as follows:

- For $i = 1, 2, \ldots, N$ (in this order): Let $X = \min(A_i, N - i)$ Move $1$ stone from the pile numbered $i$ to each of the piles numbered $i + 1, i + 2, i + 3, \ldots, i + X$.

Find the total number of stones moved by the process above.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the total number of stones moved.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $0 \le A_i \le N$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
3 3 3
3
1 0 1
6
2 0 3 0 1 4
2
0 0

```

```
3
2
8
0
```

### Explanation:

 **Test Case 1:**  The process happens as follows:

- $i = 1$ : $X = 2$, and we move $1$ stone from pile $1$ to each of $2$ and $3$. The resulting array $A$ is $[1, 4, 4]$.
- $i = 2$ : $X = 1$, and the array updates to $[1, 3, 5]$.
- $i = 3$ : $X = 0$, no further stone moves.

The total number of stones moved is $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T13:45:56.953Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] x) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer z = null;
        
        String l = b.readLine();
        if (l == null) return;
        z = new StringTokenizer(l);
        int t = Integer.parseInt(z.nextToken());
        
        StringBuilder o = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(b.readLine().trim());
            long[] a = new long[n + 1];
            z = new StringTokenizer(b.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(z.nextToken());
            }
            
            long[] d = new long[n + 2];
            long s = 0, c = 0;
            
            for (int i = 1; i <= n; i++) {
                s += d[i];
                long v = a[i] + s;
                long m = Math.min(v, n - i);
                c += m;
                if (m > 0) {
                    d[i + 1] += 1;
                    int r = (int) Math.min(n + 1, i + m + 1);
                    d[r] -= 1;
                }
            }
            o.append(c).append("\n");
        }
        System.out.print(o);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STONEMOV)