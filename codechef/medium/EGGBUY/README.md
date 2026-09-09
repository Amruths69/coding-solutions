# EGGBUY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Buying Eggs

You want to buy $12$ eggs.

There are two shops that sell eggs.

- The first shop is nearby, and sells eggs at a cost of $X$ coins each.
- The second shop is far away, and sells eggs at a cost of $Y$ coins each. However, since the second shop is far away, you also need to pay an additional $F$ coins in fuel costs to reach it.

Find the minimum possible cost of buying $12$ eggs.

### Input Format
- The first and only line of input will contain three space-separated integers $X, Y,$ and $F$ — the costs of eggs in the first and second shops, and the fuel cost.
### Output Format

Output a single integer: the minimum cost of buying $12$ eggs.

### Constraints
- $1 \le X, Y, F \le 20$
### Sample 1:
Input
Output

```
5 8 3

```

```
60
```

### Explanation:

Buying $12$ eggs from the first shop has a cost of $5\cdot 12 = 60$ coins.
Buying $12$ eggs from the second shop has a cost of $8\cdot 12 = 96$ coins, with an additional $F=3$ in fuel costs for a total of $99$.

It's better to buy from the first shop, spending $60$ coins.

### Sample 2:
Input
Output

```
10 4 5

```

```
53
```

### Explanation:

Buying $12$ eggs from the first shop has a cost of $10\cdot 12 = 120$ coins.
Buying $12$ eggs from the second shop has a cost of $4\cdot 12 = 48$ coins, with an additional $F=5$ in fuel costs for a total of $53$.

It's better to buy from the second shop, spending $53$ coins.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T14:35:44.139Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner a=new Scanner(System.in);
	    int x=a.nextInt();
	    int y=a.nextInt();
	    int f=a.nextInt();
	    int h=x*12;
	    int g=(y*12)+f;
	    if(h>g){
	        System.out.println(g);
	    }else{
	        System.out.println(h);
	    }

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EGGBUY)