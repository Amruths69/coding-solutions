# STONEMOV

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Stone Moving

There are $N$ piles of stones, the $i$-th pile containing $A_i$ stones.

Consider the process as follows:

- For $i = 1, 2, \ldots, N$ (in this order): Let $X = \min(A_i, N - i)$ Move $1$ stone from the pile numbered $i$ to each of the piles numbered $i + 1, i + 2, i + 3, \ldots, i + X$.

Find the total number of stones moved by the process above.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the total number of stones moved.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $0 \le A_i \le N$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
3 3 3
3
1 0 1
6
2 0 3 0 1 4
2
0 0

```

```
3
2
8
0
```

### Explanation:

 **Test Case 1:**  The process happens as follows:

- $i = 1$ : $X = 2$, and we move $1$ stone from pile $1$ to each of $2$ and $3$. The resulting array $A$ is $[1, 4, 4]$.
- $i = 2$ : $X = 1$, and the array updates to $[1, 3, 5]$.
- $i = 3$ : $X = 0$, no further stone moves.

The total number of stones moved is $3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:52:35.341Z  

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

[View on CodeChef](https://www.codechef.com/problems/STONEMOV)