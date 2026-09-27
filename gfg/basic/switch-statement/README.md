# Switch Statement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, use a switch statement to return "One" if the given number is equal to 1, "Two" if the number is 2 and so on till 9 ("Nine") else return "Unknown"(without quotes). 

 **Examples:** 

```
Input: n = 10
Output: Unknown
```

```
Input: n = 1
Output: One
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T00:48:52.568Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        switch(n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Unknown");
                
            
        }
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/switch-statement/1)