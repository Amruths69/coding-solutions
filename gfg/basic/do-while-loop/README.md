# Do While Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**. Print string  **"** Geeksforgeeks **"** n times but a minimum of 1 time using a  **do-while**  loop. Note: n can be less than 0.

 **Examples:** 

```
Input: 3
Output: 
Geeksforgeeks
Geeksforgeeks
Geeksforgeeks
Explanation: Printed "Geeksforgeeks" 3 times.
```

```
Input: -1
Output: 
Geeksforgeeks
Explanation: Printed "Geeksforgeeks" 1 times compulsory.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T15:03:55.133Z  

```java
class Solution {
    public void printGeeks(int n) {
        // Code here
        n=n-1;
        do{
            System.out.println("Geeksforgeeks");
        }while(n-->0);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/do-while-loop/1)