# Largest Rectangle in Histogram

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array of integers `heights` representing the histogram's bar height where the width of each bar is `1`, return  *the area of the largest rectangle in the histogram*.

 

 **Example 1:** 

```
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

```

 **Example 2:** 

```
Input: heights = [2,4]
Output: 4

```

 

 **Constraints:** 

- 1 <= heights.length <= 105
- 0 <= heights[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 69 ms (beats 53.48%)  
**Memory:** 78.4 MB (beats 37.21%)  
**Submitted:** 2026-09-14T00:04:43.043Z  

```java
class Solution {
    public int largestRectangleArea(int[] heights) {
        int mA=0;
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int cH=(i==n)?0:heights[i];
            while(!st.isEmpty() && cH < heights[st.peek()]){
                int h1=heights[st.pop()];
                int w=st.isEmpty()? i: i-st.peek()-1;
                mA=Math.max(mA,h1*w);
            }
            st.push(i);
        }
        return mA;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/)