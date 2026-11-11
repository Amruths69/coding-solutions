# ROT4

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rotational 4

You have a string $S$ of length $N$, containing digits $0$ to $9$.

Out of the $N$ cyclic shifts of $S$, find the number of them divisible by $4$ when represented as a decimal number.

For example, for $S = 1080$, the cyclic shifts are $1080$, $0801$, $8010$ and $0108$, and out of these $1080$, and $0108$ are divisible by $4$.

The $N$ cyclic shifts of $S$ can be described as: choose an integer $i$ ($0 \le i < N$) and then move the first character of the string $S$ to the back $i$ times.

We distinguish $2$ cyclic shifts by the integer $i$ chosen, even if the $2$ strings end up the same.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains a string $S$.
### Output Format

For each test case, output on a new line the number of cyclic shifts divisible by $4$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $|S| = N$
- $S_i \in \{0, 1, \ldots, 9\}$
- $S_1 \ne 0$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
5
4
1080
3
444
3
222
4
4804
5
10001

```

```
2
3
0
4
2
```

### Explanation:

 **Test Case 1:**  Described in the problem statement.

 **Test Case 2:**  All the cyclic shifts are $444$, which is divisible by $4$. We should output $3$, since we still count them differently.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:51:59.137Z  

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

[View on CodeChef](https://www.codechef.com/problems/ROT4)