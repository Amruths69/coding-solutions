# Hollow Right Angle Triangle Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer **n**  **.** Write a program to print the Right angle triangle **.** The length of the perpendicular and base is** n.  
**

 **Examples :** 

```
Input: n = 9
Output:
*
 ** 
 ** 
 ** 
 ** 
 ** 
 ** 
 ** 
 **   **   **   **  * 
Explanation: Length of perpendicular and base of triangle is 9.
```

```
Input: n = 4
Output:
*
 ** 
 ** 
 **   ** 
Explanation: Length of perpendicular and base of triangle is 4.
```

 **Constraints:** 
1 ≤ n ≤ 12

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T00:51:02.372Z  

```java

class Solution {
    public void printPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || i == n || i == j) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/right-angle-triangle-2-1605689820--102106/1)