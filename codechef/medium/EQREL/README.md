# EQREL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Equal Reservoir Levels

You are given $N$ reservoirs arranged in a chain. The $i$-th reservoir currently has a water level $H_i$.

You may reduce the water level of any reservoir to any lower non-negative level. Reducing a reservoir's water level from X to Y costs X - Y energy units.

Your goal is to make the water level of  **all reservoirs equal**  while minimizing the total energy spent.

Find the  **minimum total energy**  required.

### Input Format

The first line contains an integer $N$ — the number of reservoirs.

The second line contains $N$ space-separated integers $H_1,H_2,\ldots,H_N$ — the initial water levels.

### Output Format

Print a single integer — the minimum total energy required to make all water levels equal.

### Constraints
- $1 \le N \le 10^5$
- $1 \le H_i \le 10^9$
### Sample 1:
Input
Output

```
4
8 3 6 3
```

```
8
```

### Explanation:

Since water levels can only be reduced, all reservoirs must end at a level no greater than $3$, the minimum initial water level.

Choosing a final level of $3$ requires:

$8 \rightarrow 3$ with cost $5$

$3 \rightarrow 3$ with cost $0$

$6 \rightarrow 3$ with cost $3$

$3 \rightarrow 3$ with cost $0$

Therefore, the minimum total energy is:

$5+0+3+0=8$

### Sample 2:
Input
Output

```
1
5
```

```
0
```

### Explanation:

There is only one reservoir, so all water levels are already equal.

Therefore, no energy is required.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T15:00:33.896Z  

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

[View on CodeChef](https://www.codechef.com/problems/EQREL)