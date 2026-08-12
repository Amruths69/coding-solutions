# CHOCGM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chocolate Game

There are $N$ boxes of chocolates. The $i$-th box contains $A_i$ chocolates.

Alice and Bob are trying to eat these chocolates.
They decide to do that as follows:

- If the total number of remaining chocolates is even, it's Alice's turn to eat. Otherwise, it's Bob's turn.
- On a player's turn, they must choose exactly one box that contains a positive number of chocolates, and then eat any positive integer number of chocolates from it.

Importantly, note that the players do not alternate turns: it's possible that the same person eats chocolates multiple times in a row, depending on their choices. See the examples below for explained examples.

Both Alice and Bob will play in such a way that they try to maximize the total number of chocolates that they can eat.
Your task is to compute the number of chocolates Alice will eat, under optimal play.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the number of boxes. The second line contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, output on a new line the number of chocolates Alice will be able to eat, under optimal play.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 100$
- $1 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
2
3 3
3
1 2 2
4
4 2 3 1

```

```
5
0
9

```

### Explanation:

 **Test case $1$:**  One sequence of events that maximizes Alice's chocolate is as follows.

- Initially, the boxes contain $[3, 3]$ chocolates. The total is $3+3 = 6$ which is even, so it is Alice's turn. Alice will eat $2$ chocolates from the first box.
- There are now $[1, 3]$ chocolates. $1+3 = 4$ is even, so it is again Alice's turn. Alice will eat $2$ chocolates from the second box.
- There are now $[1, 1]$ chocolates. $1+1 = 2$ is even, so it is again Alice's turn. Alice will eat $1$ chocolate from the second box.
- There are now $[1, 0]$ chocolates. $1+0=1$ is odd, so it is now Bob's turn. Bob will eat $1$ chocolate from the first box, which is the last chocolate.

This way, Alice has managed to eat $2+2+1 = 5$ chocolates. She cannot eat any more than this under optimal play by Bob.

 **Test case $2$:**  The chocolates are $[1, 2, 2]$. Bob is able to eat all the chocolates, as follows:

- Initially, there are $1+2+2=5$ chocolates, which is odd. It's Bob's turn. Bob eats $2$ chocolates from the third box.
- Next, there are $1+2+0 = 3$ chocolates, which is again odd so it's still Bob's turn. Bob eats $2$ chocolates from the second box.
- Now there are $1+0+0=1$ chocolates, which is still odd. Bob eats one chocolate from the first box.

Bob can thus eat all the chocolates without ever giving Alice a turn - so Alice gets $0$ chocolates.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T15:25:09.608Z  

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

[View on CodeChef](https://www.codechef.com/problems/CHOCGM)