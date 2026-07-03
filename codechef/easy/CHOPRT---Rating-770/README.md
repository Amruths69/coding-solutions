# CHOPRT - Rating 770

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef And Operators

Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relationship between two values. Given two numerical values  **A**  and  **B**  you need to help chef in finding the relationship between them that is,

First one is greater than second or, First one is less than second or, First and second one are equal.

 

### Input

First line contains an integer  **T**, which denotes the number of testcases. Each of the  **T**  lines contain two integers  **A**  and  **B**.

### Output

For each line of input produce one line of output. This line contains any one of the relational operators
'<', '>', '='.

### Constraints

1 ≤  **T**  ≤ 10000 1 ≤  **A**,  **B**  ≤ 1000000001
### Sample 1:
Input
Output

```
3
10 20
20 10
10 10

```

```
<
>
=
```

### Explanation:

In this example 1 as 10 is lesser than 20

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-03T04:33:23.815Z  

```cpp
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
		    int x=a.nextInt();
		    int y=a.nextInt();
		    if(x>y){
		        System.out.println(">");
		    }else if(x<y){
		        System.out.println("<");
		    }else{
		        System.out.println("=");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHOPRT)