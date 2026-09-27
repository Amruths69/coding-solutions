# Print GFG n times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive number  **n**, print the string " **GFG** " exactly n times separated by a single space.

 **Examples:** 

```
Input: n = 5
Output:
GFG GFG GFG GFG GFG
```

```
Input: 3
Output:
GFG GFG GFG
```

 **Constraint:** 
1 ≤ n ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T00:51:52.041Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i=1;i<=n;i++){
            System.out.print("GFG"+" ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1)