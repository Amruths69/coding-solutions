# Learn to Comment

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three lines that print the values of  **a**,  **b**, and  **c.**   **Comment**  out the line that prints the value of b.

Comments are useful in any programming language to describe the purpose of functions or operations. They are ignored by the compiler, so they do not affect the execution of the code.

 **Examples:**  

```
Input: a = 5, b = 6, c = 15
Output:
5
15
```

```
Input:a = 6, b = 8, c = 10
Output:
6
10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T15:08:02.326Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Prints a
        System.out.println(a);

        // This line prints b bruhh
       //System.out.println(b);

        // Prints c
        System.out.println(c);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/learn-to-comment/1)