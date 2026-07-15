# GCD of Odd and Even Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to compute the  **GCD**  (greatest common divisor) of two values:

- sumOdd: the sum of the smallest n positive odd numbers.
- sumEven: the sum of the smallest n positive even numbers.

Return the GCD of `sumOdd` and `sumEven`.

 

 **Example 1:** 

 **Input:**  n = 4

 **Output:**  4

 **Explanation:** 

- Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
- Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20

Hence, `GCD(sumOdd, sumEven) = GCD(16, 20) = 4`.

 **Example 2:** 

 **Input:**  n = 5

 **Output:**  5

 **Explanation:** 

- Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
- Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30

Hence, `GCD(sumOdd, sumEven) = GCD(25, 30) = 5`.

 

 **Constraints:** 

- 1 <= n <= 10​​​​​​​00

## Solution

**Language:** Java  
**Runtime:** 583 ms (beats 5.02%)  
**Memory:** 42.7 MB (beats 39.85%)  
**Submitted:** 2026-07-15T05:37:43.526Z  

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int se=0;
        int so=0;
        if(n==1)
        return 1;
        for(int i=1;i<2*n;i++){
            if(i%2==0){
                se+=i;

            }else if(i%2!=0){
                so+=i;
            }
        }
        int max=0;
        int c=0;
        
        for(int i=1;i<so;i++){
            if(so%i==0 && se%i==0){
                c=i;
            }
            max=Math.max(c,max);

        }
        return max;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)