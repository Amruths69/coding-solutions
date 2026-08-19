# IOI7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### IOI Gold

Chef recently participated in the IOI competition, and scored $N$ points out of $600$ on the $2$ days of competition.

Just now, the gold cutoff was released, which was $G$ points, meaning everyone with at least $G$ points gets a gold medal. Chef wants to know if he will get gold or not. Print $\text{Yes}$ or $\text{No}$ accordingly.

Both $N$ and $G$ are integers.

### Input Format
- The first and only line contains $2$ integers - $N$ and $G$.
### Output Format

Output $\text{Yes}$ or $\text{No}$ depending on whether Chef gets a gold medal or not.

### Constraints
- $0 \le N, G \le 600$
### Sample 1:
Input
Output

```
498 361

```

```
Yes
```

### Explanation:

Chef scored $498$ points while the gold cutoff was $361$ points, so he easily clears the cutoff. One might even think he could win the IOI.

### Sample 2:
Input
Output

```
300 361

```

```
No
```

### Explanation:

Chef scored $300$ points while the cutoff was $361$, hence he failed to get a gold.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T15:12:06.406Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner a=new Scanner(System.in);
	    int n=a.nextInt();
	    int g=a.nextInt();
	    if(n>=g)
	    System.out.println("Yes");
	    else
	    System.out.println("No");

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/IOI7)