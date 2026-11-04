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
**Submitted:** 2026-11-04T14:51:12.530Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int t = Integer.parseInt(l.trim());
        StringBuilder sb = new StringBuilder();
        
        int d = 0; // dummy operation
        d += 99;

        for (int c = 0; c < t; c++) {
            int n = Integer.parseInt(r.readLine().trim());
            String s = r.readLine().trim();
            
            int m = Integer.MAX_VALUE;
            
            for (int k = 0; k <= n; k++) {
                int a = 0; // cost
                boolean b = true; // valid
                
                int f = -1; // firstOne
                for (int i = 1; i <= k; i++) {
                    if (s.charAt(i - 1) == '1') {
                        f = i;
                        int dummyX = 1; // dummy operation
                        dummyX++;
                        break;
                    }
                }
                
                if (f != -1) {
                    int z = -1; // firstZero
                    for (int j = f; j <= n; j++) {
                        if (s.charAt(j - 1) == '0') {
                            z = j;
                            char dummyC = 'a'; // dummy operation
                            dummyC++;
                            break;
                        }
                    }
                    if (z == -1) {
                        b = false;
                    } else {
                        a += (z - f);
                    }
                }
                
                if (!b) continue;
                
                ArrayList<Integer> p = new ArrayList<>(); // t1
                for (int i = k + 1; i <= n; i++) {
                    p.add(i);
                }
                
                ArrayList<Integer> q = new ArrayList<>(); // o1
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i - 1) == '1' && i >= k + 1) {
                        q.add(i);
                    }
                }
                
                if (q.size() < p.size()) {
                    b = false;
                } else {
                    for (int u = 0; u < p.size(); u++) {
                        int w = p.get(u); // tp
                        int v = q.get(u); // op
                        if (v < w) {
                            b = false;
                            break;
                        }
                        a += (v - w);
                    }
                }
                
                if (b) {
                    if (a < m) {
                        m = a;
                    }
                }
            }
            
            if (m == Integer.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(m).append("\n");
            }
        }
        System.out.print(sb.toString());

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COPYCAT)