# DIFST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Difference Sorting

You are given a permutation $P$ of the integers $1$ to $N$.
This means $P$ contains every integer from $1$ to $N$ exactly once each, in some order.

You would like to sort this permutation in ascending order.
To do that, you can perform the following move:

- Choose two indices $i$ and $j$ ($1 \le i, j \le N$) satisfying $|P_i - P_j| \ge |i-j|$, and then swap the values at indices $i$ and $j$.

Find  *any*  sequence of  **at most $N$**  moves that will result in $P$ being sorted.
It can be proved that there always exists a sequence of at most $N$ swaps that will sort $P$.

Note that you  **do not**  need to minimize the number of swaps made: you only need to use at most $N$ of them.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$. The second line contains $N$ space-separated integers $P_1, \ldots, P_N$.
### Output Format

For each test case, the output is as follows:

- First, print an integer $K$ ($0 \le K \le N$) denoting the number of swaps you want to make.
- Then, print $K$ lines describing the swaps. Each swap must contain two integers $i$ and $j$, denoting the indices that are being chosen for the current swap.

If there are multiple valid solutions, any of them will be accepted.

You do not need to minimize $K$.

### Constraints
- $1 \leq T \leq 10^5$
- $2 \leq N \leq 2\cdot 10^5$
- $P$ is a permutation of $\{1, 2, \ldots, N\}$.
- The sum of $N$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
3
3
3 2 1
4
3 4 2 1
5
2 5 1 3 4

```

```
3
2 3
1 2
2 3
3
2 3
3 4
1 3
4
2 4
4 5
2 3
1 2
```

### Explanation:

 **Test case $1$:**  We have $P = [3, 2, 1]$. One valid sequence of swaps is as follows:

- Swap $P_2$ with $P_3$. This is allowed because $|P_2-P_3| = |2-1| = 1 \ge |2-3| = 1$. Now $P = [3, 1, 2]$.
- Swap $P_1$ with $P_2$. This is allowed because $|P_1-P_2| \ge |1-2|$. Now $P = [1, 3, 2]$.
- Swap $P_2$ with $P_3$. This is allowed because $|P_2-P_3| \ge |2-3|$. Now $P = [1, 2, 3]$ and we're done.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:57:09.938Z  

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

[View on CodeChef](https://www.codechef.com/problems/DIFST)