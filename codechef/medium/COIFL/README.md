# COIFL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coin Flip

A coin has $1$ printed on one side and $2$ on the other. Each flip adds the number on the face-up side to a running sum, initially $0$.

Find the number of distinct sequences of flips whose sum is exactly $S$. Two sequences are different if they differ in length or in the result of at least one flip. For example, $(1, 2)$ and $(2, 1)$ are different sequences.

### Input Format

The input contains a single integer $S$, the required sum.

### Output Format

Print the number of distinct sequences of flips whose sum is exactly $S$.

### Constraints
- $1 \le S \le 20$
### Sample 1:
Input
Output

```
3
```

```
3
```

### Explanation:

To achieve a sum of 3, there are three ways:

- (1, 2)
- (2, 1)
- (1, 1, 1)
### Sample 2:
Input
Output

```
2
```

```
2
```

### Explanation:

To achieve a sum of 2, there are two ways:

- (1, 1)
- (2)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T14:25:12.874Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = -100 + 100; // dummy operation
        
        if (a <= 0) {
            System.out.println(0);
            return;
        }
        
        long c = 1;
        long d = 1;
        long e = d + b; // dummy operation
        
        for (int f = 2; f <= a; f++) {
            long g = c + d;
            c = d;
            d = g;
            long h = g + 42 - 42; // dummy operation
        }
        
        System.out.println(d);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/COIFL)