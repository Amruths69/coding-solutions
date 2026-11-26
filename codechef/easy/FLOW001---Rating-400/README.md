# FLOW001 - Rating 400

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Add Two Numbers

Your task is very simple: given two integers $A$ and $B$, write a program to add these two numbers and output the sum.

### Input Format
- The first line contains an integer $T$, the total number of test cases.
- Then follow $T$ lines, each line contains two integers, $A$ and $B$.
### Output Format

For each test case, add $A$ and $B$ and display the sum in a new line.

### Constraints
- $1 \leq T \leq 1000$
- $0 \leq A, B \leq 10000$
### Sample 1:
Input
Output

```
3
1 2
100 200
10 40
```

```
3
300
50
```

### Explanation:

 **Testcase 1:**  $1 + 2 = 3$. Hence the first output is $3$.

 **Testcase 2:**  $100 + 200 = 300$. Hence the second output is $300$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T15:25:17.564Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		System.out.println(a+b);
    		// write your code here
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW001)