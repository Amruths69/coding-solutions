# ONEFULPAIRS - Rating 374

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Oneful Pairs

Chef defines a pair of positive integers $(a, b)$ to be a $\text{Oneful Pair}$, if

$a + b + (a \cdot b) = 111$

For example, $(1, 55)$ is a $\text{Oneful Pair}$, since $1 + 55 + (1 \cdot 55) = 56 + 55 = 111$.
But $(1, 56)$ is not a $\text{Oneful Pair}$, since $1 + 56 + (1 \cdot 56) = 57 + 56 = 113 \neq 111$.

Given two positive integers $a$ and $b$, output `Yes` if they are a $\text{Oneful Pair}$. And `No` otherwise.

### Input Format

The only line of input contains two space-separated integers $a$ and $b$.

### Output Format

Output `Yes`, if $(a, b)$ form a $\text{Oneful Pair}$. Output `No` if they do not.

You may print each character of `Yes` and `No` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints
- $1 \leq a, b \leq 1000$
### Sample 1:
Input
Output

```
1 55

```

```
Yes

```

### Explanation:

$(1, 55)$ is a $\text{Oneful Pair}$, since $1 + 55 + (1 \cdot 55) = 56 + 55 = 111$.

### Sample 2:
Input
Output

```
1 56

```

```
No
```

### Explanation:

$(1, 56)$ is not a $\text{Oneful Pair}$, since $1 + 56 + (1 \cdot 56) = 57 + 56 = 113 \neq 111$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:55:52.776Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// write your code here
		if(((a+b)+(a*b))==111)System.out.println("yes");
		else System.out.println("No");
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ONEFULPAIRS)