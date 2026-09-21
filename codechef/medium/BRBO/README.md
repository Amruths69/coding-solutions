# BRBO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Burst Balloons

You are given an array $nums$ of $N$ balloons, where $nums_i$ represents the number written on the $i$-th balloon.

When you burst a balloon, you gain coins equal to:

$left \times nums_i \times right$

where $left$ is the value of the nearest unburst balloon immediately to its left and $right$ is the value of the nearest unburst balloon immediately to right.

If there is no unburst balloon on one side, use the value $1$ for that side.

Find the  **maximum number of coins**  you can collect by choosing the order in which the balloons are burst.

### Input Format
- The first line contains an integer $N$ — the number of balloons.
- The second line contains $N$ space-separated integers $nums_1,nums_2,\ldots,nums_N$.
### Output Format
- Print a single integer — the maximum number of coins you can collect.
### Constraints
- $1 \le N \le 300$
- $0 \le nums_i \le 100$
### Sample 1:
Input
Output

```
4
3 1 5 8
```

```
167
```

### Explanation:

One optimal bursting order is:

$1 \rightarrow 5 \rightarrow 3 \rightarrow 8$

The coins obtained are:

$3\times1\times5 \rightarrow 15$

$3\times5\times8 \rightarrow 120$

$1\times3\times8 \rightarrow 24$

$1\times8\times1 \rightarrow 8$

Therefore, the total number of coins is:

$15+120+24+8=167$

### Sample 2:
Input
Output

```
2
1 5
```

```
10
```

### Explanation:

Burst the balloon with value $1$ first:

$1\times1\times5 \rightarrow 5$

Then burst the remaining balloon with value $5$:

$1\times5\times1 \rightarrow 5$

Therefore, the maximum number of coins is:

$5+5=10$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T14:35:15.257Z  

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

[View on CodeChef](https://www.codechef.com/problems/BRBO)