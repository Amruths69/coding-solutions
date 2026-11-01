# nextLine and next

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Here, we will learn how to take input from a string that comprises of multiple words. Also, we will learn to clear the input buffer. Your task is to take input of strings and integers and produce the output. We must be clear with  **next() and nextLine()** 

 **Note:**  Refer to the following link to get a better understanding: StackOverflow

 **Example 1:** 

```
Input:
5
Geeks For Geeks
Output:
5
Geeks For Geeks
```

 **Example 2:** 

```
Input:
102
I am learning Java
Output:
102
I am learning Java
```

 **Your Task:** 
Your task is to complete the function  **getInput()**  to take input of strings and learn how to correctly take input and print the variables in the same order as taken in input.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T00:26:42.660Z  

```java
class Solution {
    static void printInput(int n, String s) {
        // code here
        System.out.println(n);
        System.out.println(s);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/nextline-and-next/1)