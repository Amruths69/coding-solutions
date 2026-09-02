# REACHWT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reach Weight

You need to buy some weights that total to exactly $N$ kg.

You can buy either $1$ kg weights for $20$ rupees, or $2$ kg weights for $30$ rupees.

Find the minimum cost to buy such a set of weights that sum to $N$ kg.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line contains a single integer $N$.
### Output Format

For each test case, output on a new line the minimum total cost of buying a set of weights that total to exactly $N$ kg.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 100$
### Sample 1:
Input
Output

```
3
1
2
3

```

```
20
30
50

```

### Explanation:

 **Test Case 1:**  You buy $1$ one-kg weight for a cost of $20$.

 **Test Case 2:**  You buy $1$ two-kg weight for a cost of $30$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T15:59:29.439Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int n=a.nextInt();
		    if(n%2==1){
		        System.out.println(((n/2)-1)*30+20);
		    }else{
		        
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/REACHWT)