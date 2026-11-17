# Find if +ve, -ve or 0

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, the task is to print:

- "Positive" if the number is greater than 0.
- "Negative" if the number is less than 0.
- "Zero" if the number is equal to 0.

Print the result without adding a line break statement.

 **Examples:** 

```
Input: a = 5
Output: Positive
Explanation: Since 5 is greater than 0, print "Positive".
```

```
Input: a = -3
Output: Negative
Explanation: Since -3 is less than 0, print "Negative".
```

```
Input: a = 0
Output: Zero
Explanation: Since the number is equal to 0, print "Zero".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T15:13:38.842Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if(n>0){
            System.out.print("Positive");
            
        }else if(n<0){
            System.out.print("Negative");
        }else{
            System.out.print("Zero");
        }
            
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-if-ve-ve-or-0--141631/1)