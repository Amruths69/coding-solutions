# BIN_BAT - Rating 786

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Binary Battles

$N$ teams have come to participate in a competitive coding event called “Binary Battles”. It is a single-elimination tournament consisting of several rounds.

 **Note:**  It is known that $N$ is a power of $2$.

In one round, each team will be paired up with and compete against one of the other teams. If there are $X$ teams before the start of a round, $\frac{X}{2}$ matches are held simultaneously during the round between $\frac{X}{2}$ pairs of teams. The winning team of each match will move on to the next round, while the losing team of each match will be eliminated. There are no ties involved. The next round will then take place in the same format between the remaining teams. The process will continue until only one team remains, which will be declared the overall winner.

The organizers want to find the total time the event will take to complete. It is given that each round spans $A$ minutes, and that there is a break of $B$ minutes between every two rounds (no break after the last round).

For example, consider a case when $N = 4$, $A = 10$ and $B = 5$. The first round will consist of two matches and will take $10$ minutes to complete. Two teams move on to round 2 and the other two get eliminated. Then there is a break of $5$ minutes. The two remaining teams compete in round 2, which lasts $10$ more minutes. The team that wins is declared the overall winner. Thus the total time taken is $10 + 5 + 10 = 25$ minutes.

Can you help the organizers determine how long the event will take to finish?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. Then the test cases follow.
- The first and only line of each test case contains three space-separated integers $N$, $A$ and $B$ respectively — the number of teams, the duration of each round and the length of the breaks between rounds.
### Output Format

For each test case, output on a new line the time taken in minutes for the whole event to finish.

### Constraints
- $1 \leq T \leq 10^5$
- $2 \leq N \leq 2^{20}$
- $1 \leq A \leq 100$
- $1 \leq B \leq 100$
- $N$ is a power of $2$.
### Sample 1:
Input
Output

```
4
4 10 5
16 30 5
32 45 15
1024 23 9

```

```
25
135
285
311
```

### Explanation:

 **Test case 1:**  As explained above, the total time the competition will take is $10 + 5 + 10 = 25$ minutes.

 **Test case 2:**  $4$ rounds will take place. The total time it will take is $30 + 5 + 30 + 5 + 30 + 5 + 30 = 135$ minutes.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T06:00:18.020Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int g= (int)(Math.log(n) / Math.log(2));
		    int h=(g-1);
		    System.out.println((g*a)+(h*b));
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BIN_BAT)