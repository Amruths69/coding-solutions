# BILBRA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Books in Library

Chef has $N$ books arranged in a row, where the $i$-th book contains $B_i$ pages. He wants to distribute all the books among $A$ students so that each student receives a non-empty contiguous group of books. Every book must be assigned to exactly one student.

Find the  **minimum**  possible value of the  **maximum**  total number of pages assigned to any student.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- For each test case: The first line contains two space-separated integers $N$ and $A$: the number of books and the number of students. The second line contains $N$ space-separated integers $B_1, B_2, \ldots, B_N$: the number of pages in each book.
### Output Format

For each test case, print the minimum possible maximum total number of pages assigned to a student, on a separate line.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq A \leq N$
- $1 \leq B_i \leq 10^5$
- The sum of $N$ over all test cases won't exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
2
5 2
4 8 2 6 10
5 5
10 5 10 12 18

```

```
16
18

```

### Explanation:

 **Test case $1$** : First student will be allocated books $[4, 8, 2]$, other student will be allocated books $[6, 10]$. So sum of pages will be $14$, $16$ and maximum of them will be $16$.

 **Test case $2$** : Each student will be allocated one book and maximum of them will be $18$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T15:46:07.920Z  

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

[View on CodeChef](https://www.codechef.com/problems/BILBRA)