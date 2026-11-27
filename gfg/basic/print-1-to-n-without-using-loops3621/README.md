# 1 to n Without Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an positive integer, print numbers from 1 to without using loops.

Implement the function `printTillN()` to print the numbers from 1 to as space-separated integers.

**Examples
**

```
Input: n = 5
Output: 1 2 3 4 5
Explanation: We have to print numbers from 1 to 5.
```

```
Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Explanation: We have to print numbers from 1 to 10.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T16:00:09.346Z  

```java
class Solution {
    public void printTillN(int n) {
        // code here
        print(1,n);
    }
    public void print(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        print(i+1,n);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1)