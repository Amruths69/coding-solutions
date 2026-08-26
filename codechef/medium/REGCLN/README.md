# REGCLN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Regular Cleaning

Chef will do a deep cleaning of his house every $10$ days - meaning on days numbered $10, 20, 30, \ldots$

Today is day number $N$.
How many more days are there until the next day  **strictly after today**  that Chef will deep clean?

### Input Format
- The only line of input will contain one integer $N$, representing the current day number.
### Output Format

Output a single integer: the number of days till the next deep cleaning.

### Constraints
- $1 \le N \le 100$
### Sample 1:
Input
Output

```
24

```

```
6

```

### Explanation:

Today is day $24$. The next deep cleaning will be on day $30$, so the answer is $30-24 = 6$.

### Sample 2:
Input
Output

```
30

```

```
10

```

### Explanation:

Today is day $30$. The next deep cleaning after today will be on day $40$, so the answer is $40-30 = 10$.

Note that even though a deep cleaning is done on day $30$ itself, we want to know the number of days to the  *next*  day with cleaning.

### Sample 3:
Input
Output

```
49

```

```
1

```

### Explanation:

Today is day $49$. The next deep cleaning will be on day $50$, so the answer is $50-49 = 1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:52:09.174Z  

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

[View on CodeChef](https://www.codechef.com/problems/REGCLN)