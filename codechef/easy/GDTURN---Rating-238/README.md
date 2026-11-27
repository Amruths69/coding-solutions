# GDTURN - Rating 238

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Good Turn

Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be  *good*  if the  **sum**  of the numbers on their dice is greater than $6$.
Given that in a particular turn Chef and Chefina got $X$ and $Y$ on their respective dice, find whether the turn was good.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case contains two space-separated integers $X$ and $Y$ — the numbers Chef and Chefina got on their respective dice.
### Output Format

For each test case, output on a new line, `YES`, if the turn was good and `NO` otherwise.

Each character of the output may be printed in either uppercase or lowercase. That is, the strings `NO`, `no`, `nO`, and `No` will be treated as equivalent.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq X, Y \leq 6$
### Sample 1:
Input
Output

```
4
1 4
3 4
4 2
2 6

```

```
NO
YES
NO
YES

```

### Explanation:

 **Test case $1$:**  The sum of numbers on the dice is $1+4 = 5$ which is smaller than $6$. Thus, the turn is not good.

 **Test case $2$:**  The sum of numbers on the dice is $3+4 = 7$ which is greater than $6$. Thus, the turn is good.

 **Test case $3$:**  The sum of numbers on the dice is $4+2 = 6$ which is equal to $6$. Thus, the turn is not good.

 **Test case $4$:**  The sum of numbers on the dice is $2+6 = 8$ which is greater than $6$. Thus, the turn is good.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T15:41:30.898Z  

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
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		// write your code here
    		if((x+y))
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GDTURN)