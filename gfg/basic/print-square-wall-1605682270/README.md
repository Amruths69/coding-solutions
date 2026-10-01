# Print Solid Square

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, print a solid square pattern of size n × n using "  * " (a star followed by exactly one space).

 **Examples:** 

```
Input: n = 5
Output:
 **   **  *
 **   **  *
 **   **  *
 **   **  *
 **   **  *
Explanation: A solid square of size 5 × 5, with each row containing 5 stars followed by a single space.
```

```
Input:  n = 4
Output:
 **   **  
 **   **  
 **   **  
 **   **  
Explanation: A solid square of size 4 × 4, with each row containing 4 stars followed by a single space.

```

**Constraints:
**1 ≤ n ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:03:53.337Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-square-wall-1605682270/1)