# Union of Arrays with Duplicates

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two arrays  **a[]**  and  **b[]**, return the union of both the arrays in any order. 

- Elements of a[] and b[] are not necessarily distinct, but output should have only distinct elements.
- The returned union may have elements in any order, the driver code will print the result in sorted order only.

 **Examples:** 

```
Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.

```

```
Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 
Output: [1, 2, 3, 4, 5, 6]
Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.
```

```
Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
Output: [1, 2]
Explanation: Union set of both the arrays will be 1 and 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T16:12:30.863Z  

```java
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer>hs1=new HashSet<>();
        for(int i:a){
            hs1.add(i);
        }
        for(int i:b){
            hs1.add(i);
        }
        return new ArrayList<>(hs1);
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1)