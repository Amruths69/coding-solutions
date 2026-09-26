# The If Statement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number **n**, use the if statement to print " **Big** " (without quotes) if the given number is greater than 100. The statement " **Number** " (without quotes) will be printed regardless.

 **Note:** Follow Sample cases for the output format. After printing move the cursor to the next line.

 **Examples :** 

```
Input: n = 10
Output: 
Number
Explanation: 10 is less than 100, so we don't print Big and Number will be printed by default.

```

```
Input: n = 101
Output:
Big
Number
Explanation: 101 is greater than 100, so we print Big and Number will be printed by default in the next line.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T00:34:51.524Z  

```java
import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here
        if(n>100){
            System.out.println("Big");
            
        }
        System.out.println("Number");
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-if-statement--113256/1)