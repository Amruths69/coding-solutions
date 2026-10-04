# Array Subset

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays  **a[]** and  **b[]**, your task is to determine whether  **b[]**  is a subset of  **a[]**.

 **Examples:** 

```
Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]
```

```
Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: false
Explanation: b[] is not a subset of a[]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T00:32:29.757Z  

```java

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        if(a.length<b.length){
            return false;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:b){
            if(!hm.containsKey(i) || hm.get(i)==0){
                return false;
            }
            hm.put(i,hm.get(i)-1);
            
        }
        
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1)