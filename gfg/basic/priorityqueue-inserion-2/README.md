# Operations on Max Priority Queue

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement a class maxPriorityQueue that supports the following operations:

- void push(int x): Insert an element x into the priority queue.
- int pop(): Remove the largest element from the priority queue and return. If the queue is empty, return -1. 
- int peek(): Return the largest element in the priority queue. If the queue is empty, return -1. 
- bool isEmpty(): Return true if the priority queue is empty, otherwise false.
- int size(): Return the number of elements currently in the priority queue.

There will be a sequence of q queries, queries[][]. The queries are represented in numeric form:

- 1 x - Call push(x).
- 2 - Call pop().
- 3 - Call peek().
- 4 - Call isEmpty().
- 5 - Call size().

The driver code will process the queries, call the corresponding functions, and print the outputs of pop(), peek(), isEmpty(), and size() operations. You only need to implement the above five functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [1, 4], [1, 7], [3], [2], [3], [4], [5]]
Output: [10, 10, 7, false, 2]
Explanation: Operations on the priority queue will process as follows:
push(10), insert 10 into the priority queue.
push(4), insert 4 into the priority queue.
push(7), insert 7 into the priority queue.
peek(), return 10, the largest element in the priority queue.
pop(), remove 10 from the priority queue and return it.
peek(), return 7, the largest element remaining.
isEmpty(), priority queue is non-empty; i.e. return false.
size(), priority queue currently contains two elements, return 2.
```

```
Input: queries[][] = [[3], [1, 20], [4], [5], [1, 8], [1, 12], [2], [3]]
Output: [-1, false, 1, 20, 12]
Explanation: Operations on the priority queue will process as follows:
peek(), return -1, the priority queue is empty. 
push(20), insert 20 into the priority queue.
isEmpty(), priority queue is non-empty; i.e. return false.
size(), priority queue currently contains one element, return 1.
push(8), insert 8 into the priority queue.
push(12), insert 12 into the priority queue.
pop(), remove 20, the largest element from the priority queue and return it.
peek(), return 12, the largest element remaining.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T00:10:39.989Z  

```java
import java.util.Collections;
class maxPriorityQueue {
    // Initialize your priority queue
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

    public void push(int x) {
        // Insert x into the priority queue
        pq.offer(x);
        
    }

    public int pop() {
        // Remove and return the smallest element
        if(!pq.isEmpty()){
        return pq.poll();}
        return -1;
        
    }

    public int peek() {
        // Return the smallest element, or -1 if empty
        if(!pq.isEmpty()){
        return pq.peek();}else{
            return -1;}
        }
        
    

    public boolean isEmpty() {
        // Check whether the priority queue is empty
        return pq.isEmpty();
    }

    public int size() {
        // Return the size of the priority queue
        return pq.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/priorityqueue-inserion-2/1)