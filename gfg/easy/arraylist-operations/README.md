# Operations on ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Implement the following operations on an ArrayList<Integer> a:

- void add(ArrayList<Integer> a, int x): Add the element x to the end of the ArrayList.
- int remove(ArrayList<Integer> a): Remove and return the last element of the ArrayList. If the ArrayList is empty, return -1.
- int get(ArrayList<Integer> a, int index): Return the element at the specified index. If the ArrayList is empty, return -1.
- void reverse(ArrayList<Integer> a): Reverse the order of the elements in the ArrayList.
- void sort(ArrayList<Integer> a): Sort the elements of the ArrayList in ascending order.
- int size(ArrayList<Integer> a): Return the number of elements currently present in the ArrayList.

You are given a sequence of q queries, represented in numeric form:

- 1 x - Call add(a, x)
- 2 - Call remove(a)
- 3 index - Call get(a, index)
- 4 - Call reverse(a)
- 5 - Call sort(a)
- 6 - Call size(a)

The driver code will process the queries, call the corresponding functions, and print the outputs of remove(), get(), and size() operations. You only need to implement the above six functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [1, 5], [1, 20], [2], [3, 1], [4], [6]]
Output: [20, 5, 2]
Explanation: Operations on the ArrayList will process as follows:
add(10): Add 10 to the end of the list. ArrayList = [10].
add(5): Add 5 to the end of the list. ArrayList = [10, 5].
add(20): Add 20 to the end of the list. ArrayList = [10, 5, 20].
remove(): Remove and return the last element, 20. ArrayList = [10, 5].
get(1): Return the element at index 1, which is 5.
reverse(): Reverse the list. ArrayList = [5, 10].
size(): The list contains two elements, so return 2.
```

```
Input: queries[][] = [[1, 4], [1, 2], [1, 9], [5], [3, 0], [2], [4], [6]]
Output: [2, 9, 2]
Explanation: Operations on the ArrayList will process as follows:
add(4): Add 4 to the end of the list. ArrayList = [4].
add(2): Add 2 to the end of the list. ArrayList = [4, 2].
add(9): Add 9 to the end of the list. ArrayList = [4, 2, 9].
sort(): Sort the list in ascending order. ArrayList = [2, 4, 9].
get(0): Return the element at index 0, which is 2.
remove(): Remove and return the last element, 9. ArrayList = [2, 4].
reverse(): Reverse the list. ArrayList = [4, 2].
size(): The list contains two elements, so return 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T23:56:35.722Z  

```java

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public void add(ArrayList<Integer> a, int x) {
        a.add(x);
    }

    public int remove(ArrayList<Integer> a) {
        if (a.isEmpty()) {
            return -1;
        }
        return a.remove(a.size() - 1);
    }

    public int get(ArrayList<Integer> a, int index) {
        if (a.isEmpty()) {
            return -1;
        }
        return a.get(index);
    }

    public void reverse(ArrayList<Integer> a) {
        Collections.reverse(a);
    }

    public void sort(ArrayList<Integer> a) {
        Collections.sort(a);
    }

    public int size(ArrayList<Integer> a) {
        return a.size();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/arraylist-operations/1)