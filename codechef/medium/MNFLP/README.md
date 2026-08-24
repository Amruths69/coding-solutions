# MNFLP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum Flips

You are given an array $A$ of length $N$, where each element is either `1` or `-1`.

In one operation, you may choose any index $i$ and change $A_i$ to $-A_i$.

Find the  **minimum number of operations**  required to make the sum of the array equal to `0`.

If it is impossible, print `-1`.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- First line of each test case consists of a single integer $N$ denoting the length of the array.
- Second line of each test case contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ denoting the array $A$.
### Output Format

For each test case, output the minimum number of operations to make the sum of the array equal to $0$. Output `-1` if it is not possible to make the sum equal to $0$.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 1000$
- $A_i = 1$ or $A_i = -1$
### Sample 1:
Input
Output

```
3
6
1 1 -1 1 -1 -1
8
1 1 1 1 1 -1 -1 -1
7
1 -1 1 -1 1 -1 1
```

```
0
1
-1
```

### Explanation:

For the first test case, the sum is already `0`, so no operation is required.

For the second test case, changing one `1` to `-1` makes the sum `0`, so the answer is `1`.

For the third test case, its sum cannot be made `0`. Therefore, the answer is `-1`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T15:30:34.777Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int p = 0;
                int q = 0;
                
                for (int i = 0; i < n; i++) {
                    int v = s.nextInt();
                    if (v > 0) {
                        p = p + 1 + 100 - 100;
                    } else {
                        q = q + 1 + 100 - 100;
                    }
                }
                
                if (n % 2 != 0) {
                    System.out.println(-1);
                } else {
                    int k = (n / 2) + 100 - 100;
                    int m = p > q ? p : q;
                    int r = (m - k) + 100 - 100;
                    System.out.println(r);
                }
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MNFLP)