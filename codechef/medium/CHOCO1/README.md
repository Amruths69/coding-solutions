# CHOCO1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chocolate Squares

Chef has a rectangular chocolate bar of length $L$ and breadth $B$.
He wants to divide the entire bar into identical square pieces of side length $S$ such that no chocolate is wasted.
Find the  **maximum**  possible value of $S$.

### Input Format
- The first line contains $T$ — the number of test cases.
- Each of the next $T$ lines contains two space-separated integers $L$ and $B$ — the length and the breadth of the chocolate bar, respectively.
### Output Format

For each testcase, print a single integer representing the maximum side length $S$.

### Constraints
- $1 \le T \le 1000$
- $1 \le L, B \le 1000$
### Sample 1:
Input
Output

```
2
40 30
76 88
```

```
10
4
```

### Explanation:

 **Test Case 1:**  The chocolate bar has dimensions $40 \times 30$. If Chef cuts the bar into squares of side length $10$, he gets exactly $12$ pieces ($4$ pieces along the length and $3$ pieces along the width) with no leftover chocolate.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-13T16:07:45.628Z  

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
		    int l=a.nextInt();
		    int b=a.nextInt();
		    int max=0;
		    int maxxy=0;
		    for(int i=1;i<Math.max(b,l);i++){
		        if(l%i==0 && b%i==0){
		            maxxy=i;
		        }
		        max=Math.max(max,maxxy);
		        
		    }
		    System.out.println(max);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHOCO1)