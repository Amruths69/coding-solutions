# Deque Deletion

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a Deque  **deq**  containing non-negative integers.

Complete below functions depending type of query as mentioned and provided to you (indexing starts from 0):
 **1**.  **eraseAt(x):**  this function should remove the element from specified position  **x**  in deque.
 **2**.  **eraseInRange(start, end):**  this function should remove the elements in range start (inclusive), end (exclusive) specified in the argument of the function. If start is equal to end then simply return.
 **3**.  **eraseAll():**  remove all the elements from the deque.

 **Examples:** 

```
Input: deq = [1 2 4 5 6], query = [1 2]
Output: 1 2 5 6 
Explanation: Here the query type is 1 and the position is 2. So we remove element at position 2. The element at position 2 is 1 2 4 5 6. So, we remove 4 and get 1 2 5 6.
```

```
Input: deq = [1 2 3 4], query = [2 1 3]
Output: 1 4 
Explanation: Here the query type is 2 and the range is [1, 3). So we need to delete 1 2 3 4. Remember that end is exclusive. So the updated dequeue is 1 4.
```

```
Input: deq = [1 2 3], query = [3]
Output: Empty
Explanation: Here the query is of type 3 so we remove all the elements of dequeue.
```

 **Constraints:** 
1 ≤ deq.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T01:15:13.351Z  

```java
class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
       Iterator<Integer>it=deq.iterator();
       int i=0;
       while(it.hasNext()){
           it.next();
           if(i==x){
               it.remove();
               break;
           }
           i++;
       }
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
        Iterator<Integer>it=deq.iterator();
       int i=0;
       while(it.hasNext()){
           it.next();
           if(i>=start && i<end){
               it.remove();
               
           }
           i++;
       }
        
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/deque-deletion/1)