# Java Abstract keyword

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

***abstract** * is a non-access modifier in java applicable for classes, methods but  **not**  variables. It is used to achieve abstraction which is one of the pillar of Object Oriented Programming(OOP). Following is an example of abstract class.

```
abstract class A 
{
    int prod;
    abstract void m1(int p,int q);
    void m2()
    {
        System.out.println(prod);
    }
}
```

As we know, we can't create an instance of an abstract class. Hence create and another class that extends the abstract class, then you can create an instance of the new class.

Also m1 method is abstract too, that means you must implement the body of that method in the child class.

Main function is already created in the editor and instance of class B is also created. So your task is to write just class B. 

 **Input:** 
First line of input file contains an integer T, denoting the number of test cases. Then T test case follow. First and only line of each test case contains two integers a1 and a2.

 **Output:** 
For each test case, print output as the product of the two nos. a1 and a2.

 **Constraints:** 
1<=T<=100
1<=a1,a2<=103

 **Example:** 
 **Input:** 
2
9 2
8 4

 **Output:** 
18
32

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T00:24:01.194Z  

```java
class B extends A {
    void m1(int p, int q) {
        // Add your code here.
        prod=p*q;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-abstract-keyword/1)