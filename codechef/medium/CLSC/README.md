# CLSC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Closest Scores

A competition has $N$ participants, represented by the array $score$, where $score[i]$ denotes the score of the $i^{\text{th}}$ participant. No two participants have the same score.

Select two participants and find the minimum possible difference between their scores.

### Input Format
- The first line contains an integer $N$ — the number of participants.
- The second line contains $N$ space-separated integers representing the array $score$.
### Output Format

Print a single integer — the minimum possible difference between the scores of any two participants.

### Constraints
- $2 \le N \le 10^4$
- $1 \le score[i] \le 10^9$
- All elements of $score$ are distinct.
### Sample 1:
Input
Output

```
6
18 7 25 11 30 14
```

```
3
```

### Explanation:

The given array is:

- $score=[18,7,25,11,30,14]$

The minimum difference is obtained by selecting the participants with scores $11$ and $14$.

Therefore, the answer is:

$$ 14-11=3 $$
### Sample 2:
Input
Output

```
7
42 17 29 31 8 50 26
```

```
2
```

### Explanation:

The given array is:

- $score=[42,17,29,31,8,50,26]$

The minimum difference is obtained by selecting the participants with scores $29$ and $31$.

Therefore, the answer is:

$$ 31-29=2 $$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T15:08:59.516Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a= new Scanner(System.in);
		int n=a.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		}
		Arrays.sort(arr);
	    int bn=Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
		    int v=arr[i]-arr[i-1];
		    bn=Math.min(bn,v);
		    
		    
		   
		    
		}
		System.out.println(bn);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLSC)