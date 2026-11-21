# INSTNOODLE - Rating 456

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Instant Noodles

Chef has invented $1$-minute Instant Noodles. As the name suggests, each packet takes exactly $1$ minute to cook.

Chef's restaurant has $X$ stoves and only $1$ packet can be cooked in a single stove at any minute.

How many customers can Chef serve in $Y$ minutes if each customer orders exactly $1$ packet of noodles?

### Input Format
- The first and only line of input contains two space-separated integers $X$ and $Y$ — the number of stoves and the number of minutes, respectively.
### Output Format
- Print a single integer, the maximum number of customers Chef can serve in $Y$ minutes
### Constraints
- $1 \leq X, Y \leq 1000$
### Sample 1:
Input
Output

```
3 7
```

```
21
```

### Explanation:

Chef cooks for $Y = 7$ minutes and can cook $X = 3$ packets per minute, one on each stove.

So, the total number of packets that can be cooked is $X \cdot Y = 3 \cdot 7 = 21$.

Each person orders one packet, so the maximum number of customers that can be served is $21$.

### Sample 2:
Input
Output

```
7 8
```

```
56
```

### Explanation:

Chef cooks for $Y = 8$ minutes and can cook $X = 7$ packets per minute, one on each stove.

So, the total number of packets that can be cooked is $X \cdot Y = 7 \cdot 8 = 56$.

Each person orders one packet, so the maximum number of customers that can be served is $56$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T15:20:29.771Z  

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

[View on CodeChef](https://www.codechef.com/problems/INSTNOODLE)