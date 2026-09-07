# SAEVI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum at Even Indices

You are given an array $A$ of $N$ integers and an integer $K$.

Consider only the elements present at  **even indices**  of the array, using  **0-based indexing**. Among these elements, consider only those whose value is  **strictly greater than $2K$**.

Find the sum of all such elements.

If no element satisfies the condition, print `0`.

### Input Format

The first line contains two space-separated integers $N$ and $K$ — the size of the array and the given number.

The second line contains $N$ space-separated integers $A_0,A_1,\ldots,A_{N-1}$.

### Output Format

Print a single integer — the sum of all elements $A_i$ such that:

- $i$ is even, and
- $A_i > 2K$.
### Constraints
- $1 \le N \le 10^5$
- $-10^9 \le K \le 10^9$
- $-10^9 \le A_i \le 10^9$
### Sample 1:
Input
Output

```
6 5
12 25 8 30 15 7
```

```
27
```

### Explanation:

The elements at even indices are:

- index 0 $\rightarrow$ 12
- index 2 $\rightarrow$ 8
- index 4 $\rightarrow$ 15

Since $2K=10$, the values greater than `10` are `12` and `15`.

Therefore, the required sum is:

$12+15=27$

### Sample 2:
Input
Output

```
5 10
15 30 20 50 18
```

```
0
```

### Explanation:

The elements at even indices are `15`, `20`, and `18`.

None of them is strictly greater than $2K=20$.

Therefore, the required sum is `0`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T14:36:36.937Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int k=a.nextInt();
		int g=2*k;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		    
		}
		int s=0;
		for(int i=0;i<n;i+=2){
		    if(i==0||i%2==0){
		        if(arr[i]>g)
		        s++;
		        
		        
		    }
		}
		if(s>0){
		    System.out.println(s);
		}else{
		    System.out.println(0);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SAEVI)