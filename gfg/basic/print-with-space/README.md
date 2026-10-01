# Print With Space

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings **a**  and  **b**, print them on the same line with a single space between them. Print a newline after the output.

 **Examples:** 

```
Input: a = "Hello", b = "World"
Output: Hello World
Explanation: a and b are printed in a single line and a space separates them.
```

```
Input: a = "Geeks", b = "for"
Output: Geeks for
Explanation: a and b are printed in a single line and a space separates them.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:39:57.113Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        // code here
        System.out.println(a+" "+b);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-with-space/1)