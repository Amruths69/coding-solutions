# Java Inheritance

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

Consider the following class  **cls1** :
class cls1
{
    void add(int p,int q){
        System.out.println(p+q);
    }
}

There is another class  **cls2**  which extends class cls1:
class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
}

So we can make object of a class cls2, which can use both  **mul**  and  **add**  methods. Main function is already created in the editor and instance of cls2 is also made. So the task is to add a method in class cls2 naming  **task()**  which will take 2 parameters as input i.e.  **a**  and  **b**  and print the sum of their squares i.e a2+b2. Changes in the main function has been made already.

 **Input:** 
The input line contains  **T**, denotes the number of testcase. Each testcase contains one line containing  **a**  and  **b**  separated by space.

 **Output:** 
For each testcase in new line, print the required answer.

 **Constraints:** 
1 <= T <= 100
1 <= a, b <= 103

**Example:
Input:**
1
2 4

 **Output:** 
6
8
20

 **Explanation:** 
 **Testcase 1:**  Output contains 3 lines:
In 1st line sum of two numbers is printed from the method add().
In 2nd line multiplication of two nos is printed from the method mul().
In 3rd line sum of the sqaures of the two nos is printed using your created method task().

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:13:28.171Z  

```java
class cls2 extends cls1 {
    void mul(int p, int q) { System.out.println(p * q); }

    void task(int p, int q) {
        System.out.println(p*p+q*q);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-inheritance/1)