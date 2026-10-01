# TypeCast And Double It

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an input  **num** as a string. You need to  **typecast** into an integer and  **double** it. 

 **Examples:** 

```
Input: num = "5"
Output: 10
Explanation: Typecast "5" to int and then double it 5 * 2 = 10
```

```
Input: num = "12"
Output: 24
Explanation: Typecast "12" to int and then double it 12 * 2 = 24
```

**Constraints:
**0 <= num <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:24:25.351Z  

```java
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int g=Integer.valueOf(num);
        System.out.println(g*2);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/typecast-and-double-it--153103/1)