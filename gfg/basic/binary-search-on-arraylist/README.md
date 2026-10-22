# Binary Search on ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted integer arrayList and an integer element  **k**. The task is to check if the element is present in the arrayList or not and return the index. 

 **Examples :** 

```
Input: list[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: Since, 6 is present in the list at index 4 (0-based indexing), so output is 4.

```

```
Input: list[] = [1, 3, 4, 5, 6], k = 2
Output: -1
Explanation: Since, 2 is not present in the list, so output is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T00:07:46.615Z  

```java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int l=0;
        int r=list.size()-1;
        while(l<=r){
            int m=(r-l)/2+l;
            if(list.get(m)==k){
                return m;
            }else if(list.get(m)>k){
                r=m-1;
            }else{
                l=m+1;
            }
            
        }
        return -1;

        // If k in arr return 1, else return -1
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-search-on-arraylist/1)