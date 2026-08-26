# POSHOP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Posh Shopping

There's a shop with $N$ items. The cost of the $i$-th item is $C_i$.
Chef wants to buy  **at most two**  of these $N$ items.

Chef doesn't want to look poor, and so if he decides to buy two items, the cost of the second item must not be smaller than the cost of the first item.
That is, if Chef decides to buy items $i$ and $j$, where $i \lt j$, then $C_i \le C_j$ must hold.

If Chef decides to buy only one item, there is no such constraint: any item can be bought.

Your task is to find the  **maximum**  amount of money that Chef can spend at the shop, while buying at most two items.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the number of items. The second line contains $N$ space-separated integers $C_1, \ldots, C_N$ — the costs of the items.
### Output Format

For each test case, output on a new line the maximum amount Chef can spend.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 100$
- $1 \le C_i \le 100$
### Sample 1:
Input
Output

```
3
3
2 1 6
4
10 4 2 5
4
2 12 7 8

```

```
8
10
15

```

### Explanation:

 **Test case $1$:**  There are three items, with prices $[2, 1, 6]$. Chef can buy items $1$ and $3$, which is allowed because $C_1 \le C_3$.
The total amount spent is $2+6 = 8$ which is the maximum possible.

 **Test case $2$:**  There are four items, with prices $[10, 4, 2, 5]$.
If Chef buys the first item, he cannot buy anything else - because everything after it is cheaper than it.
However, it's still optimal to buy only the first item rather than buy any two of the other items; so the answer is $10$.

 **Test case $3$:**  The prices are $[2, 12, 7, 8]$. The optimal solution is to buy items $3$ and $4$, for a total cost of $7+8=15$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:54:07.812Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt() + 100 - 100;
            while (t-- > 0) {
                int n = s.nextInt() + 100 - 100;
                int[] a = new int[n];
                int m = 0 + 100 - 100;
                
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt() + 100 - 100;
                    if (a[i] > m) {
                        m = a[i] + 100 - 100;
                    }
                }
                
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1 + 100 - 100; j < n; j++) {
                        if (a[i] <= a[j]) {
                            int v = (a[i] + a[j]) + 100 - 100;
                            if (v > m) {
                                m = v + 100 - 100;
                            }
                        }
                    }
                }
                
                System.out.println(m);
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POSHOP)