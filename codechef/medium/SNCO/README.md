# SNCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Equal Chocolates

Chef buys $A$ boxes of the first type, with each box containing $X$ chocolates.

Chef also buys $B$ boxes of the second type, with each box containing $Y$ chocolates.

Determine whether the total number of chocolates bought from the first type of boxes is equal to the total number bought from the second type.

Print `YES` if the two totals are equal. Otherwise, print `NO`.

### Input Format

The first line contains four space-separated integers $A$, $X$, $B$, and $Y$.

### Output Format

Print `YES` if the total number of chocolates from both types of boxes is equal. Otherwise, print `NO`

### Constraints
- $1 \le A,X,B,Y \le 100$
### Sample 1:
Input
Output

```
2 5 1 10
```

```
YES
```

### Explanation:

The first type of boxes contains:

$$ 2 \times 5 = 10 $$

chocolates in total.

The second type of boxes contains:

$$ 1 \times 10 = 10 $$

chocolates in total.

Since both totals are equal, the answer is `YES`.

### Sample 2:
Input
Output

```
3 4 2 5
```

```
NO
```

### Explanation:

The first type of boxes contains:

$$ 3 \times 4 = 12 $$

chocolates in total.

The second type of boxes contains:

$$ 2 \times 5 = 10 $$

chocolates in total.

Since the totals are not equal, the answer is `NO`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T14:34:41.218Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner ab=new Scanner(System.in);
	    int a=ab.nextInt();
	    int x=ab.nextInt();
	    int b=ab.nextInt();
	    int y=ab.nextInt();
	    if((a*x)==(b*y))
	    System.out.println("Yes");
	    else
	    System.out.println("No");
	    
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SNCO)