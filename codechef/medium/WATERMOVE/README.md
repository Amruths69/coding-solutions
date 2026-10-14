# WATERMOVE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Water Moving (Min)

You have $N$ cups of water, with the $i$-th cup of water containing $A_i$ amount of water.

In one operation, you can do the following:

- Choose $2$ distinct cups $i$ and $j$ ($1 \le i, j \le N, i \ne j$), such that the $i$-th cup has non-zero amount of water, and move all the water in cup $i$ to cup $j$. After this, cup $i$ contains $0$, and cup $j$ contains $A_i + A_j$ amount of water.

You must perform  **exactly**  $K$ operations.  **Minimize the maximum amount**  of water in any cup at the end of your operations, and report this minimum value.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers $N$ and $K$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum value of maximum amount of water in any cup after your operations.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100$
- $1 \le K \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
2 1
3 1
5 2
1 2 3 4 5
3 100
3 2 2

```

```
4
5
4
```

### Explanation:

 **Test Case 1:**  Move the water from cup $1$ to $2$ in one move. Now, the array is $[0, 4]$.

 **Test Case 2:**  Do the following $2$ moves:

- move the water from cup $1$ to cup $2$
- move the water from cup $3$ to cup $4$.

At the end, the array is $[0, 5, 0, 5, 5]$, and the maximum is $5$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T14:50:07.046Z  

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

[View on CodeChef](https://www.codechef.com/problems/WATERMOVE)