# MINP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum Incompatibility Partition

You are given an integer array $nums$ of length $n$ and an integer $k$.

Partition all elements of $nums$ into exactly $k$ subsets such that:

- Each subset contains exactly $\frac{n}{k}$ elements.
- Each subset contains distinct values.
- Every element in $nums$ belongs to exactly one subset.

The  **incompatibility**  of a subset is defined as the difference between its maximum and minimum elements:

$$ \operatorname{Incompatibility}(S)=\max(S)-\min(S) $$

A subset containing only one element has an incompatibility of $0$.

Find the minimum possible sum of incompatibilities of all $k$ subsets.

If no valid partition is possible, print $-1$.

### Input Format
- The first line contains two space-separated integers $n$ and $k$.
- The second line contains $n$ space-separated integers representing the array $nums$.
### Output Format

Print a single integer — the minimum possible sum of incompatibilities, or $-1$ if no valid partition is possible.

### Constraints
- $1 \le n \le 10$
- $1 \le k \le n$
- $n$ is divisible by $k$
- $1 \le nums[i] \le 10^9$ for $1 \le i \le n$
### Sample 1:
Input
Output

```
8 4
1 2 1 4 3 3 5 6
```

```
5
```

### Explanation:

The given array is:

- $nums=[1,2,1,4,3,3,5,6]$

One optimal partition is:

- $[1,2]$, with incompatibility $2-1=1$
- $[1,3]$, with incompatibility $3-1=2$
- $[3,4]$, with incompatibility $4-3=1$
- $[5,6]$, with incompatibility $6-5=1$

Therefore, the minimum total incompatibility is:

$$ 1+2+1+1=5 $$
### Sample 2:
Input
Output

```
4 2
1 1 1 2
```

```
-1
```

### Explanation:

The given array is:

- $nums=[1,1,1,2]$

The array must be partitioned into $2$ subsets, each containing $2$ elements.

The value $1$ appears $3$ times. Since each subset must contain distinct values, each of the $2$ subsets can contain at most one occurrence of $1$.

Therefore, no valid partition is possible, so the answer is $-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T15:25:33.299Z  

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

[View on CodeChef](https://www.codechef.com/problems/MINP)