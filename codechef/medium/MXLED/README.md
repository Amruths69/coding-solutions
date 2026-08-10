# MXLED

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Lead

Two players play a game consisting of $N$ rounds.

In each round, both players receive some points. After every round, the scores obtained so far are added to form the  **cumulative score**  of each player.

For example, suppose after two rounds the scores are:

- Player $1$: $10, 20$
- Player $2$: $15, 5$

After round $2$, their cumulative scores are $30$ and $20$ respectively. Therefore, Player $1$ is leading by $10$ points.

The player with the higher cumulative score after a round is the leader of that round. The  **lead**  is the difference between the two cumulative scores.

Among all rounds, find the player who achieved the  **maximum lead**  at the end of any round, along with that lead.

It is guaranteed that there will be a unique winner.

### Input Format
- The first line contains an integer $N$ — the number of rounds.
- Each of the next $N$ lines contains two integers $S_i$ and $T_i$ — the scores of Player $1$ and Player $2$ respectively in the $i$-th round.
### Output Format
- Print two space-separated integers $W$ and $L$, where: $W$ is the player who achieved the maximum lead, either $1$ or $2$. $L$ is the maximum lead achieved.
### Constraints
- $1 \le N \le 10^4$
- $1 \le S_i,T_i \le 1000$
### Sample 1:
Input
Output

```
4
10 5
4 8
7 3
6 9
```

```
1 5
```

### Explanation:

The cumulative scores after each round are:

- Round $1$: $10$ and $5$ — Player $1$ leads by $5$.
- Round $2$: $14$ and $13$ — Player $1$ leads by $1$.
- Round $3$: $21$ and $16$ — Player $1$ leads by $5$.
- Round $4$: $27$ and $25$ — Player $1$ leads by $2$.

The maximum lead is $5$, achieved by Player $1$.

### Sample 2:
Input
Output

```
5
3 8
10 4
2 9
7 6
5 10
```

```
2 10
```

### Explanation:

The cumulative scores after each round are:

- Round $1$: $3$ and $8$ — Player $2$ leads by $5$.
- Round $2$: $13$ and $12$ — Player $1$ leads by $1$.
- Round $3$: $15$ and $21$ — Player $2$ leads by $6$.
- Round $4$: $22$ and $27$ — Player $2$ leads by $5$.
- Round $5$: $27$ and $37$ — Player $2$ leads by $10$.

The maximum lead is $10$, achieved by Player $2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T15:46:11.051Z  

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
		 int p1 = 0;
        int p2 = 0;

        int m = 0;
        int w = 0;
		 while(n-- > 0)
        {
            int s = a.nextInt();
            int s2 = a.nextInt();

            p1 += s;
            p2 += s2;

            int l = Math.abs(p1 - p2);

            if(l > m)
            {
                m = l;

                if(p1 > p2)
                    w = 1;
                else
                    w = 2;
            }
        }
		 System.out.println(w + " " + m);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MXLED)