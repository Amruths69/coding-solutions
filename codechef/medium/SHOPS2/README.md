# SHOPS2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shopping 2

Chef wants to buy $N$ items. There are $2$ shops selling each of these items.

The $i$-th item costs $A_i$ rupees at shop $1$, and $B_i$ at shop $2$.

Chef needs to spend $D$ rupees to go to one of the shops, so if he wants to go to both, he will need to spend $2 \cdot D$ rupees.

Find the minimum cost for Chef to buy all of the items $1$ through $N$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers $N$ and $D$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$. The third line contains $N$ integers - $B_1, B_2, \ldots, B_N$.
### Output Format

For each test case, output on a new line the minimum cost Chef needs to pay.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 100$
- $1 \le A_i, B_i, D \le 100$
### Sample 1:
Input
Output

```
3
3 100
1 2 3
3 1 1
3 5
1 10 10
10 1 12
4 1
1 2 3 4
4 3 2 1

```

```
105
22
8
```

### Explanation:

 **Test Case 1:**  Chef will go only to shop $2$, and buy all items there. This will cost him $D + B_1 + B_2 + B_3 = 105$.

If Chef went to both stores, the cost would be $\ge 200$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:51:51.024Z  

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

[View on CodeChef](https://www.codechef.com/problems/SHOPS2)