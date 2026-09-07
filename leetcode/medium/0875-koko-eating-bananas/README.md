# Koko Eating Bananas

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return  *the minimum integer*  `k`  *such that she can eat all the bananas within*  `h`  *hours*.

 

 **Example 1:** 

```
Input: piles = [3,6,7,11], h = 8
Output: 4

```

 **Example 2:** 

```
Input: piles = [30,11,23,4,20], h = 5
Output: 30

```

 **Example 3:** 

```
Input: piles = [30,11,23,4,20], h = 6
Output: 23

```

 

 **Constraints:** 

- 1 <= piles.length <= 104
- piles.length <= h <= 109
- 1 <= piles[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 26 ms (beats 13.82%)  
**Memory:** 48.8 MB (beats 6.06%)  
**Submitted:** 2026-09-07T14:04:32.524Z  

```java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1; int r=1;
        for(int p:piles){
            r=Math.max(r,p);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(cf(piles,mid,h)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
        
    }
    private static boolean cf(int[] piles,int speed,int h){
        int hours=0;
        for(int i:piles){
            hours+=Math.ceil((double)i/speed);
        }
        return hours<=h;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/koko-eating-bananas/)