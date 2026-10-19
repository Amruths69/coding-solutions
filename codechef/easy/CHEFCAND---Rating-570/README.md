# CHEFCAND - Rating 570

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef and Candies

There are $N$ children and Chef wants to give them $1$ candy each. Chef already has $X$ candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing  **exactly**  $4$ candies are available.

Determine the  **minimum**  number of candy packets Chef must buy so that he is able to give $1$ candy to each of the $N$ children.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains two integers $N$ and $X$ — the number of children and the number of candies Chef already has.
### Output Format

For each test case, output the  **minimum**  number of candy packets Chef must buy so that he is able to give $1$ candy to each of the $N$ children.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N, X \leq 100$
### Sample 1:
Input
Output

```
4
20 12
10 100
10 9
20 9

```

```
2
0
1
3

```

### Explanation:

 **Test Case $1$:**  Chef must buy $2$ more packets after which he will have $20$ candies which will be enough to distribute $1$ candy to each of the $20$ children.

 **Test Case $2$:**  Chef does not need to buy more packets since he already has $100$ candies which are enough to distribute $1$ candy to each of the $10$ children.

 **Test Case $3$:**  Chef must buy $1$ more packet after which he will have $13$ candies which will be enough to distribute $1$ candy to each of the $10$ children.

 **Test Case $4$:**  Chef must buy $3$ more packets after which he will have $21$ candies which will be enough to distribute $1$ candy to each of the $20$ children.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T23:52:22.239Z  

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
		    int x=a.nextInt();
		    int g=n-x;
		    if(g<=0){
		        System.out.println(0);
		    }else{
		        
		        System.out.println((g+3)/4);
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFCAND)