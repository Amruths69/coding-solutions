# Q1. Number of Elapsed Seconds Between Two Times

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two valid times `startTime` and `endTime`, each represented as a string in the format `"HH:MM:SS"`.

Return the number of seconds that have elapsed from `startTime` to `endTime`, inclusive of both endpoints.

 

 **Example 1:** 

 **Input:**  startTime = "01:00:00", endTime = "01:00:25"

 **Output:**  25

 **Explanation:** 

`endTime` is 25 seconds ahead of `startTime`.

 **Example 2:** 

 **Input:**  startTime = "12:34:56", endTime = "13:00:00"

 **Output:**  1504

 **Explanation:** 

`endTime` is 25 minutes and 4 seconds ahead of `startTime`, which equals 1504 seconds.

 

 **Constraints:** 

- startTime.length == 8
- endTime.length == 8
- startTime and endTime are valid times in the format "HH:MM:SS"
- 00 <= HH <= 23
- 00 <= MM <= 59
- 00 <= SS <= 59
- endTime is not earlier than startTime

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 44.4 MB  
**Submitted:** 2026-07-12T03:23:34.933Z  

```java
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start = toSeconds(startTime);
        int end = toSeconds(endTime);
        return end - start;
    }

    private int toSeconds(String time) {
        int ho = Integer.parseInt(time.substring(0, 2));
        int mi = Integer.parseInt(time.substring(3, 5));
        int se = Integer.parseInt(time.substring(6, 8));

        return ho * 3600 + mi * 60 + se;
    }
        
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-elapsed-seconds-between-two-times/)