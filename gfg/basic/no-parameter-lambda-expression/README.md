# No Parameter Lambda Expression

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You need to use lambda expression to print "Hello".
You need to complete the function  **helperFunction** that does not take any  **argument**. This function expects an object of Hello as a return  **type**. Hello is an interface that has the member function sayHello. Your  **helperFunction**  uses  **lambda expression**  to implement the  **sayHello** within  **helperFunction** itself. Then you  **return** the object. The  **driver code** will call the sayHello method using the returned object.

 **Lambda Expression :- https://www.geeksforgeeks.org/lambda-expressions-java-8/** 

 **Example:** 

```
Input: No Input
Output: Hello

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:07:26.267Z  

```java
class Solution {
    public static Hello helperFunction() {
        // Your code here
        return() -> System.out.println("Hello");
       

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/no-parameter-lambda-expression/1)