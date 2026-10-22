# Fill Method

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]** and an integer  **k**. Fill arr with integer k.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], k = 67
Output: [67, 67, 67, 67, 67]
Explanation: k is 67, so we fill arr with 67.

```

```
Input: arr[] = [7], k = 99
Output: [99]
Explanation: k is 99, so we fill arr with 99.
```

 **Constraints:** 
1 ≤ arr.length ≤ 103
0 ≤ k, arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T00:21:56.141Z  

```java

class Solution {
    public static void fillArray(int arr[], int k) {
        // code here
        for(int i=0;i<arr.length;i++){
            arr[i]=k;
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fill-method/1)