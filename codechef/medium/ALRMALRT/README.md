# ALRMALRT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alarm Alert

You have two alarms. The first one rings at times $X, 2X, 3X, \ldots$, and the second one rings at times $Y, 2Y, 3Y, \ldots$.

You have a tolerance of $D$. You will wake up at the  *earliest*  time $t \gt 0$ such that:

- at least one alarm rings at time $t$, and
- the other alarm also rang at some time $s \gt 0$ with $s \leq t$ and $t - s \leq D$.

That is, you will wake up at the first instant of time that both alarms ring within $D$ seconds of each other.
Both alarms may ring at the same time.

Find the time at which you wake up. It can be proved that you will always wake up within a finite amount of time.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input, containing three space-separated integers $X$, $Y$, and $D$ — the periods of the two alarms and your tolerance.
### Output Format

For each test case, output on a new line the time at which you wake up.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq X, Y \leq 10^6$
- $0 \leq D \lt \min(X, Y)$
- The sum of $X$ over all test cases does not exceed $10^6$.
- The sum of $Y$ over all test cases does not exceed $10^6$.
### Sample 1:
Input
Output

```
5
3 5 0
2 3 1
6 8 2
9 9 0
987799 975780 200

```

```
15
3
8
9
4731557220

```

### Explanation:

 **Test case $1$:**  Since $D = 0$, both alarms must ring at the same time. The first rings at times $3, 6, 9, 12, 15, \ldots$ and the second at times $5, 10, 15, \ldots$, so you wake up at time $15$.

 **Test case $2$:**  The second alarm rings at time $3$, and the first one rang at time $2$, with $3 - 2 = 1 \leq D$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:40:05.816Z  

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

[View on CodeChef](https://www.codechef.com/problems/ALRMALRT)