# Multi Parameters Lambda Expression

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You need to use lambda expression to add two numbers  **a**  and  **b.** 
You need to complete the function  **helperFunction** that does not take any  **argument**. This function expects an object of Add as a return  **type**. Add is an interface that has the member function addParameters. Your  **helperFunction**  uses  **lambda expression**  to implement the  **addParameters** within  **helperFunction** itself. Then you  **return** the object. The  **driver code** will call the addParameters method and print the result using it.

 **Examples :**   

```
Input: a = 5, b = 7
Output: 12
Explanation: 5+7 = 12
```

```
Input: a = 1, b = 5
Output: 6
Explanation: 1+5 = 6

```

**Constraints:
**1 <= a, b <= 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:11:19.053Z  

```java
/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        return(a,b)->a+b;

        // Implement the addParameters method that returns a+b.
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/multi-parameters-lambda-expression/1)