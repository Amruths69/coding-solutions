# Even Odd Game

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, number of apples in a bag. You and your friend are picking one apple turnwise from the bag. It is given that the first attempt is always by you. The person picking the last apple will be the winner. 

- If you will win: print "You" (without quotes)
- If your friend will win: print "Friend" (without quotes)

 **Examples:** 

```
Input: n = 9
Output: You
```

```
Input: n = 4
Output: Friend
```

 **Constraints:** 
1 ≤ n ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:21:25.625Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if(n%2!=0){
            System.out.println("You");
        }else{
            System.out.println("Friend");
        }

        sc.close();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-odd-game--153136/1)