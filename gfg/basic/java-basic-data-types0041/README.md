# Java Basic Data Types

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Read a value and store it in the appropriate Java Data Type. 

 **Example:** 

```
Input: 
18 
abc 
9.9876 
Output:
18 
abc 
9.9876 
Explanation: The three inputs are stored in appropriate data types and then printed in order.

```

 **Your Task:** 
Your task is to complete each of the given functions 
 **javaIntType**  **()** : read an integer input, store it in appropriate data type and return it. 
 **javaStringType**  **() :** read a string input, store it in appropriate data type and return it.  
 **javaFloatType**  **() :** read a float input, store it in appropriate data type and return it. 
Each of the function have an object of Scanner in the parameter to be used to read the input.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T23:53:53.022Z  

```java
class Solution {

    int javaIntType(Scanner sc) {
        // code here
        int a=sc.nextInt();
        return a;
    }

    String javaStringType(Scanner sc) {
        // code here
        String h=sc.next();
        return h;
    }

        
    float javaFloatType(Scanner sc) {
        // code here
        float b=sc.nextFloat();
        return b;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-basic-data-types0041/1)