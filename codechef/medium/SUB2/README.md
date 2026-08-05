# SUB2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Subsequence 2

Let $f(A)$ denote the largest value of $L$ such that $1, 2, \ldots, L$ is a subsequence of $A$.

For example, $f([4, 1, 2, 1, 3]) = 3$ because $[1, 2, 3]$ is a subsequence but $[1, 2, 3, 4]$ is not.

You are given an array $A$ of $N$ elements.

Find the sum of $f(A[L, R])$ over all pairs $(L, R)$ such that $1 \le L \le R \le N$. Formally, compute the sum:

$\sum_{L = 1}^{N} \sum_{R = L}^{N} f(A[L, R])$

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the sum of $f(A[L, R])$ over all pairs $(L, R)$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le A_i \le N$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
3
3
1 2 1
7
2 1 1 2 1 3 4
4
2 3 4 4

```

```
7
44
0
```

### Explanation:

 **Test Case 1:**  $f([1, 2, 1]) = 2$, $f([1, 2]) = 2$, $f([1]) = 1$, $f([2, 1]) = 1$, $f([2]) = 1$ and $f([1]) = 1$. Thus, adding all of them, we get $7$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-05T16:26:25.741Z  

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

[View on CodeChef](https://www.codechef.com/problems/SUB2)