# RETAR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Funding ETA 6

Star Games is preparing to begin development of  **ETA 6**.

To fund the project, the company has sold two editions of  **ETA 5** :

- $X$ copies of the Standard Edition, earning $A$ units from each copy.
- $Y$ copies of the Deluxe Edition, earning $B$ units from each copy.

Star Games needs at least $D$ units in total revenue to begin development of ETA 6.

Print `YES` if the revenue earned from both editions is at least $D$. Otherwise, print `NO`.

### Input Format

The first line contains five space-separated integers $X$, $A$, $Y$, $B$, and $D$.

### Output Format

Print `YES` if Star Games has earned at least $D$ units.

Otherwise, print `NO`.

### Constraints
- $1 \le X,Y \le 1000$
- $1 \le A,B \le 1000$
- $1 \le D \le 10000$
### Sample 1:
Input
Output

```
100 20 50 40 4000
```

```
YES
```

### Explanation:

The Standard Edition earns:

$100 \times 20 = 2000$

The Deluxe Edition earns:

$50 \times 40 = 2000$

Therefore, the total revenue is:

$2000 + 2000 = 4000$

Since $4000 \ge 4000$ units, the output is `YES`.

### Sample 2:
Input
Output

```
60 30 20 50 3000
```

```
NO
```

### Explanation:

The Standard Edition earns:

$60 \times 30 = 1800$

The Deluxe Edition earns:

$20 \times 50 = 1000$

Therefore, the total revenue is:

$1800 + 1000 = 2800$

Since $2800 < 3000$, the output is `NO`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T14:31:29.837Z  

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

[View on CodeChef](https://www.codechef.com/problems/RETAR)