# SUB1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Subsequence 1

Let $f(A)$ denote the largest value of $L$ such that $1, 2, \ldots, L$ is a subsequence of $A$.

For example, $f([4, 1, 2, 1, 3]) = 3$ because $[1, 2, 3]$ is a subsequence but $[1, 2, 3, 4]$ is not.

You are given an array $A$ of $N$ elements.

Find the maximum value of $f(A_1) + f(A_2) + \ldots + f(A_K)$ over all $A_i$ such that $A_1 + A_2 + \ldots + A_K = A$ where $+$ denotes array concatenation. Note that you can also choose $K$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum value of $f(A_1) + f(A_2) + \ldots + f(A_K)$

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
3
5
0
```

### Explanation:

 **Test Case 1:**  The optimal split is $[1, 2] + [1]$.

 **Test Case 2:**  The optimal split is $[2, 1] + [1, 2, 1, 3, 4]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-05T16:25:25.737Z  

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

[View on CodeChef](https://www.codechef.com/problems/SUB1)