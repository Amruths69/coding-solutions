# ARFTWO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### A Ride for Two

Chef and his two friends want to take a boat ride. They have $A$, $B$, and $C$ rupees, respectively.

The boat can carry only two people, and a ride costs $X$ rupees in total. The two people taking the ride must pay using their own money; the person staying behind cannot contribute.

Determine whether any two of them can afford the ride.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains four space-separated integers $A$, $B$, $C$, and $X$ — the amounts of money the three friends have and the total cost of the ride.
### Output Format

For each test case, print `YES` if any two friends can afford the ride, or `NO` otherwise, on a separate line.

You may print the answer in any combination of uppercase and lowercase letters.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq A, B, C, X \leq 100$
### Sample 1:
Input
Output

```
4
2 3 4 8
6 2 3 9
3 7 5 10
4 4 4 9
```

```
NO
YES
YES
NO
```

### Explanation:
- Test case 1: No pair has more than $3+4=7$ rupees, so they cannot afford the ride costing $8$ rupees.
- Test case 2: Chef and the friend with $3$ rupees can combine their money to pay exactly $9$ rupees.
- Test case 3: The friends with $7$ and $5$ rupees have $12$ rupees together, enough for the ride costing $10$ rupees.
- Test case 4: Every pair has $8$ rupees together, which is less than the cost of $9$ rupees.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T15:29:15.521Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ARFTWO)