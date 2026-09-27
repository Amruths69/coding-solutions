# Bitwise Operators

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three positive integers  **a**,  **b**  and  **c**. Perform some bitwise operations on them as given below:
 **1.**  d = a ^ a
 **2.** e = c ^ b
 **3.**  f = a & b
 **4.**  g = ~ e
 **Note: ^** is for xor.
Then print d e f g space seperately. Move the cursor to the next line after printing.

 **Examples:** 

```
Input: a = 1, b = 2, c = 3
Output: 0 1 0 -2
Explanation: We print d e f g after performing the given operations.
```

```
Input: a = 4, b = 5, c = 6
Output: 0 3 4 -4
Explanation: We print d e f g after performing the given operations.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T10:20:41.824Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // code here
        int d=a^a;
        int e=c^b;
        int f=a&b;
        int g=~e;

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bitwise-operators-1597314674--135255/1)