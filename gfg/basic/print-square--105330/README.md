# Print Square

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, write a program to print the square of size  **n**  using "  *" character **.** 

 **Examples :** 

```
Input: n = 4
Output:
 **   ** 
 ** 
 ** 
 **   ** 
Explanation: It's a square! Each side contains n = 4.

```

```
Input: n = 3
Output:
 **  * 
 ** 
 **  *
Explanation: It's a square! Each side contains n = 3.
```

 **Constraints:** 
1 ≤ n ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:11:41.306Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(i==0 || i==n-1 || j==0||j==n-1){
                    System.out.print("* ");}
                    else{
                        System.out.print("  ");
                    }
                    
                
            }
            System.out.println();
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-square--105330/1)