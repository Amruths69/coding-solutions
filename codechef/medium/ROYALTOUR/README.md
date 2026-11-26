# ROYALTOUR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Royal Tour

Chef has a king on a chessboard with $N$ rows and $M$ columns. The rows are numbered $1$ to $N$ from top to bottom, and the columns are numbered $1$ to $M$ from left to right. The king starts at cell $(r, c)$.

In one move, the king can go to any cell adjacent to its current cell horizontally, vertically or diagonally (up to $8$ cells), without leaving the board.

Find the minimum number of moves the king needs to visit all four corner cells $(1, 1)$, $(1, M)$, $(N, 1)$ and $(N, M)$.

The corners may be visited in any order, and the king may finish anywhere. A corner counts as visited if the king stands on it at any moment, including the start.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains two space-separated integers $N$ and $M$ — the number of rows and columns of the board. The second line contains two space-separated integers $r$ and $c$ — the starting cell of the king.
### Output Format

For each test case, output on a new line the minimum number of moves the king needs to visit all four corners.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N, M \leq 10^9$
- $1 \leq r \leq N$
- $1 \leq c \leq M$
### Sample 1:
Input
Output

```
4
2 5
1 1
3 3
2 2
1 10
1 4
4 7
2 6

```

```
6
7
12
13

```

### Explanation:

 **Test case $1$:**  The king moves from $(1, 1)$ to $(2, 1)$, then along row $2$ to $(2, 5)$, and finally to $(1, 5)$. This takes $1 + 4 + 1 = 6$ moves.

 **Test case $2$:**  The king first moves to $(1, 1)$, and then visits $(1, 3)$, $(3, 3)$ and $(3, 1)$ in this order, using $2$ moves for each. This takes $1 + 2 + 2 + 2 = 7$ moves.

 **Test case $3$:**  The board has a single row, so the corners are just cells $(1, 1)$ and $(1, 10)$. The king walks $3$ moves left to $(1, 1)$ and then $9$ moves right to $(1, 10)$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T16:09:40.676Z  

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

[View on CodeChef](https://www.codechef.com/problems/ROYALTOUR)