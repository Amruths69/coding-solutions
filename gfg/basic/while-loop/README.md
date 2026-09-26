# While Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **x**, print the numbers from x to 0 in decreasing order in a single line.

 **Examples:** 

```
Input: x = 3
Output: 3 2 1 0
Explanation: Numbers in decreasing order from 3 are 3 2 1 0.
```

```
Input: x = 5
Output: 5 4 3 2 1 0
Explanation: Numbers in decreasing order from 5 are 5 4 3 2 1 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T00:28:22.029Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // code here
        while(x>=0){
            System.out.print(x+ " ");
            x--;
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/while-loop/1)