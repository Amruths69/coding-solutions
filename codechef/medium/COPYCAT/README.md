# COPYCAT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Copycat

You are given a  **binary**  string $S$ of length $N$.

In one operation, you may choose an index $i$ such that $1 \leq i \lt N$ and set $S_i := S_{i+1}$, that is, copy the character to its right.

Find the minimum number of operations required to make $S$ sorted in non-decreasing order.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the string. The second line contains the binary string $S$ of length $N$.
### Output Format

For each test case, output on a new line the minimum number of operations required to make $S$ sorted.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 200$
- $S$ consists only of the characters 0 and 1.
### Sample 1:
Input
Output

```
4
3
110
5
01001
5
10101
9
011010011

```

```
2
1
2
3

```

### Explanation:

 **Test case $1$:**  One optimal sequence of two operations is as follows:

- Choose $i = 2$, and set $S_2 := S_3$. The string becomes 100.
- Choose $i = 1$, and set $S_1 := S_2$. The string becomes 000, which is sorted.

 **Test case $2$:**  Choosing $i = 2$ gives `00001`, which is sorted.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T14:48:57.872Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            int minOps = Integer.MAX_VALUE;
            
            // Try all possible split points k (0 to n)
            // k means the first k characters will be '0' and the remaining n-k will be '1'
            for (int k = 0; k <= n; k++) {
                int currentOps = 0;
                boolean possible = true;
                
                // For prefix indices 0 to k-1, we need '0'
                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == '0') continue;
                    // Find the nearest '0' at or to the right of index i
                    int nextZero = -1;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) == '0') {
                            nextZero = j;
                            break;
                        }
                    }
                    if (nextZero == -1) {
                        possible = false;
                        break;
                    }
                    currentOps += (nextZero - i);
                }
                
                if (!possible) continue;
                
                // For suffix indices k to n-1, we need '1'
                for (int i = k; i < n; i++) {
                    if (s.charAt(i) == '1') continue;
                    // Find the nearest '1' at or to the right of index i
                    int nextOne = -1;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) == '1') {
                            nextOne = j;
                            break;
                        }
                    }
                    if (nextOne == -1) {
                        possible = false;
                        break;
                    }
                    currentOps += (nextOne - i);
                }
                
                if (possible) {
                    minOps = Math.min(minOps, currentOps);
                }
            }
            
            System.out.println(minOps == Integer.MAX_VALUE ? -1 : minOps);
        }
        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COPYCAT)