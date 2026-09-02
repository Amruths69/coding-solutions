# MAXSUM77

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Sum

You have an array $A$ of $N$ elements. You will remove either the first or the last element of the array $K$ times (each time, you can choose whether to remove first or last independently).

After all $K$ operations, find the maximum possible sum of the remaining elements of the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers - $N$ and $K$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum possible sum remaining after $K$ operations.

### Constraints
- $1 \le T \le 100$
- $1 \le K \lt N \le 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
4 2
2 6 3 4
3 2
5 1 2
4 2
8 1 6 5

```

```
9
5
11
```

### Explanation:

 **Test Case 1:**  You can delete the first element in the first operation, and the last element in the second operation; leaving you with $[6, 3]$ which has a sum of $9$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T16:08:04.440Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXSUM77)