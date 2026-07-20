# FCTPR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factory Production

There are $N$ machines in a factory. The $i^{\text{th}}$ machine produces one item every $A_i$ seconds. Each machine works continuously and independently.

Your task is to determine the  **minimum**  time required to produce at least $X$ items in total.

### Input Format
- The first line contains two integers $N$ and $X$ — the number of machines and the required number of items.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$, where $A_i$ denotes the time taken by the $i^{\text{th}}$ machine to produce one item.
### Output Format

Print a single integer — the minimum time required to produce at least $X$ items.

### Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le X \le 10^9$
- $1 \le A_i \le 10^9$
### Sample 1:
Input
Output

```
3 15
2 3 7
```

```
18
```

### Explanation:

In $18$ seconds:

- The first machine produces $9$ items.
- The second machine produces $6$ items.
- The third machine produces $2$ items.

A total of $17$ items are produced, which is at least $15$. It is not possible to produce $15$ items in less than $18$ seconds.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T15:36:54.334Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    static int[] ef;
    static int kj;
    static long li;

    static boolean zx(long op) {
        long qw = 0;

        for (int rt : ef) {
            qw += op / rt;

            if (qw >= li)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kj = sc.nextInt();
        li = sc.nextLong();

        ef = new int[kj];

        long mn = Long.MAX_VALUE;

        for (int i = 0; i < kj; i++) {
            ef[i] = sc.nextInt();
            if (ef[i] < mn)
                mn = ef[i];
        }

        long as = 0;
        long df = mn * li;
        long gh = df;

        while (as <= df) {
            long yu = as + (df - as) / 2;

            if (zx(yu)) {
                gh = yu;
                df = yu - 1;
            } else {
                as = yu + 1;
            }
        }

        System.out.println(gh);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FCTPR)