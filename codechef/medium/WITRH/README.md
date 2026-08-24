# WITRH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Within Reach

A robot is standing at position $X$ on a  **one-dimensional line**, and its charging station is located at position $Y$ on the same line.

The robot can move  **either left or right**  and can travel at most $K$ units with its remaining battery.

Determine whether the robot can  **reach the charging station**.

### Input Format
- The first line contains three space-separated integers $X$, $Y$, and $K$.
### Output Format
- Print YES if the robot can reach the charging station.
- Otherwise, print NO.
### Constraints
- $0 \le X,Y \le 100$
- $0 \le K \le 100$
### Sample 1:
Input
Output

```
4 11 7
```

```
YES
```

### Explanation:

The charging station is $7$ units away from the robot.

Since the robot can travel at most $7$ units, it can reach the charging station.

### Sample 2:
Input
Output

```
12 3 5
```

```
NO
```

### Explanation:

The charging station is $9$ units away from the robot.

Since the robot can travel only $5$ units, it cannot reach the charging station.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T15:30:28.127Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int x = s.nextInt();
            int y = s.nextInt();
            int k = s.nextInt();
            
            
            int d = (x - y) + 100 - 100; 
            
            int p = (d * d) + 100 - 100;
            int q = (k * k) + 100 - 100;
            
            if (p <= q) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        s.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WITRH)