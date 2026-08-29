# Q1. Minimum Bishop Moves to Reach Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is an `8 x 8` empty chessboard with  **1-indexed**  rows and columns.

You are given an array `source = [sr, sc]` representing the starting position of a  **bishop**, and an array `target = [tr, tc]`. In one move, the bishop travels any number of squares along a single  **diagonal**  direction, staying within the board.

Return the  **minimum**  number of moves for the bishop to land  **exactly**  on `target`. If it can never reach `target`, return -1.

 

 **Example 1:** 

 **Input:**  source = [8,1], target = [1,8]

 **Output:**  1

 **Explanation:** 

 **​​​​​​​** 

A single diagonal move takes the bishop straight from `(8, 1)` to `(1, 8)`.

 **Example 2:** 

 **Input:**  source = [4,2], target = [1,3]

 **Output:**  2

 **Explanation:** 

The bishop moves from `(4, 2)` to `(3, 1)`, then from `(3, 1)` to `(1, 3)`, reaching the target in 2 moves.

 **Example 3:** 

 **Input:**  source = [1,1], target = [3,4]

 **Output:**  -1

 **Explanation:** 

No matter how many diagonal moves it makes, the bishop starting at `(1, 1)` can never land on `(3, 4)`. Thus, the answer is -1.

 

 **Constraints:** ​​​​​​​

- source.length == target.length == 2
- 1 <= sr, sc, tr, tc <= 8
- source != target

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 44.2 MB  
**Submitted:** 2026-08-29T14:39:11.770Z  

```java
class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr=source[0];
        int sc=source[1];
        int tr=target[0];
        int tc=target[1];
        if((sr+sc)%2!=(tc+tr)%2)
            return -1;
        else if(Math.abs(sc-tc)==Math.abs(sr-tr))
            return 1;
        else 
            return 2;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-bishop-moves-to-reach-target/)