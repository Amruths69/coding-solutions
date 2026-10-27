# Remove Duplicates from Unsorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements. Your result should have elements according their first appearance in the input array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurrence.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T00:08:03.332Z  

```java
class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            lhs.add(arr[i]);
        }
        ArrayList<Integer>al=new ArrayList<>(lhs);
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/1)