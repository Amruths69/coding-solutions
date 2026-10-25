# AP Term

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given three integers  **a, d**  and  **n.** Where  **a**  is the first term,  **d**  is the common difference of an  **A.P.**  Calculate the  **n** th term of A.P. 
The nth term is given by an = a + (n-1)d

 **Examples:** 

```
Input: a = 5, d = 2, n = 5
Output: 13
Explanation: anth = a + (n-1)d = 5 + (5-1)*2 = 5 + 8 = 13
```

```
Input: a = 10, d = 10, n = 101 
Output: 1010 
Explanation: anth = a + (n-1)d = 10 + (101-1)*10 = 10 + 1000 = 1010.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:15:45.730Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        // code here
        System.out.println(a+(n-1)*d);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ap-term--150919/1)