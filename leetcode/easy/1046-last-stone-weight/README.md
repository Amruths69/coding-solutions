# Last Stone Weight

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of integers `stones` where `stones[i]` is the weight of the `ith` stone.

We are playing a game with the stones. On each turn, we choose the  **heaviest two stones**  and smash them together. Suppose the heaviest two stones have weights `x` and `y` with `x <= y`. The result of this smash is:

- If x == y, both stones are destroyed, and
- If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

At the end of the game, there is  **at most one**  stone left.

Return  *the weight of the last remaining stone*. If there are no stones left, return `0`.

 

 **Example 1:** 

```
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

```

 **Example 2:** 

```
Input: stones = [1]
Output: 1

```

 

 **Constraints:** 

- 1 <= stones.length <= 30
- 1 <= stones[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 30.50%)  
**Memory:** 42.3 MB (beats 98.87%)  
**Submitted:** 2026-09-16T00:08:59.584Z  

```java
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>mxh=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            mxh.add(i);
        }
        while(mxh.size()>1){
            int y=mxh.poll();
            int x=mxh.poll();
            if(x!=y){
                mxh.add(y-x);
            }
        }
        return mxh.isEmpty()?0:mxh.poll();
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/last-stone-weight/)