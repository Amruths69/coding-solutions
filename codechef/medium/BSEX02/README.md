# BSEX02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Pyramid of Bricks

You are given $N$ bricks and want to construct a  **pyramid**. A pyramid is built in layers where the $i$-th layer (from the top) requires  **i**  bricks.

- The 1st layer requires $1$ brick.
- The 2nd layer requires $2$ bricks.
- The 3rd layer requires $3$ bricks.
- And so on.

For example, following is a pyramid of $4$ layers:
Your task is to determine the maximum number of  **complete layers**  you can build using the given $N$ bricks.

### Input Format
- The first line of the input contains the number of test cases, $T$.
- For each test case, a single integer, $N$, represents the number of bricks available.
### Output Format
- For each test case print a single integer representing the maximum number of complete layers you can build in new line.
### Constraints
- $1 \leq T \leq 50$
- $1 \leq N \leq 10^9$
### Sample 1:
Input
Output

```
2
8
15
```

```
3
5
```

### Explanation:
- Test Case 1: We can build 3 complete layers. Layer 1 requires 1 brick, Layer 2 requires 2 bricks, Layer 3 requires 3 bricks. Total bricks used = 1 + 2 + 3 = 6. The 4th layer requires 4 bricks, but only 2 are left. Therefore, the maximum number of complete layers is 3.
- Test Case 2: We can build 5 complete layers: Layer 1: Requires 1 brick, Layer 2 requires 2 bricks, Layer 3 requires 3 bricks, Layer 4 requires 4 bricks, Layer 5 requires 5 bricks Total bricks used = 1 + 2 + 3 + 4 + 5 = 15. All bricks are used, so the maximum number of complete layers is 5.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T14:39:26.599Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int t=a.nextInt();
        while(t-->0){
            int n=a.nextInt();
            int c=0;
            for(int i=1;i<=n;i++){
                if(n-i>=0){
                    n=n-i;
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX02)