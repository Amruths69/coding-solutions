# Odd or Even

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n**, find if it is odd or even. Return true if the number is even else false.

 **Examples:** 

```
Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.
```

```
Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T15:28:17.982Z  

```java
class Solution {
    static boolean isEven(int n) {
        // code here
        if(n%2==0)return true;
        else return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/odd-or-even3618/1)