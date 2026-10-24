# Java Interface

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Like a class, an interface can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body).  

Given an inteface in1 which includes a method display which takes an integer as input.

```
interface in1
{
    void display(int p);
}
```

Task is to write a class testClass which implements interface in1 and has a method named display which takes an integer as input and output total number of prime numbers between 2 and integer k (including it). Main function in written for you in the editor.

 **Input:** 
The first line will contain an integer  **T** (number of test cases). Each test case consists of an integer n.

 **Output:** 
Print total number of prime numbers between 2 and the given number (including them).

 **Constraints:** 
1 < =  **T**  < = 1000
2<= n <= 104

**Example:
Input:**
2
13
19

 **Output:** 
6
8

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T00:25:57.606Z  

```java
class testClass implements in1 {
    public void display(int k) {
        //daily-dump

        int n = 0;

        for (int i = 2; i <= k; i++) {
            int c = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    c++;

                    if (j != i / j) {
                        c++;
                    }
                }
            }

            if (c == 2) {
                n++;
            }
        }

        System.out.println(n);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-interface/1)