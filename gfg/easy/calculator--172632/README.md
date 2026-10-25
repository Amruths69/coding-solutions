# Calculator

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two numbers  **a**  and  **b**. You need to perform basic mathematical operations on them. You will be provided an integer named as  **optr.** 

- If the operator equals to 1 add a and b, then print the result.
- If the operator equals to 2 subtract b from a, then print the result.
- If the operator equals to 3 multiply a and b, then print the result.
- If the operator equals to any other number, print "Invalid Input"(without quotes).

Note: Do not add a new line at the end.

 **Examples:** 

```
Input: a = 1, b = 2, optr = 3
Output: 2
Explanation: 1 * 2 = 2
```

```
Input: a = 2, b = 2, optr = 2
Output: 0
Explanation: 2 - 2 = 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:20:05.763Z  

```java
class Solution {
    public void calculate(int a, int b, int optr) {
        // code here
        switch(optr){
            case 1:
            System.out.print(a+b);
            break;
            case 2:
            System.out.print(b-a);
            break;
            case 3:
            System.out.print(b*a);
            break;
            default:
            System.out.print("Invalid Input");
            
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/calculator--172632/1)