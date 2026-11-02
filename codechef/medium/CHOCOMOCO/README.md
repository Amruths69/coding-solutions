# CHOCOMOCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Choco Gifts

A chocolate shop prepares two types of gift boxes: large boxes containing $4$ chocolates each and small boxes containing $2$ chocolates each.

The shop has $N$ chocolates, where $N$ is even. It uses them to prepare as many large boxes as possible, then prepares small boxes with the remaining chocolates.

A customer wants to buy a small gift box. Determine whether at least one will be available.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains a single integer $N$, the number of chocolates.
### Output Format

For each test case, print `YES` if at least one small gift box is available, or `NO` otherwise, on a separate line.

You may print the answer in any combination of uppercase and lowercase letters.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 1000$
- $N$ is even.
### Sample 1:
Input
Output

```
4
14
20
2
26
```

```
YES
NO
YES
YES
```

### Explanation:
- Test case $1$: The shop prepares $3$ large boxes using $12$ chocolates. The remaining $2$ chocolates are used to prepare one small box.
- Test case $2$: The shop prepares $5$ large boxes using all $20$ chocolates. No small box is available.
- Test case $3$: There are not enough chocolates for a large box, so the shop prepares one small box using both chocolates.
- Test case $4$: The shop prepares $6$ large boxes using $24$ chocolates. The remaining $2$ chocolates are used to prepare one small box.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T15:20:06.821Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		while(t-->0){
		    int n=ac.nextInt();
		    int f=n%4;
		    if(f==0||f==1){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHOCOMOCO)