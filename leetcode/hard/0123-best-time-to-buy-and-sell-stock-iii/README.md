# Best Time to Buy and Sell Stock III

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

Find the maximum profit you can achieve. You may complete  **at most two transactions**.

 **Note:**  You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

 

 **Example 1:** 

```
Input: prices = [3,3,5,0,0,3,1,4]
Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
```

 **Example 2:** 

```
Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.

```

 **Example 3:** 

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

```

 

 **Constraints:** 

- 1 <= prices.length <= 105
- 0 <= prices[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 65.96%)  
**Memory:** 75.2 MB (beats 97.12%)  
**Submitted:** 2026-11-03T00:16:06.239Z  

```java

class Solution {
    public int maxProfit(int[] prices) {

        int buy1 = -prices[0];
        int sell1 = 0;

        int buy2 = -prices[0];
        int sell2 = 0;

        for (int price : prices) {

            // First transaction
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);

            // Second transaction
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)