# QUACHS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quantum Chips

NVIDIA is working on tools that help researchers build and test quantum-computing systems.

A research lab initially has $X$ quantum chips. NVIDIA provides $Y$ more chips for testing.

During testing, exactly $2Z$ chips become unavailable.

Find the  **number of chips remaining**  for further experiments.

### Input Format

The first line contains three space-separated integers $X$, $Y$, and $Z$.

### Output Format

Print a single integer - the number of chips remaining.

### Constraints
- $1 \le X,Y \le 1000$
- $0 \le Z \le 500$
- $2Z \le X+Y$
### Sample 1:
Input
Output

```
40 20 5
```

```
50
```

### Explanation:

The lab initially has $40+20=60$ chips.

A total of $2 \times 5=10$ chips become unavailable.

Therefore, $60-10=50$ chips remain.

### Sample 2:
Input
Output

```
75 25 20
```

```
60
```

### Explanation:

The lab initially has $75+25=100$ chips.

A total of $2 \times 20=40$ chips become unavailable.

Therefore, $100-40=60$ chips remain.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T14:17:21.247Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner a=new Scanner(System.in);
		System.out.println((a.nextInt()+a.nexInt())-(2*a.nextInt()));

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUACHS)