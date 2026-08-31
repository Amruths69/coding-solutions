# LISH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Limited Ingredient Shopping

You need to purchase ingredients with a total weight of at least $W$ grams.

There are $N$ different types of ingredients available. You are given an array $A$ of size $N$, where $A_i$ denotes the weight, in grams, of  **one unit of the $i$-th ingredient type**.

You may purchase  **at most two units of each ingredient type**.

Determine the  **minimum total number of units**  you need to purchase so that their combined weight is at least $W$ grams. If it is impossible to reach $W$ grams, print `-1`.

### Input Format
- The first line contains an integer $W$ — the required total weight in grams.
- The second line contains an integer $N$ — the number of ingredient types.
- The third line contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$, where $A_i$ is the weight of one unit of the $i$-th ingredient type.
### Output Format
- Print a single integer — the minimum number of ingredient units required, or -1 if it is impossible.
### Constraints
- $1 \le W \le 10^5$
- $1 \le N \le 10^5$
- $1 \le A_i \le 10^5$
### Sample 1:
Input
Output

```
20
3
5 8 12
```

```
2
```

### Explanation:

Purchase:

- One unit of weight 12
- One unit of weight 8

The total weight is `20`, so only `2` units are required.

### Sample 2:
Input
Output

```
25
3
6 8 10
```

```
3
```

### Explanation:

Using only two units, the maximum possible weight is `10 + 10 = 20`, which is less than `25`.

Purchase:

- Two units of weight 10
- One unit of weight 8

The total weight is `28`, so the minimum number of units required is `3`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T14:52:48.587Z  

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

[View on CodeChef](https://www.codechef.com/problems/LISH)