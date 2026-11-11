# Union of 2 Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two sorted arrays  **a[]**  and  **b[]**, where each array may contain duplicate elements, the task is to return the elements in the union of the two arrays in sorted order. Union of two arrays can be defined as the set containing distinct elements that are present in either of the arrays.

 **Examples:** 

```
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
```

```
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
```

```
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T15:05:33.200Z  

```java
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer>ts=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ts.add(b[i]);
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:ts){
            al.add(i);
        }
        return al;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1)