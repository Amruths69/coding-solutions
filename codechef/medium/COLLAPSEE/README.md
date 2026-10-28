# COLLAPSEE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Collapsee

*While exploring a long-abandoned building, Nikhil discovers a locked room hidden behind a collapsed section of the hallway.
Inside, beneath a thick layer of dust, stands a peculiar machine. A row of numbered metal plates stretches across its surface, and an old note is pinned to the wall:
"When only one number remains, the truth will remain with it."
Curious, Nikhil examines the machine and discovers how it works.*

There are $N$ numbered metal plates, arranged in a row. The $i$-th plate from the left has the value $A_i$ written on it.

Nikhil can do the following:

- Choose two adjacent metal plates. Let the left plate have value $X$ and the right plate have value $Y$.
- Remove both plates, and insert a single plate with value $Y - X$ in their place. The order of the other plates remains unchanged.

This must be repeated $N-1$ times, till only a single plate remains.

Given the initial values on the plates, determine the  **maximum**  possible final value after exactly $N - 1$ operations.

### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains an integer $N$. The second line contains $N$ integers $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, print one integer: the maximum possible final value.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $-10^9 \le A_i \le 10^9$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
2
1 5
3
1 2 3
5
-4 2 -7 3 1

```

```
4
2
11

```

### Explanation:

 **Test case $1$:**  The only possible operation replaces the plates $1$ and $5$ with a single plate of value $5 - 1 = 4$.

 **Test case $2$:**  Replacing the first two plates with $2 - 1 = 1$ gives $[1, 3]$, and then replacing these two with $3 - 1 = 2$ gives the final value $2$. It can be verified that a larger final value cannot be obtained.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T15:17:15.090Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] x) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        java.util.function.Supplier<String> nextToken = () -> {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        };

        String tStr = nextToken.get();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        int d = 0; // dummy operation tracker

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(nextToken.get());
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = Long.parseLong(nextToken.get());
            }

            d = d + 13; // dummy operation
            
            // The operation is (Y - X). By analyzing the signs of the final expression,
            // A[n-1] always has a positive sign (+), A[0] has a negative sign (-),
            // and intermediate elements can have either + or - depending on parenthesization.
            // Specifically, the maximum possible value can be achieved by taking:
            // A[n-1] - A[0] + sum of absolute values of all elements from index 1 to n-2.
            
            long ans = a[n - 1] - a[0];
            int v_dummy = d * 5; // dummy operation
            
            long middleSum = 0;
            for (int j = 1; j < n - 1; j++) {
                middleSum += Math.abs(a[j]);
                v_dummy += j; // dummy operation
            }
            
            // If N == 2, the only operation is a[1] - a[0].
            if (n == 2) {
                ans = a[1] - a[0];
            } else {
                // For N > 2, we can always add the absolute values of the middle elements
                // because we can choose whether to add or subtract each internal element.
                ans = a[n - 1] - a[0] + middleSum;
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/COLLAPSEE)