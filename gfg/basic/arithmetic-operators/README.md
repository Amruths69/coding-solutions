# Arithmetic Operators

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integer variables x and y, perform the following operations:

- p: Addition of x and y
- q: Subtraction of y from x
- r: Multiplication of x and y
- s: Floating-point division of x by y
- t: Integer division of x by y
- u: Modulo (remainder when x is divided by y)

 **Examples:** 

```
Input: x = 1, y = 2
Output: 3 -1 2 0.500 0 1
Explanation: The given operations are performed:
Addition of x and y = 3
Subtraction of y from x = -1
Multiplication of x and y = 2
Floating-point division of x by y = 0.500
Integer division of x by y = 0
Modulo of x and y = 1
Hence, the output is 3 -1 2 0.500 0 1.

```

```
Input: x = 3, y = 4 
Output: 7 -1 12 0.750 0 3
Explanation: The given operations are performed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T15:15:53.296Z  

```java
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int p=x+y;
        int q=x-y;
        int r=x*y;
        double s=(double)x/y;
        int t=x/y;
        int u=x%y;
        

        System.out.printf("%d %d %d %.3f %d %d", p, q, r, s, t, u);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/arithmetic-operators/1)