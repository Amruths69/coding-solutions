# GOALS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Draw Match

Two teams score $X$ and $Y$ goals in a football match.

Chef likes the match if it ends in a draw and at least one goal is scored during the match. A draw occurs when both teams score the same number of goals.

Determine whether Chef likes the match.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains two space-separated integers $X$ and $Y$, the goals scored by the two teams.
### Output Format

For each test case, print `YES` if Chef likes the match, or `NO` otherwise.

You may print the answer in any combination of uppercase and lowercase letters.

### Constraints
- $1 \leq T \leq 100$
- $0 \leq X, Y \leq 9$
### Sample 1:
Input
Output

```
4
3 3
2 5
0 0
7 7
```

```
YES
NO
NO
YES
```

### Explanation:
- Test case $1$: Both teams score $3$ goals. The match is a draw with goals scored, so Chef likes it.
- Test case $2$: The teams score different numbers of goals, so Chef does not like the match.
- Test case $3$: Neither team scores a goal, so Chef does not like the match.
- Test case $4$: Both teams score $7$ goals. The match is a draw with goals scored, so Chef likes it.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T13:54:19.661Z  

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

[View on CodeChef](https://www.codechef.com/problems/GOALS)