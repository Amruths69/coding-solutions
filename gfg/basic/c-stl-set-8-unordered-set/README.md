# Hash or Unordered Set Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement a class MySet that supports the following operations:

- insert(int x): Insert the element x into the set. If x is already present, the set remains unchanged.
- erase(int x): Remove the element x from the set if it exists. If x is not present, the set remains unchanged.
- size(): Return the number of distinct elements present in the set. If the set is empty, return 0.
- find(int x): Return 1 if the element x is present in the set; otherwise, return -1.

There will be a sequence of q queries represented by  **queries[][]**. Each query is represented in numeric form:

- 1 x - Call insert(x).
- 2 x - Call erase(x).
- 3 - Call size().
- 4 x - Call find(x).

The driver code will process the queries, call the corresponding functions, and print the outputs of size() and find() operations. You only need to implement the above four functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [1, 20], [1, 10], [3], [4, 20], [4, 30], [2, 10], [3]]
Output: [2, 1, -1, 1]
Explanation:
insert(10): Insert 10 into the set. Set = [10]
insert(20): Insert 20 into the set. Set = [10, 20]
insert(10): The set already contains 10, so it remains unchanged. Set = [10, 20]
size(): The set contains two distinct elements, so return 2.
find(20): The element 20 is present, so return 1.
find(30): The element 30 is absent, so return -1.
erase(10): Remove 10 from the set. Set = [20]
size(): The set contains one element, so return 1.
```

```
Input: queries[][] = [[3], [4, 5], [1, 5], [4, 5], [2, 5], [3]]
Output: [0, -1, 1, 0]
Explanation:
size(): The set is empty, so return 0.
find(5): The element 5 is absent, so return -1.
insert(5): Insert 5 into the set. Set = [5]
find(5): The element 5 is present, so return 1.
erase(5): Remove 5 from the set. Set = []
size(): The set is empty again, so return 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T12:24:42.806Z  

```java
class MySet {

    // Insert an element into the set.
    public void insert(HashSet<Integer> s, int x) {
        // code here
        s.add(x);
    }

    // Remove an element from the set if it exists.
    public void erase(HashSet<Integer> s, int x) {
        
        // code here
        s.remove(x);
    }

    // Return the number of distinct elements in the set.
        
    public int size(HashSet<Integer> s) {
        // code here
        return s.size();
    }

        
    // Return 1 if the element exists; otherwise, return -1.
    public int find(HashSet<Integer> s, int x) {
        // code here
        if(s.contains(x)){
            return 1;
        }else{
            return -1;
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-stl-set-8-unordered-set/1)