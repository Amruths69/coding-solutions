# DELADJ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Deleting Adjacent (Easy)

For an array $A$ of size $N$, define a process to calculate $score$ as follows:

- Initially, $score$ is $0$.
- While $|A| > 1$, you can choose an index $i$ ($1 \le i < |A|$), and do the following: Add $A_i - A_{i + 1}$ to score. Delete both $A_i$ and $A_{i + 1}$ from the array.
- Now, if $|A| = 1$ at the end, delete $A_1$ and add $A_1$ to score.

Note that by the end, the array should be empty, i.e. you are forced to do operations. $f(A)$ is defined as the maximum possible value of $score$ by the end.

You are given an array $A$ ($1 \le A_i \le 100$) of $N$ integers.

Find $f(A)$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line $f(A)$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le A_i \le 100$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
4
4
10 6 3 8
2
1 100
4
1 1 2 2
3
7 2 5

```

```
5
-99
0
10

```

### Explanation:

 **Test Case 1:**  First, do the operation with $i = 2$, deleting $6$ and $3$ to get $score = 3$ and $A = [10, 8]$. Then, do $i = 1$ to get $score = 5$ and empty $A$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:53:12.330Z  

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

[View on CodeChef](https://www.codechef.com/problems/DELADJ)