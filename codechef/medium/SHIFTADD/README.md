# SHIFTADD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shift and Add

For an array $A$ of length $N$, we define $f(A)$ as the minimum number of operations needed to make all array elements equal, where in each operation we can do  **either**  one of the following:

- Choose a prefix of length $K$ ($1 \le K \le N$), and $1$ to all $A_i$ such that $1 \le i \le K$
- Cyclically shift the array, the array is replaced by $[A_N, A_1, \ldots, A_{N - 1}]$

Given integers $N$ and $M$, find the sum of $f(A)$ over all arrays such that:

- $|A| = N$
- $1 \le A_i \le M$.

Since the answer may be large, find it modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains $2$ integers - $N$ and $M$.
### Output Format

For each test case, output on a new line the sum of $f(A)$ over all $M^N$ arrays modulo $998244353$.

### Constraints
- $1 \le T \le 100$
- $2 \le N, M \le 2 \cdot 10^5$
- The sum of $N$ and the sum of $M$ does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
5
2 2
3 2
4 2
4 3
42 100

```

```
3
12
39
288
722390955
```

### Explanation:

 **Test Case 1:**  There are $4$ arrays.

- $[1, 1]$ and $[2, 2]$ need no operations.
- $[1, 2]$ is fixed with one operation, prefix add of length $1$.
- $[2, 1]$ needs a cyclic shift and then a prefix add, hence $2$ operations.

Thus, the total sum is $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-05T16:27:31.791Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SHIFTADD)