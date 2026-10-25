# ArrayList Iterate Front to Back

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Iterators are used to iterate over Java Collections. Here we will learn to iterate over an ArrayList  **arr** from begin to end.

 **Examples:** 

```
Input: 1 2 3 4 5
Output: 1 2 3 4 5
Explanation: Simply print the elements.

```

```
Input: 1 3 31 2 
Output: 1 3 31 2
Explanation: Simply print the elements.
```

 **Constraints:** 
1 <= n <= 107
0 <= arri <= 107

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:38:22.908Z  

```java
class Solution {

    public static void iterateArrayList(Iterator iterator) {
        // Your code here
        
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        

        // Just print the elements, don't provide new line
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/arraylist-iterate-front-to-back/1)