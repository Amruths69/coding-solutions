# Deque Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Implement a class  **MyDeque**  that supports following operations:

- addFront(x): Insert an element x at the front of the deque.
- addBack(x): Insert an element x at the back of the deque.
- removeFront(): Remove the element from the front of the deque and return. If the deque is empty, return -1.
- removeBack(): Remove the element from the back of the deque and return. If the deque is empty, return -1.
- elementAtFront(): Return the element at the front of the deque. If the deque is empty, return -1.
- elementAtBack(): Return the element at the back of the deque. If the deque is empty, return -1.
- isEmpty(): Return true if the deque is empty, otherwise false.
- size(): Return the total number of elements present in the deque.

There will be a sequence of q  **queries[][]**. The queries are represented in numeric form:

- 1 x - Call addFront(x)
- 2 x - Call addBack(x)
- 3 - Call removeFront()
- 4 - Call removeBack()
- 5 - Call elementAtFront()
- 6 - Call elementAtBack()
- 7 - Call isEmpty()
- 8 - Call size()

The driver code will process the queries, call the corresponding functions, and print the outputs of removeFront(), removeBack(), elementAtFront(), elementAtBack(), isEmpty(), size() operations. You only need to implement the above eight functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [2, 20], [1, 5], [5], [6], [8], [3], [5], [4], [6], [7]]
Output: [5, 20, 3, 5, 10, 20, 10, false]
Explanation: Operations on deque will process as follows:
addFront(10) in the deque. dq = [10]
addBack(20) in the deque. dq = [10, 20]
addFront(5) in the deque. dq = [5, 10, 20]
elementAtFront(), return 5.
elementAtBack(), return 20.
size(), return 3.
removeFront(), removes 5 and returns 5. dq = [10, 20]
elementAtFront(), return 10.
removeBack(), removes 20 and returns 20. dq = [10]
elementAtBack(), return 10.
isEmpty(), deque is non-empty; i.e. return false.
```

```
Input: queries[][] = [[7], [3], [2, 100], [6], [4], [7], [8]]
Output: [true, -1, 100, 100, true, 0]
Explanation: Operations on deque will process as follows:
isEmpty(), deque is empty; i.e. return true.
removeFront(), deque is empty; i.e. return -1.
addBack(100) in the deque. dq = [100]
elementAtBack(), return 100.
removeBack(), removes 100 and returns 100. dq = []
isEmpty(), deque is empty; i.e. return true.
size(), deque contains zero elements, return 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T01:01:31.712Z  

```java
class MyDeque {
    Deque<Integer>dq=new ArrayDeque<>();
    public MyDeque() {
        // Initialize your data structure here
        
    }

    public void addFront(int x) {
        dq.addFirst(x);
        // code here
        
    }

    public void addBack(int x) {
        // code here
        dq.addLast(x);
    }

        
    public int removeFront() {
        // code here
        return dq.isEmpty()?-1:dq.removeFirst();
    }
        

    public int removeBack() {
        return dq.isEmpty()?-1:dq.removeLast();
        // code here
        
    }

    public int elementAtFront() {
        // code here
        return dq.isEmpty()? -1:dq.peekFirst();
    }

        
    public int elementAtBack() {
        // code here
        return dq.isEmpty()?-1:dq.peekLast();
    }
        

    public boolean isEmpty() {
        // code here
        return dq.isEmpty();
    }

    public int size() {
        // code here
        return dq.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/deque-implementations/1)