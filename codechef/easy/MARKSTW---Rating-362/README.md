# MARKSTW - Rating 362

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Alice and Marks

Alice has scored $X$ marks in her test and Bob has scored $Y$ marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

### Input Format
- The first and only line of input contains two space-separated integers $X, Y$ — the marks of Alice and Bob respectively.
### Output Format

For each testcase, print `Yes` if Alice is happy and `No` if she is not, according to the problem statement.

The judge is case insensitive so you may output the answer in any case. In particular `YES`, `yes`, yEs`are all considered equivalent to`Yes`.

### Constraints
- $1 \leq X, Y \leq 100$
### Sample 1:
Input
Output

```
2 1
```

```
Yes
```

### Explanation:

Alice has scored $X = 2$ marks whereas Bob has scored $Y = 1$ mark. As Alice has scored twice as much as Bob (i.e. $X \geq 2Y$), the answer is `Yes`.

### Sample 2:
Input
Output

```
1 2
```

```
No
```

### Explanation:

Alice has scored $X = 1$ mark whereas Bob has scored $Y = 2$ marks. As Alice has  **not**  scored twice as much as Bob (i.e. $X \lt 2Y$), the answer is `No`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:53:10.172Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// write your code here
		if(x>=y*2)System.out.println("Yes");
		else System.out.println("No");
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MARKSTW)