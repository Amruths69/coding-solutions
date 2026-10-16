# Java Collection | Set 3 (HashMap) Part-1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

**HashMap**  is a part of collection in Java. It provides the basic implementation of Map interface of Java. It stores the data in (Key, Value) pairs. To access a value you must know its key, otherwise, you can’t access it. HashMap is known as HashMap because it uses the technique called Hashing. Solve the following problem using a HashMap.

Given two arrays key[] and arr[] of size N and a key  **s.**  Each key[i] and arr[i] form a key-value pair. Find if the value of S in the N key-value pairs. 

 

 **Example 1:** 

```
Input: n = 3
keys = {sak, varun, vijay}
arr = {5, 7, 3}
s = sak
Output: 5
Explaination: The key is present in the map. 
So its corresponding value is returned which 
is 5.
```

 

 **Example 2:** 

```
Input: n = 4
keys = {csdb, dsh, askj, adfs}
arr = {4, 5, 8, 9}
s = dptu
Output: -1
Explaination: 
The key is not present in the map.
```

 

 **Your Task:** 
You do not need to read input or print anything. Yous task is to complete the function  **map()**  which takes n, keys[], arr[] and s as input parameters and returns the value associated with the key s. If the key is not present return -1.

 

 **Expected Time Complexity:**  O(n)
 **Expected Auxiliary Space:**  O(1)

 

 **Constraints:** 
1 ≤ n, |length of key|, value ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T00:51:16.276Z  

```java
class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(keys[i],arr[i]);
            
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(s)){
                  return hm.get(s);
            }
        
    }
    return -1;
    
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-hashmap1033/1)