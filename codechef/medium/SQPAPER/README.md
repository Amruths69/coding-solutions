# SQPAPER

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Square Paper

You have a rectangular piece of paper of dimensions $A \cdot B$. You are wondering what is the largest square piece of paper you can cut off from this rectangular piece.

Find the area of this maximum square paper.

You are only allowed to cut along parallel to the edges of the paper, so either horizontal or vertical cuts.

### Input Format
- The only line of input contains $2$ integers - $A$ and $B$.
### Output Format

Output a single integer - the area of the maximum square you can cut off

### Constraints
- $1 \le A, B \le 5$
### Sample 1:
Input
Output

```
2 3

```

```
4

```

### Explanation:

You can cut off a $2 \cdot 2$ square from the rectangle.

### Sample 2:
Input
Output

```
4 3

```

```
9

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-15T15:43:20.829Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int c=a.nextInt();
		int d=Math.min(b,c);
		System.out.println(d*d);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SQPAPER)