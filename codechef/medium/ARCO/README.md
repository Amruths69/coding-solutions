# ARCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array Compression

Chef has an array  **$A$**  of length  **$N$**.

He may repeatedly perform the following operation:

- Choose an index $i$ such that $A_i$ is equal to at least one of its adjacent elements, and remove $A_i$ from the array.

After each removal, the remaining elements become adjacent.

Determine the minimum possible length of the array that Chef can acheive.

### Input Format
- The first line contains a single integer $N$.
- The second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
### Output Format

Print a single integer — the minimum possible length of the array.

### Constraints
- $1 \le N \le 10^5$
- $1 \le A_i \le 10^6$
### Sample 1:
Input
Output

```
4
2 1 2 2
```

```
3
```

### Explanation:

Remove the last element. The remaining array is `[2, 1, 2]`, and no further operation can be performed.

### Sample 2:
Input
Output

```
5
1 2 2 2 1
```

```
3
```

### Explanation:

Remove one of the `2`s to obtain the array `[1, 2, 2, 1]`. Then remove one of the remaining `2`s to obtain `[1, 2, 1]`. No further operation can be performed, so the minimum possible length of the array is  **3**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-27T15:51:03.554Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ARCO)