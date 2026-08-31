# SCOCN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Second Occurrence

You are given an array $A$ of $N$ integers and an integer $X$.

Find the  **0-based index of the second occurrence**  of $X$ in the array.

If $X$ does not appear in the array, print `-1`.

If $X$ appears exactly once, print `-2`.

### Input Format
- The first line contains an integer $N$ — the size of the array.
- The second line contains $N$ space-separated integers $A_0, A_1, \ldots, A_{N-1}$.
- The third line contains an integer $X$.
### Output Format

Print:

- the 0-based index of the second occurrence of $X$, if it exists;
- -1 if $X$ does not appear;
- -2 if $X$ appears exactly once.
### Constraints
- $1 \le N \le 1000$
- $0 \le A_i \le 100$
- $0 \le X \le 100$
### Sample 1:
Input
Output

```
5
45 56 98 56 32
56
```

```
3
```

### Explanation:

The value `56` occurs at indices `1` and `3`.

Its second occurrence is at index `3`.

Therefore, the output is `3`.

### Sample 2:
Input
Output

```
4
71 52 63 94
89
```

```
-1
```

### Explanation:

The value `89` does not appear in the array.

Therefore, the output is `-1`.

### Sample 3:
Input
Output

```
10
9 4 8 4 0 0 10 2 7 3
2
```

```
-2
```

### Explanation:

The value `2` appears only once in the array, at index `7`.

Therefore, the output is `-2`.

### Sample 4:
Input
Output

```
5
50 50 50 50 50
50
```

```
1
```

### Explanation:

The value `50` appears at indices `0`, `1`, `2`, `3`, and `4`.

Its second occurrence is at index `1`.

Therefore, the output is `1`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T14:37:37.370Z  

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

[View on CodeChef](https://www.codechef.com/problems/SCOCN)