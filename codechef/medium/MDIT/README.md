# MDIT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Difference in a Tree

You are given a rooted tree with $N$ nodes, numbered from $1$ to $N$.

The tree is represented by the array $parent$, where $parent[i]$ denotes the parent of node $i$. The root is the only node with no parent, so its parent value is $-1$.

You are also given an array $value$, where $value[i]$ denotes the value assigned to node $i$.

A node $v$ is an  **ancestor**  of node $u$ if $v$ lies on the path from the root to $u$. A node is not considered an ancestor of itself.

Find the maximum absolute difference between the values of two distinct nodes such that one node is an ancestor of the other.

In other words, find the maximum value of:

$$ |value[u]-value[v]| $$

over all pairs of distinct nodes $u$ and $v$ such that $v$ is an ancestor of $u$.

### Input Format
- The first line contains an integer $N$ — the number of nodes in the tree.
- The second line contains $N$ space-separated integers representing the array $value$.
- The third line contains $N$ space-separated integers representing the array $parent$.
### Output Format

Print a single integer — the maximum absolute difference between the values of two nodes such that one node is an ancestor of the other.

### Constraints
- $2 \le N \le 10^5$
- $-10^8 \le value[i] \le 10^8$
- Exactly one node has $parent[i]=-1$, representing the root.
- For every other node, $1 \le parent[i] \le N$.
- The given parent relationships form a valid rooted tree.
### Sample 1:
Input
Output

```
7
8 3 15 6 20 11 1
-1 1 1 2 2 3 6
```

```
14
```

### Explanation:

The given rooted tree is:

```
   1
   / \
  2   3
 / \   \
4   5   6
         \
          7

```

Node $3$ is an ancestor of node $7$.

Their values are $15$ and $1$, so the absolute difference is:

$$ |15-1|=14 $$

Therefore, the maximum possible difference is $14$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T15:10:34.343Z  

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

[View on CodeChef](https://www.codechef.com/problems/MDIT)