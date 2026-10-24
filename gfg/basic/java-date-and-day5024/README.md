# Java Date and Day

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.

Given the date, month and year. Find what weekday it was. 
 

 **Example 1:** 

```
Input:
Date = 17
Month = 03 
Year = 2017
Output:
FRIDAY
Explanation:

On 17th of March 2017 day is Friday

```

 **Example 2:** 

```
Input:
Date = 29
Month = 11
Year = 2021
Output:
MONDAY
Explanation:
Monday was the day on 29th November 2021
```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **findDay()**  which takes three integers Date, Month, Year as input parameters and returns the weekday in a string variable (weekday should be in uppercase).

 **Constraints:** 
2000<=Year<=3000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T00:36:36.176Z  

```java
import java.util.*;
import java.text.*;

class Solution {
    static String findDay(int Day, int Month, int Year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Year, Month - 1, Day);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH);

        return sdf.format(cal.getTime()).toUpperCase(Locale.ENGLISH);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-date-and-day5024/1)