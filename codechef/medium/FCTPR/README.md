# FCTPR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factory Production

There are $N$ machines in a factory. The $i^{\text{th}}$ machine produces one item every $A_i$ seconds. Each machine works continuously and independently.

Your task is to determine the  **minimum**  time required to produce at least $X$ items in total.

### Input Format
- The first line contains two integers $N$ and $X$ — the number of machines and the required number of items.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$, where $A_i$ denotes the time taken by the $i^{\text{th}}$ machine to produce one item.
### Output Format

Print a single integer — the minimum time required to produce at least $X$ items.

### Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le X \le 10^9$
- $1 \le A_i \le 10^9$
### Sample 1:
Input
Output

```
3 15
2 3 7
```

```
18
```

### Explanation:

In $18$ seconds:

- The first machine produces $9$ items.
- The second machine produces $6$ items.
- The third machine produces $2$ items.

A total of $17$ items are produced, which is at least $15$. It is not possible to produce $15$ items in less than $18$ seconds.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T15:17:53.297Z  

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

[View on CodeChef](https://www.codechef.com/problems/FCTPR)