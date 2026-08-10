# DLFEE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Delivery Fee

You are ordering food that costs $A$ rupees.

Normally, a delivery fee of $B$ rupees is added to the order. However, if the food cost is  **at least $K$ rupees**, the delivery is free.

Find the  **total amount**  you need to pay.

### Input Format
- The first line contains three space-separated integers $A$, $B$, and $K$ — the food cost, the delivery fee, and the minimum food cost required for free delivery.
### Output Format
- Print a single integer — the total amount you need to pay.
### Constraints
- $1 \le A,B,K \le 10^4$
### Sample 1:
Input
Output

```
450 50 500
```

```
500
```

### Explanation:

The food cost is $450$, which is less than $500$.

Therefore, the delivery fee of $50$ is added.

The total amount is $450+50=500$.

### Sample 2:
Input
Output

```
600 50 500
```

```
600
```

### Explanation:

The food cost is at least $500$, so the delivery is free.

Therefore, the total amount is $600$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T15:27:42.683Z  

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
	int b=ab.nextInt();
	int k=ab.nextInt();
	if(a>=k)
	System.out.println(a);
	else
	System.out.println(a+b);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DLFEE)