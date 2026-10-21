# Distinct Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[],**  return all **distinct** elements of the array in sorted (non-decreasing) order.

 **Examples:** 

```
Input: arr[] = [3, 3, 2, 2, 1, 4]
Output: 1 2 3 4
Explanation: All distinct in sorted order.
```

```
Input: arr[] = [12, 23, 12, 23, 2]
Output: 2 12 23
Explanation: All distinct in sorted order.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T00:35:53.357Z  

```java
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        Collections.sort(al);
       for(int i = al.size() - 1; i > 0; i--) {
                   if(al.get(i).equals(al.get(i - 1))) {
                       al.remove(i);
                   }
               }

               return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distinct-sorted--124713/1)