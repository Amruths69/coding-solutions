# Implement Stack using Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement a Stack using an Array, where the size of the array,  **n**  is given.
The Stack must support the following operations:

 **(i) push(x):**  Insert an element x at the top of the stack.
 **(ii) pop():**  Remove the element from the top of the stack.
 **(iii) peek():**  Return the top element if not empty, else -1.
 **(iv) isEmpty():**  Return true if the stack is empty else return false.
 **(v) isFull():**  Return true if the stack is full else return false.

There will be a sequence of queries  **queries[][]**. The queries are represented in numeric form:

- 1 x : Call push(x)
- 2 : Call pop()
- 3 : Call peek()
- 4  : Call isEmpty()
- 5 : Call isFull()

You just have to implement the functions  **push, pop, peek, isEmpty,** and  **isFull.**  The driver code will handle the output.

 **Note:**  All the queries are valid.

 **Examples:** 

```
Input: n = 3, q = 6, queries[][] = [[1, 5], [1, 3], [3], [2], [4], [5]]
Output: [3, false, false]
Explanation: Queries on stack are as follows:
push(5) : Insert 5 at the top of the stack.
push(3) : Insert 3 at the top of the stack.
peek() : Return the top element i.e. 3.
pop() : Remove the top element i.e. 3.
isEmpty() : return false as the stack is not empty.
isFull() : return false as the stack is not full. Capacity = 3.
```

```
Input: n = 1, q = 5, queries[][] =  [[2], [3], [4], [1, 9], [5]]
Output: [-1, -1, true, true]
Explanation: Queries on stack are as follows:
pop(): Since stack is empty, nothing is popped.
peek(): Return the top element. Since the stack is empty, return -1.
isEmpty(): Return true as the stack is empty.
push(9): Insert 9 at the top of the stack. The stack will be [9].
isFull(): Return true as the stack is full. Capacity = 1.
```

 **Constraints:** 
1 ≤ n ≤ 103
1 ≤ q ≤ 103
0 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T14:09:14.240Z  

```java
class myStack {
    int[] arr;
    int t;

    public myStack(int n) {
        arr=new int[n];
        t=-1;
            
    }
    

    public boolean isEmpty() {
        
        return t==-1;
        
        
    }

    public boolean isFull() {
        return t==arr.length-1;
    }

    public void push(int x) {
        t++;
        arr[t]=x;
        
    }

    public void pop() {
        
        if(t!=-1){
        t--;}
    }

    public int peek() {
        if(t==-1){
            return -1;
        }
        return arr[t];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1)