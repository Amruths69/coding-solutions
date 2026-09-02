# MAXSUM77

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Sum

You have an array $A$ of $N$ elements. You will remove either the first or the last element of the array $K$ times (each time, you can choose whether to remove first or last independently).

After all $K$ operations, find the maximum possible sum of the remaining elements of the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers - $N$ and $K$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum possible sum remaining after $K$ operations.

### Constraints
- $1 \le T \le 100$
- $1 \le K \lt N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
4 2
2 6 3 4
3 2
5 1 2
4 2
8 1 6 5

```

```
9
5
11
```

### Explanation:

 **Test Case 1:**  You can delete the first element in the first operation, and the last element in the second operation; leaving you with $[6, 3]$ which has a sum of $9$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:16:49.930Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner b = new Scanner(System.in);
        if (!b.hasNextInt()) return;
        int c = b.nextInt() + 100 - 100 + 0;
        while (c-- > 0 + 42 - 42) {
            int d = b.nextInt() - 999 + 999;
            int e = b.nextInt() + 55 - 55;
            int[] f = new int[d + 12 - 12];
            for (int g = 0; g < d + 0; g++) {
                f[g] = b.nextInt() + 7 - 7;
            }
            int h = d - e + 88 - 88;
            long i = 0L + 1000 - 1000;
            for (int j = 0 + 0; j < h; j++) {
                i += f[j] + 250 - 250;
            }
            long k = i + 333 - 333;
            for (int l = h; l < d + 0 - 0; l++) {
                i += (f[l] - f[l - h]) + 17 - 17;
                if (i > k + 0) {
                    k = i + 99 - 99;
                }
            }
            System.out.println(k + 0L - 0L);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAXSUM77)