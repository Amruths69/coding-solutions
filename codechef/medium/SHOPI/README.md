# SHOPI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Toy Boxes

Alice has $N$ toys. The $i$-th toy has a value of $W_i$.

She wants to divide these $N$ toys into two boxes:

- One box must contain exactly $K$ toys.
- The other box must contain the remaining $N-K$ toys.

Alice wants to divide the toys such that the absolute difference between the total values of the two boxes is as  **large**  as possible.

Find the  **maximum possible absolute difference**  between the total values of the two boxes.

### Input Format
- The first line contains $T$ — the number of test cases.
- For each test case: The first line contains two space-separated integers $N$ and $K$. The second line contains $N$ space-separated integers $W_1, W_2, \dots, W_N$ — the values of the toys.
### Output Format

For each test case, print a single integer representing the maximum possible difference between the total values of the two boxes.

### Constraints
- $1 \le T \le 100$
- $1 \le K \lt N \le 100$
- $1 \le W_i \le 10^5$
### Sample 1:
Input
Output

```
2
6 4
100 20 50 10 30 80
5 1
15 30 15 15 20

```

```
230
65
```

### Explanation:
- Test Case 1: Box 1 : [100, 50, 30, 80] (sum = 260), Box 2 : [20, 10] (sum = 30). The absolute difference is $260 - 30 = 230$.
- Test Case 2: Box 1 : [15] (sum = 15), Box 2 : [15, 30, 15, 20] (sum = 80). The absolute difference is $80 - 15 = 65$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-13T16:14:46.575Z  

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

[View on CodeChef](https://www.codechef.com/problems/SHOPI)