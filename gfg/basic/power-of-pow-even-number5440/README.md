# Sum of n Even Squares

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a single integer  **n**, your task is to find the sum of the square of the first n even natural Numbers. 

 **Examples:** 

```
Input: n = 2
Output: 20
Explanation: 22 + 42 = 20

```

```
Input: n = 3
Output: 56
Explanation: 22 + 42 + 62 = 56 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T15:35:05.670Z  

```java
class Solution {
    public int sumSqEven(int n) {
        // code here
        int a=0;
        
        for(int i=0;i<=n*2;i+=2){
            if(i%2==0){
                a+=i*i;
            }
        }
        return a;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-pow-even-number5440/1)