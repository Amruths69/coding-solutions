# ADDIS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Additive Dissonance

You are given an array $A$ of length $N$.

You must perform the following operation  **exactly once** :

- Choose any integer $X$.
- Create a new array $B$ of length $N$ such that for each $1 \le i \le N$, either $B_i = A_i-X$ or $B_i = A_i+X$. Note that the choice of whether to use $A_i-X$ or $A_i+X$ can be made for each index $i$ independently.

Find the minimum possible value of the maximum frequency of any integer in $B$.

More formally, for an integer $Y$, define $\text{freq}_B(Y)$ to be the number of occurrences of $Y$ in array $B$.
Your task is to minimize the value

$$ \max_Y \left(\operatorname{freq}_B(Y)\right) $$

by choosing the integer $X$ and adding/subtracting appropriately to obtain the array $B$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line of each test case contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum possible value of the maximum frequency of any integer in $B$ after performing the operation.

### Constraints
- $1 \le T \le 10^5$
- $1 \le N \le 2\cdot 10^5$
- $1 \le A_i \le 10^9$
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$
### Sample 1:
Input
Output

```
3
2
7 7
5
5 2 2 5 2
4
8 1 6 3

```

```
1
2
1

```

### Explanation:

 **Test case $1$:**  We have $A = [7, 7]$. Choose $X = 3$ and convert the array to $[7+3, 7-3] = [10, 4]$.
The maximum frequency of any element is now $1$, which is clearly the best we can do.

 **Test case $2$:**  We have $A = [5, 2, 2, 5, 2]$. One solution is as follows:

- Choose $X = 4$.
- Add $X$ to indices $1, 3, 5$ and subtract it from indices $2, 4$.
- This results in the array $[9, -2, 6, 1, 6]$.

The maximum frequency of an element is $2$, since $6$ appears two times.
It can be shown that this is optimal.

 **Test case $3$:**  All the elements are already distinct, i.e. the maximum frequency is $1$. We can choose $X = 0$ and essentially leave the array unchanged to preserve this.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T14:54:34.878Z  

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=a.nextInt();
		    }
		    int[] brr=new int[n];
		    for(int i=0;i<n;i++){
		        brr[i]=arr[i]+1;
		    }
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ADDIS)