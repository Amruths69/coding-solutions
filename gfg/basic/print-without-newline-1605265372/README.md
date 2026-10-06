# Print Without Newline

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given two  **string**  variables  **a**  and  **b**, and you have to print a and b with a space between them. However, you must  **prevent**  the print statement from providing a  **new line**  as the new line will be given by the main driver code.

 **Examples:** 

```
Input: a = "Hello", b = "World"
Output: "Hello World"
Explanation: a and b are printed in a single line and a space separates them.The new line is provided by the driver code.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T23:42:21.341Z  

```java
class Solution {
    public void utility(Scanner sc) {
        // code here
        System.out.print(sc.next()+" ");
        System.out.print(sc.next());
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-without-newline-1605265372/1)