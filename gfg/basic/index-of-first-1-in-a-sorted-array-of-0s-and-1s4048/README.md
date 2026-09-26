# First 1 in a Sorted Binary Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted array  **arr**  consisting of  **0** s and  **1** s. The task is to find the index (0-based indexing) of the first  **1**  in the given array.

 **NOTE:** If one is not present then, return -1.

 **Examples :** 

```
Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
Output : 6
Explanation: The index of first 1 in the array is 6.

```

```
Input : arr[] = [0, 0, 0, 0]
Output : -1
Explanation: 1's are not present in the array.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T14:06:02.389Z  

```java
class Solution {
    public int firstIndex(int arr[]) {
        int l=0;
        int r=arr.length-1;
        int t=1;
        int a=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(t==arr[m]){
                r=m-1;
                a=m;
                
                
            }else{
                l=m+1;
            }           
        }
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s4048/1)