# DBLDROP2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Double and Drop (Hard)

You are given an array $A$ of $N$ positive integers.

You may perform the following operation  **at most once** :

- Choose an index $i$ ($1 \le i \le N$) and set $A_i := 2 \cdot A_i$.

After that, let $f(A)$ be the maximum possible value of $\text{sum}(A) - \max(A)$, that is, the sum of all its elements except one copy of the largest one.

Given an array $A$ of $N$ elements, find the sum of $f(A)$ over all $2^N - 1$ non-empty subsequences of $A$. Since the answer can be large, find it modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the sum of $f(B)$ over all non-empty subsequences $B$ of $A$, modulo $998244353$.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 5000$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ over all test cases does not exceed $5000$.
### Sample 1:
Input
Output

```
4
3
1 2 3
2
5 5
3
1 6 10
5
7 3 9 2 9

```

```
11
5
25
291
```

### Explanation:

 **Test case $1$:**  Subsequences with one element have $f = 0$. For the others:

- $[1, 2]$: doubling $1$ gives $[2, 2]$, with score $2$.
- $[1, 3]$: doubling $1$ gives $[2, 3]$, with score $2$.
- $[2, 3]$: doubling $2$ gives $[4, 3]$, with score $3$.
- $[1, 2, 3]$: doubling $1$ gives $[2, 2, 3]$, with score $4$.

The answer is $2 + 2 + 3 + 4 = 11$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:13:30.322Z  

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

[View on CodeChef](https://www.codechef.com/problems/DBLDROP2)