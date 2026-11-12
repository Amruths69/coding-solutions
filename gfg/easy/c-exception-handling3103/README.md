# Exception Handling

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integers  **a**  and  **b**, perform each of the following arithmetic operations: addition (+), subtraction (-), multiplication (*), and floor division (/). Return the minimum value obtained from these operations as a.

- Do not consider division while finding minimum if b is 0.
- You must use exception handling to avoid division by 0.

 **Examples:** 

```
Input: a = 5, b = -5
Output: -25
Explanation:
5+(-5) = 0,
5-(-5) = 10,
5*(-5) = -25,
5/(-5) = -1.
Minimum of all is 5*(-5) = -25.
```

```
Input: a = 5, b = 0
Output: 0
Explanation:
5+0 = 5,
5-0 = 5,
5*0 = 0,
5/0 = Undefined (Creates Arithmetic Exception so we ignore this).
Minimum of all is 5*0 = 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T00:58:47.892Z  

```java
class Solution {
    public int findMin(int a, int b) {
        // code here
        int ad=a+b;
        int su=a-b;
        int m=a*b;
        int di=Integer.MAX_VALUE;
        
        try{
             di=a/b;
        }
        catch(ArithmeticException e ){
            
        }
        int[] arr=new int[4];
        arr[0]=ad;
        arr[1]=su;
        arr[2]=m;
        arr[3]=di;
        int g=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=g){
                g=arr[i];
            }
        }
        return g;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-exception-handling3103/1)