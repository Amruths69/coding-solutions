# Multiplication Table

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, print the multiplication table from 1 to 10 for n in a single line, separated by spaces.

 **Examples:** 

```
Input: n = 9
Output: 9 18 27 36 45 54 63 72 81 90
```

```
Input: n = 2
Output: 2 4 6 8 10 12 14 16 18 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T15:27:26.999Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i=1;i<=10;i++){
            System.out.print(i*n+" ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/multiplication-table/1)