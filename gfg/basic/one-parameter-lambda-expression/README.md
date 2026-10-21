# One Parameter Lambda Expression

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You need to use lambda expression to multiply a given number n by 5.
You need to complete the function  **helperFunction** that does not take any  **argument**. This function expects an object of Multiply as a return  **type**. Multiply is an interface that has the member function multiplyBy5. Your  **helperFunction**  uses  **lambda expression**  to implement the  **multiplyBy5** within  **helperFunction** itself. Then you  **return** the object. The  **driver code** will call the multiplyBy5 method and print the result using it.

 **Examples:** 

```
Input: 5
Output: 25
Explanation: 5 * 5 = 25
```

```
Input: 6
Output: 30
Explanation: 6 * 5 = 30
```

 **Constraints:** 
1 <= n <= 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:10:48.369Z  

```java
/*
The interface looks like

interface Multiply {
    public int multiplyBy5(int n);
}
*/

class Solution {

    public static Multiply helperFunction() {
        // Your code here
        return(n)->n*5;

        // Implement the multiplyBy5(int n) method using lambda expression. The
        // implemented function should return n*5
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/one-parameter-lambda-expression/1)