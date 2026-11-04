# COPYCAT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Copycat

You are given a  **binary**  string $S$ of length $N$.

In one operation, you may choose an index $i$ such that $1 \leq i \lt N$ and set $S_i := S_{i+1}$, that is, copy the character to its right.

Find the minimum number of operations required to make $S$ sorted in non-decreasing order.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the string. The second line contains the binary string $S$ of length $N$.
### Output Format

For each test case, output on a new line the minimum number of operations required to make $S$ sorted.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 200$
- $S$ consists only of the characters 0 and 1.
### Sample 1:
Input
Output

```
4
3
110
5
01001
5
10101
9
011010011

```

```
2
1
2
3

```

### Explanation:

 **Test case $1$:**  One optimal sequence of two operations is as follows:

- Choose $i = 2$, and set $S_2 := S_3$. The string becomes 100.
- Choose $i = 1$, and set $S_1 := S_2$. The string becomes 000, which is sorted.

 **Test case $2$:**  Choosing $i = 2$ gives `00001`, which is sorted.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:39:54.664Z  

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

[View on CodeChef](https://www.codechef.com/problems/COPYCAT)