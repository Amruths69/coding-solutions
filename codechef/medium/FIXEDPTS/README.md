# FIXEDPTS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fixed Points

For a permutation $P$ of the integers $[1, N]$, a fixed point is an index $i$ such that $P_i = i$.

Given $N$ and $K$, determine whether there exists a permutation $P$ of the integers $[1, N]$ which has  **exactly**  $K$ fixed points.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line contains $2$ integers $N$ and $K$.
### Output Format

For each test case, output $\text{Yes}$ if there exists such a permutation, and $\text{No}$ otherwise.

### Constraints
- $1 \le T \le 6000$
- $1 \le N \le 100$
- $0 \le K \le N$
### Sample 1:
Input
Output

```
5
1 0
1 1
2 0
2 1
3 1

```

```
No
Yes
Yes
No
Yes

```

### Explanation:

 **Test Case 1 & 2:**  The only permutation of size $1$ is $[1]$, which has $1$ fixed point, not $0$.

 **Test Case 3:**  $[2, 1]$ has $0$ fixed points.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T15:52:04.077Z  

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

[View on CodeChef](https://www.codechef.com/problems/FIXEDPTS)