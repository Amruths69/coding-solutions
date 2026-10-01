# Concatenate Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers **a**  and  **b**, you need to concatenate them so the output is ab and print it.

 **Examples:** 

```
Input: a = 5, b = 6
Output: 56
Explanation: Concatenate them.
```

```
Input: a = 1, b = 9
Output: 19
Explanation: Concatenate them.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:42:06.613Z  

```java
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        
        String as=String.valueOf(a);
        String bs=String.valueOf(b);
        System.out.println(as+bs);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/concatenate-integers/1)