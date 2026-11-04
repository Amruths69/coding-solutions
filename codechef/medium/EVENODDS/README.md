# EVENODDS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even the Odds

An array is called  **balanced**  if it contains an even number of odd integers.
In particular, an array with no odd integers is considered balanced too.

You are given an array $A$ of length $N$.
Find the  **maximum**  length of a non-empty contiguous subarray of $A$ that is balanced.

More formally, find the maximum possible value of $R-L+1$ across all pairs $(L, R)$ such that:

- $1 \le L \le R \le N$, and
- The array $[A_L, A_{L+1}, \ldots, A_R]$ is balanced.
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — the elements of the array.
### Output Format

For each test case, output on a new line the length of the longest balanced subarray.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 100$
- $1 \leq A_i \leq 100$
### Sample 1:
Input
Output

```
5
2
1 2
5
8 3 6 2 4
9
2 4 6 8 1 10 12 14 16
5
7 3 9 1 5
7
1 2 3 4 5 6 7

```

```
1
3
4
4
7

```

### Explanation:

 **Test case 1:**  $[2]$ is balanced, while the entire array is not.

 **Test case 2:**  $[6, 2, 4]$ is a longest balanced subarray.

 **Test case 3:**  The only odd element lies in the middle. Removing it and everything on one side of it leaves four elements.

 **Test case 4:**  A subarray of four odd integers is balanced, but the entire array (five odd integers) is not.

 **Test case 5:**  There are four odd elements, so the entire array is balanced.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:36:31.083Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/EVENODDS)