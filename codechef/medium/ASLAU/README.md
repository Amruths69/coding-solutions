# ASLAU

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Astra Benchmark

GPT-6 Astra is being tested on two tasks.

It scores $A$ points on coding and $B$ points on research. To pass the benchmark, the combined score must be at least $X$.

Determine whether GPT-6 Astra passes the benchmark.

### Input Format

The first line contains three space-separated integers $A$, $B$, and $X$.

### Output Format

Print `YES` if the combined score is at least $X$.

Otherwise, print `NO`.

### Constraints
- $1 \le A \le 1000$
- $1 \le B \le 1000$
- $1 \le X \le 1000$
### Sample 1:
Input
Output

```
420 350 700
```

```
YES
```

### Explanation:

The combined score is:

$420+350=770$

Since $770 \ge 700$, the answer is `YES`.

### Sample 2:
Input
Output

```
240 310 600
```

```
NO
```

### Explanation:

The combined score is:

$240+310=550$

Since $550 < 600$, the answer is `NO`

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T14:28:30.895Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		System.out.println(((a.nextInt()+a.nextInt())>=a.nextInt())? "Yes":"No");

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ASLAU)