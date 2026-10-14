# Input Boolean Value

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Take a boolean value  **a**  as an input. The program should display its numeric representation:

- 1 for "true"
- 0 for "false"

 **Examples:**  

```
Input: a = true
Output: 1
```

```
Input: a = false
Output: 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T00:05:26.149Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a;

        // code here
        a=sc.nextBoolean();

        // Printing numeric representation
        System.out.print(a ? 1 : 0);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/input-boolean-value/1)