# Are LinkedLists Equal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a two integer linkedLists  **ll1** and  **ll2**, you need to find if both the LinkedLists contain the same elements in the same order or not. 

 **Examples:** 

```
Input: ll1[] = [1, 2, 3, 4], ll2[] = [4, 3, 2, 1]
Output: false
Explanation: Both arrays are not same as they don't contain elements in the same order. So we print false.
```

```
Input: ll1[] = [5, 6, 7, 8, 9], ll2[] = [5, 6, 7, 8, 9]
Output: true
Explanation: Both arrays are same as they contain the same elements and in same order. So we print true.
```

 **Constraints:** 
1 <=  ll1.size(), ll2.size()  <= 106
1 <= ll1[i], ll2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T00:14:36.835Z  

```java
class Solution {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        // Your code here
        int l1=0;
        int l2=0;
        if(ll1.size()!=ll2.size()){
            return false;
        }
        for(int i=0;i<ll1.size();i++){
            if(ll1.get(i)==ll2.get(i)){
                l1++;
            l2++;
                continue;
            }else{
                return false;
            }
            
        }
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/are-linkedlists-equal/1)