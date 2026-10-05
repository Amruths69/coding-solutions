# NODESDIST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distance between two nodes

Given an undirected connected tree with  **N**  nodes, numbered from  **1**  to  **N**, and rooted at node  **1**, and two nodes $u$ and $v$, find the distance between these two nodes. (**Note:**  the distance between two nodes is the no. of edges in the simple path between them.)

For example, in the following tree, the distance between nodes $3$ and $7$ is $4$.

### Input Format
- The first line of the input contains three space separated integers $N$, $u$ and $v$ — the number of nodes, and two given nodes.
- The next $N - 1$ lines describe the edges. The $i$-th of these $N - 1$ lines contains two space-separated integers $u_i$ and $v_i$, denoting a bidirectional edge between $u_i$ and $v_i$.
### Output Format
- Output on the single line, the distance between the nodes $u$ and $v$.
### Constraints
- $1 \leq N \leq 100000$
- $1 \leq u_i, v_i \leq N$
- $1 \leq u, v \leq N$
### Sample 1:
Input
Output

```
7 3 7
1 2
1 4
2 5
2 3
2 6
4 7
```

```
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T14:40:31.633Z  

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

[View on CodeChef](https://www.codechef.com/problems/NODESDIST)