# First Occurrence in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  and an integer  **k**, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return  **-1**. 

 **Note:**  If multiple occurrences are there, please return the smallest index.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
```

```
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.

```

```
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T01:13:11.034Z  

```java
class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int l=0;
        int r=arr.length-1;
        int a=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==k){
                a=m;
                r=m-1;
            }else if(arr[m]<k){
                
                l=m+1;
                
            }else if(arr[m]>k){
                r=m-1;
            }
            
        }
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1)