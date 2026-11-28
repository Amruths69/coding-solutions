# Solid Rectangle

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two integers  **n**  and  **m**, print a solid rectangle pattern of n rows and m columns using the "  *" character.

 **Examples:** 

```
Input: n = 3, m = 5
Output:
 **   **  *
 **   **  *
 **   **  *
Explanation: A solid rectangle with 3 rows and 5 columns.
```

```
Input: n = 4, m = 2
Output:
 ** 
 ** 
 ** 
 ** 
Explanation: A solid rectangle with 4 rows and 2 columns.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T14:02:04.377Z  

```java
class Solution {
    public void printSolidRectangle(int n, int m) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/solid-rectangle/1)