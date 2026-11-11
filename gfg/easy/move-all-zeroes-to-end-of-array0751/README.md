# Move All Zeroes to End

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]** of non-negative integers, move all the zeros to the end of the array while maintaining the relative order of the non-zero elements. Perform the operation in place, without using an extra array.

 **Examples:** 

```
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: The three zeros are moved to the end while the order of the non-zero elements remains unchanged.

```

```
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

```

```
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:59:32.372Z  

```java
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int t=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[t]=arr[i];
                t++;
            }
        }
        for(int i=t;i<arr.length;i++){
            arr[i]=0;
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1)