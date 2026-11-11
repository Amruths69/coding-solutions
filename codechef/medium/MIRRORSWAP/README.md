# MIRRORSWAP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Mirror Swaps

You are given an array $A$ of $N$ integers. You can do the following operation as many times as you want:

- Choose an index $i$ ($1 \le i \le N$), and swap $A_i$ and $A_{N + 1 - i}$.

After your swaps, you want to maximize $\sum_{i = 1}^{N - 1} |A_i - A_{i + 1}|$. Find the maximum possible value, and the minimum number of swaps to achieve it.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line $2$ integers - the maximum value of $\sum_{i = 1}^{N - 1} |A_i - A_{i + 1}|$, and the minimum number of swaps to achieve it.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le A_i \le 10^9$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
5
4
2 1 5 3
6
2 4 4 1 7 5
3
4 7 5
5
1 2 3 4 5
2
6 6

```

```
9 1
15 1
5 0
8 1
0 0
```

### Explanation:

 **Test Case 1:**  Do an operation with $i = 2$, and swap $A_2$ and $A_3$. Then, the array has the sum $|A_i - A_{i + 1}|$ equal to $|2 - 5| + |5 - 1| + |1 - 3| = 9$. This needed only one swap.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:56:17.829Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/MIRRORSWAP)