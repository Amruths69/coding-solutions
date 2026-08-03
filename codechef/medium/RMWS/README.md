# RMWS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Range Minimum with Swaps

You are given an array $A$ consisting of $N$ integers. The array is indexed from $1$ to $N$.

You need to process $Q$ operations. Each operation is one of the following types:

- $1\ i\ j$: Swap the values $A[i]$ and $A[j]$.
- $2\ L\ R$: Find the minimum value in the subarray $A[L \ldots R]$.

The subarray $A[L \ldots R]$ contains all elements from index $L$ to index $R$, inclusive.

Each swap permanently modifies the array, and all subsequent operations are performed on the updated array.

For every operation of type $2$, print the minimum value in the specified subarray.

### Input Format
- The first line contains an integer $N$ — the size of the array.
- The second line contains $N$ space-separated integers representing the array $A$.
- The third line contains an integer $Q$ — the number of operations.
- Each of the next $Q$ lines contains three space-separated integers representing an operation: $1\ i\ j$ — swap $A[i]$ and $A[j]$. $2\ L\ R$ — find the minimum value in $A[L \ldots R]$.
### Output Format

For each operation of type $2$, print the minimum value in the subarray $A[L\ldots R]$ on a separate line.

Do not print anything for operations of type $1$.

### Constraints
- $1 \le N,Q \le 2 \times 10^5$
- $1 \le A[i] \le 10^9$
- $1 \le i,j \le N$
- $1 \le L \le R \le N$
- Each operation is of type $1$ or type $2$.
### Sample 1:
Input
Output

```
5
4 2 5 1 3
4
2 2 4
1 2 4
2 2 4
2 1 5
```

```
1
1
1
```

### Explanation:

Initially,

$$ A=[4,2,5,1,3] $$

For the first operation, the subarray is:

$$ A[2 \ldots 4]=[2,5,1] $$

Its minimum value is $1$.

For the second operation, swap $A[2]$ and $A[4]$. The array becomes:

$$ A=[4,1,5,2,3] $$

For the third operation, the subarray is:

$$ A[2 \ldots 4]=[1,5,2] $$

Its minimum value is $1$.

For the fourth operation, the minimum value in the entire array is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T15:23:33.092Z  

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

[View on CodeChef](https://www.codechef.com/problems/RMWS)