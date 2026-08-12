# BUSROW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bus Rows

A bus has $N$ rows of seats, and each row has $M$ seats.

The rows are numbered $1, 2, \ldots, N$ from the front of the bus to the back.
Row number $i$ contains seats numbered $(i-1)\cdot M + 1, (i-1)\cdot M + 2, \ldots, i\cdot M$.
For example, row number $3$ contains seats $2M+1, 2M+2, \ldots, 3M$.

Your seat is number $X$.

You can choose to board the bus either from its front or from its back - which can be thought of as entering the bus from just before row $1$ or just after row $N$, respectively.
After boarding, you will walk through the rows till you reach whichever row contains your seat.

Find the  **minimum**  number of rows you have to walk through, including the destination row.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input, containing three space-separated integers $N, M,$ and $X$ — the number of rows, the number of seats in each row, and your seat number.
### Output Format

For each test case, output on a new line the minimum number of rows you need to walk through to get to your seat.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N, M \leq 100$
- $1 \le X \le N\cdot M$
### Sample 1:
Input
Output

```
4
4 2 5
4 2 4
1 7 7
6 4 14

```

```
2
2
1
3

```

### Explanation:

 **Test case $1$:**  The bus has $N=4$ rows of $M=2$ seats each.
Our seat is $X=5$, which will be in row number $3$ (row $1$ contains seats $1$ and $2$, row $2$ contains seats $3$ and $4$, row $3$ contains seats $5$ and $6$, row $4$ contains seats $7$ and $8$.)

It is optimal for us to enter from the  *back*  of the bus.
Then, to reach row $3$, we need to walk through rows $4$ and $3$, which is two rows in total.

If we enter from the front of the bus, we would need to walk through rows $1, 2, 3$ which is three rows in total - which is worse.

 **Test case $2$:**  The same seating arrangement as the first test, but now our seat is $X=4$.
This is in the second row, and this time it's optimal to enter from the front of the bus and walk through rows $1$ and $2$, for two in total.

 **Test case $3$:**  There is only one row so no matter where we enter from the answer is $1$.

 **Test case $4$:**  There are $6$ rows of $4$ seats each. Our seat is number $14$, which is in the $4$-th row.
It's optimal to enter from the back, and walk through rows $6, 5, 4$ to reach it.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T15:18:09.498Z  

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

[View on CodeChef](https://www.codechef.com/problems/BUSROW)