# NECK

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bead Necklaces

An artist has a chain of $N$ colored beads. The color of the $i$-th bead is represented by an integer $A_i$.

She wants to cut the chain into smaller pieces to make  **symmetric**  bracelets. A bracelet is symmetric (a  **palindrome**) if the sequence of bead colors reads the same from left to right as it does from right to left.

The artist wants to partition the original chain of beads into the  **minimum**  number of symmetric  **contiguous**  pieces.

Find the  **minimum**  number of symmetric pieces the artist can make.

### Input Format
- The first line contains a single integer $N$.
- The second line contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ — the colors of the beads.
### Output Format

Print a single integer representing the minimum number of symmetric pieces.

### Constraints
- $1 \le N \le 1000$
- $1 \le A_i \le 10^8$
### Sample 1:
Input
Output

```
6
10 20 20 10 30 30
```

```
2
```

### Explanation:

The bead colors are 10, 20, 20, 10, 30, 30. The optimal way is to cut the chain into 2 symmetric pieces:

- First piece: [10, 20, 20, 10] (Symmetric)
- Second piece: [30, 30] (Symmetric) It is not possible to cut this chain into fewer than 2 symmetric pieces.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-13T16:28:55.329Z  

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

[View on CodeChef](https://www.codechef.com/problems/NECK)