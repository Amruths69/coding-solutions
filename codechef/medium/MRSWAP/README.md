# MRSWAP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Mirror Swap

You have an array $A$ of size $2 \cdot N$.

You can perform the following operation as many times as you want:

- Swap $A_i$ with $A_{2N + 1 - i}$ (i.e. it's mirror element).

For example, we can swap $A_1$ with $A_{2N}$, $A_2$ with $A_{2N - 1}$ and so on.

You want to maximize the value $A_1 + A_2 + \ldots + A_N$, i.e. the sum of the first half of the array. Find this maximum value.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_{2N}$.
### Output Format

For each test case, output the maximum sum of the first half.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
2
3
1 4 3 4 2 1
1
100 99

```

```
9
100
```

### Explanation:

 **Test Case 1:**  You can swap $A_3$ and $A_4$ to get $[1, 4, 4, 3, 2, 1]$ which has a first-half sum of $9$, which is optimal.

 **Test Case 2:**  No swaps need to be made.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T15:15:49.620Z  

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

[View on CodeChef](https://www.codechef.com/problems/MRSWAP)