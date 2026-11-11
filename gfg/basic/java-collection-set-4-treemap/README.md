# Ordered or Tree Map Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement a class MySortedMap that maintains keys in sorted order and supports the following operations:

- insert(int x, int y): Add an entry with key x and value y to the map. If key x already exists, update its value to y.
- get(int x): Return the value of key x if present; otherwise, return -1.
- size(): Return the total number of entries currently in the map.
- remove(int x): If key x exists in the map, remove it; otherwise, leave the map unchanged.
- getMinKey(): Return the smallest key currently stored in the map. If the map is empty, return -1.
- getMaxKey(): Return the largest key currently stored in the map. If the map is empty, return -1.

There will be a sequence of queries[][]. The queries are represented in numeric form:

- 1 x y - Call insert(x, y)
- 2 x - Call get(x)
- 3 - Call size()
- 4 x - Call remove(x)
- 5 - Call getMinKey()
- 6 - Call getMaxKey()

The driver code will process the queries, call the corresponding functions, and print the outputs of get(), size(), getMinKey(), and getMaxKey() operations. You only need to implement the above six functions.

 **Examples:** 

```
Input: queries[][] = [[1, 20, 5], [1, 10, 2], [1, 30, 8], [5], [6], [2, 10], [4, 10], [5], [3]]
Output: [10, 30, 2, 20, 2]
Explanation: Operations on the map will process as follows:
insert(20, 5): Add entry with key 20 and value 5. Map = {20: 5}.
insert(10, 2): Add entry with key 10 and value 2. Sorted keys = {10, 20}.
insert(30, 8): Add entry with key 30 and value 8. Sorted keys = {10, 20, 30}.
getMinKey(): Smallest key is 10, so return 10.
getMaxKey(): Largest key is 30, so return 30.
get(10): Key 10 exists with value 2, so return 2.
remove(10): Key 10 exists, remove key 10. Map = {20: 5, 30: 8}.
getMinKey(): Smallest remaining key is 20, so return 20.
size(): The map contains 2 entries, so return 2.
```

```
Input: queries[][] = [[5], [6], [1, 5, 100], [1, 5, 200], [2, 5], [5], [6], [4, 5], [5]]
Output: [-1, -1, 200, 5, 5, -1]
Explanation: Operations on the map will process as follows:
getMinKey(): Map is empty, so return -1.
getMaxKey(): Map is empty, so return -1.
insert(5, 100): Add entry with key 5 and value 100. Map = {5: 100}.
insert(5, 200): Key 5 already exists, update its value to 200. Map = {5: 200}.
get(5): Key 5 exists with value 200, so return 200.
getMinKey(): Smallest key is 5, so return 5.
getMaxKey(): Largest key is 5, so return 5.
remove(5): Key 5 exists, remove key 5. Map is empty {}.
getMinKey(): Map is empty, so return -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T00:34:27.704Z  

```java
class MySortedMap {
    public void insert(TreeMap<Integer, Integer> mp, int x, int y) {
        // code here
        mp.put(x,y);
    }

    public int get(TreeMap<Integer, Integer> mp, int x) {
        // code here
        return mp.getOrDefault(x, -1);
    }
        
    public int size(TreeMap<Integer, Integer> mp) {
        // code here
        return mp.size();
    }

    public void remove(TreeMap<Integer, Integer> mp, int x) {
        // code here
        mp.remove(x);
    }

    public int getMinKey(TreeMap<Integer, Integer> mp) {
        // code here
        if(mp.isEmpty())return-1;
        return mp.firstKey();
    }

    public int getMaxKey(TreeMap<Integer, Integer> mp) {
        // code here
        if(mp.isEmpty())return-1;
        return mp.lastKey();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-collection-set-4-treemap/1)