# Pass by Reference and Value

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integers **a**  and  **b**, add 1 to  **a**  and 2 to  **b**. The parameter a is passed by value, while  **b**  is passed by reference. Return the resulting values as an array of two integers.

 **Examples:** 

```
Input: a = 1, b = 2
Output: [2, 4]
Explanation: 1 was passed by value whereas 2 passed by reference.
```

```
Input: a = 10, b = 20
Output: [2, 4] 
Explanation: 10 is increased by 1, and 20 is increased by 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T22:56:12.682Z  

```java
class Solution {
    static int[] passedBy(int a, int b) {
        // code here
        int[] ans=new int[2];
        ans[0]=a+1;
        ans[1]=b+2;
        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pass-by-reference-and-value/1)