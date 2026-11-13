# Sort 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing only 0s, 1s, and 2s **.**  Sort the array in ascending order. 

 **Examples:** 

```
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

```
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T00:54:49.044Z  

```java
class Solution {
    public void sort012(int[] arr) {
        // code here
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                
                c0++;
            }
        }
          for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                
                c1++;
            }
        }
          for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                
                c2++;
            }
        }
        int t=0;
        for(int i=0;i<c0;i++){
            arr[t]=0;
            t++;
        }
        for(int i=0;i<c1;i++){
            arr[t]=1;
            t++;
        }
        for(int i=0;i<c2;i++){
            arr[t]=2;
            t++;
        }
              

        
    
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)