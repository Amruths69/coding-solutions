# Max and Min Product from 2 Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.

 **Examples :** 

```
Input : arr1[] = [5, 7, 9, 3, 6, 2],  arr2[] = [1, 2, 6, 1, 9]
Output : 9
Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.

```

```
Input : arr1[] = [0, 0, 0, 0],  arr2[] = [1, 1, 2]
Output : 0

```

 **Constraints:** 
1 ≤ arr1.size(), arr2.size() ≤ 106
0 ≤ arr1[i], arr2[i] ≤ 108

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T00:19:07.972Z  

```java

class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int g=arr1[0];
        int h=arr2[0];
        for(int i=1;i<arr1.length;i++){
            if(g<arr1[i]){
                g=arr1[i];
            }
        }
        for(int i=1;i<arr2.length;i++){
            if(h>arr2[i]){
                h=arr2[i];
                
            }
        }
        return h*g;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/1)