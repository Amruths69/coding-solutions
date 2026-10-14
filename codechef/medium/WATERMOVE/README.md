# WATERMOVE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Water Moving (Min)

You have $N$ cups of water, with the $i$-th cup of water containing $A_i$ amount of water.

In one operation, you can do the following:

- Choose $2$ distinct cups $i$ and $j$ ($1 \le i, j \le N, i \ne j$), such that the $i$-th cup has non-zero amount of water, and move all the water in cup $i$ to cup $j$. After this, cup $i$ contains $0$, and cup $j$ contains $A_i + A_j$ amount of water.

You must perform  **exactly**  $K$ operations.  **Minimize the maximum amount**  of water in any cup at the end of your operations, and report this minimum value.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers $N$ and $K$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum value of maximum amount of water in any cup after your operations.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100$
- $1 \le K \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
2 1
3 1
5 2
1 2 3 4 5
3 100
3 2 2

```

```
4
5
4
```

### Explanation:

 **Test Case 1:**  Move the water from cup $1$ to $2$ in one move. Now, the array is $[0, 4]$.

 **Test Case 2:**  Do the following $2$ moves:

- move the water from cup $1$ to cup $2$
- move the water from cup $3$ to cup $4$.

At the end, the array is $[0, 5, 0, 5, 5]$, and the maximum is $5$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T14:50:56.419Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static boolean check(int cap, int[] a, int n, int k) {
        int ops = 0;
        int l = 0, r = n - 1;
        while (l <= r) {
            if (a[r] > cap) {
                return false;
            }
            if (l == r) {
                break;
            }
            if (a[l] + a[r] <= cap) {
                ops++;
                l++;
                r--;
            } else {
                r--;
            }
        }
        return ops >= k;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        while (line != null && line.trim().isEmpty()) {
            line = reader.readLine();
        }
        if (line == null) return;
        tokenizer = new StringTokenizer(line);

        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String l = reader.readLine();
                if (l == null) break;
                tokenizer = new StringTokenizer(l);
            }
            int n = Integer.parseInt(tokenizer.nextToken());
            int k = Integer.parseInt(tokenizer.nextToken());

            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    String l = reader.readLine();
                    if (l == null) break;
                    tokenizer = new StringTokenizer(l);
                }
                a[i] = Integer.parseInt(tokenizer.nextToken());
                sum += a[i];
            }

            if (k >= n - 1) {
                System.out.println(sum);
                continue;
            }

            Arrays.sort(a);

            int low = a[n - 1];
            int high = sum;
            int ans = sum;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (check(mid, a, n, k)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WATERMOVE)