# The Else if Statement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number, you have to use if, else if, else conditional statements according to the following:
 **if**  number is greater than 100: Print  **"Big"** (without quotes)
 **else if**  number is smaller than 10: Print  **"Small"** (without quotes)
 **else** : Print  **"Number"** (without quotes) 

 **Note:**  Ensure that the output includes a newline after every print statement.

 **Examples:** 

```
Input: number = 9
Output: Small
Explanation: Here, the else if condition will work as 9 is smaller than 10.
```

```
Input: number = 101
Output: Big
Explanation: 101 is greater than 100, so our if statement works and we print Big.
```

```
Input: number = 30
Output: Number
Explanation: 30 is neither greater than 100, nor smaller than 10, so the else statement works here.
```

**Constraints:
**1 ≤ number ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T12:16:30.204Z  

```java
class Solution {
    public static void utility(int number) {
        // Write the if, else if, else statements below
        if(number>100){
            System.out.println("Big");
        }else if(number<10){
            System.out.println("Small");
        }else{
            System.out.println("Number");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-else-if-statement/1)