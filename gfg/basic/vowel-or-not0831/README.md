# Vowel or Not

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a character  **ch**  representing an English alphabet, determine whether it is a  **vowel** or not. Return  **true** if  **ch**  is a vowel otherwise return  **false**.

 **Examples:** 

```
Input: ch = 'a'
Output: true
Explanation: 'a' is a vowel. So output for this test case is true.
```

```
Input: ch = 'Z'
Output: false
Explanation: 'Z' is not a vowel. So output for this test case is false.
```

 **Constraints:** 
ch is a lowercase or uppercase English letter.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T21:37:08.000Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        if(ch=='a'|| ch=='A' || ch=='e'||ch=='E'|| ch=='I'|| ch=='i' || ch=='O'|| ch=='o'||ch=='U'||ch=='u'){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1)