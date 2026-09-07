# RSFN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fibonacci Numbers Range Sum

You are given an array $I$ of $N$ positive integers.

For each position $i$, replace $I_i$ conceptually with the $I_i$-th Fibonacci number. The Fibonacci sequence is defined as $F_1=1$, $F_2=1$, and $F_i=F_{i-1}+F_{i-2}$ for $i\ge3$.

You are then given $Q$ queries. Each query specifies a range $[L,R]$ and asks for the sum of the Fibonacci values corresponding to all array elements from position $L$ to $R$, inclusive.

For each query $[L,R]$, find:

$F_{I_L}+F_{I_{L+1}}+\cdots+F_{I_R}$

Since the sum can be large, print the answer modulo $10^9+7$.

### Input Format

The first line contains two space-separated integers $N$ and $Q$ — the size of the array and the number of queries.

The second line contains $N$ space-separated integers $I_1,I_2,\ldots,I_N$.

Each of the next $Q$ lines contains two space-separated integers $L$ and $R$, representing a  **1-based inclusive range**.

### Output Format

For each query, print the required Fibonacci sum modulo $10^9+7$ on a separate line.

### Constraints
- $1 \le N,Q \le 10^5$
- $1 \le I_i \le 10^5$
- $1 \le L \le R \le N$
### Sample 1:
Input
Output

```
5 2
1 2 3 4 5
2 4
1 5
```

```
6
12
```

### Explanation:

The Fibonacci values corresponding to the array are:

`1 1 2 3 5`

For the first query, the required sum is:

$1+2+3=6$

For the second query, the required sum is:

$1+1+2+3+5=12$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T15:02:19.005Z  

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

[View on CodeChef](https://www.codechef.com/problems/RSFN)