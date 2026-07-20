# CANDY01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Candy Distribution

Chef is organizing a party for $N$ children.

The $i^{\text{th}}$ child needs at least $A_i$ candies to be happy.

Chef has a total of $C$ candies.

Determine whether Chef can make  **all**  the children happy by distributing the candies. Each candy can be given to only one child.

### Input Format
- The first line contains two space-separated integers $N$ and $C$.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

Print `Yes` if Chef can make all the children happy, and `No` otherwise.

Any capitalization of `Yes` and `No` is accepted. For example, `YES`, `yes`, `YeS`, `yES`, `NO`, `no`, and `nO` are all considered valid.

### Constraints
- $1 \le N \le 100$
- $1 \le C \le 10^9$
- $1 \le A_i \le 10^4$
### Sample 1:
Input
Output

```
3 10
2 3 4
```

```
Yes
```

### Explanation:

The children need a total of $2 + 3 + 4 = 9$ candies, and Chef has $10$ candies. Hence, Chef can make all the children happy.

### Sample 2:
Input
Output

```
5 12
2 4 3 5 1
```

```
No
```

### Explanation:

The children need a total of $2 + 4 + 3 + 5 + 1 = 15$ candies, but Chef has only $12$ candies. Hence, it is not possible to make all the children happy.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T15:13:58.564Z  

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
		int c=a.nextInt();
		int g=0;
		for(int i=0;i<n;i++){
		    g+=a.nextInt();
		}
        if(g>=0)
        System.out.println("yes");
        else
        System.out.println("no");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CANDY01)