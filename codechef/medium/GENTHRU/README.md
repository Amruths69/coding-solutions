# GENTHRU

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Greed Island Bomber

Genthru has observed that all $N$ cities on Greed Island have good trade relations with each other, because there is a route between every pair of cities. Being a villain, he wants to sever the trade relation between at least one pair of cities. To do so, he will destroy  **exactly one**  of the existing $M$ roads.

 **Count the roads**  such that, if that road is destroyed, there is  **no longer a route between at least one pair of cities**.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case is described as follows: The first line contains two space-separated integers $N$ and $M$: the number of cities and the number of roads. Each of the next $M$ lines contains two space-separated integers $a_i$ and $b_i$, meaning there is a road between cities $a_i$ and $b_i$.
### Output Format

For each test case, print on a  **separate line**  the  **number of roads whose destruction disconnects the cities**.

### Constraints
- $1 \le T \le 100$
- $1 \le N \le 1000$
- $N - 1 \le M \le N(N-1)/2$
- $1 \le a_i, b_i \le N$
- Initially, a route exists between every pair of cities.
- There is at most one road between any pair of cities.
- There are no roads from a city to itself.
### Sample 1:
Input
Output

```
3
6 6
1 2
1 3
2 3
1 4
4 5
4 6
3 3
1 2
1 3
2 3
4 3
1 2
2 3
3 4
```

```
3
0
3
```

### Explanation:
- Test case 1: Destroying any one of the roads 1-4, 4-5 or 4-6 disconnects the cities, so the answer is $3$.
- Test case 2: The three cities form a triangle. Destroying any single road still leaves a route between every pair, so the answer is $0$.
- Test case 3: The cities form a path, so destroying any of the $3$ roads disconnects them, and the answer is $3$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T16:05:41.938Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/GENTHRU)