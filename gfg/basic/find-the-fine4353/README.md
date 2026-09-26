# Even Odd Positions

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of car numbers  **car[]**, an array of penalties **fine[]**, and an integer  **date**, find the total fine collected on that date. The fine is collected based on parity, i.e., on an even date, fines are collected from odd-numbered cars, and on an odd date, fines are collected from even-numbered cars.

 **Examples:** 

```
Input: date = 12, car[] = [2375, 7682, 2325, 2352], fine[] = [250, 500, 350, 200]
Output: 600
Explanation: The date is 12 (even), so we collect the fine from odd-numbered cars. The odd-numbered cars and the fines associated with them are as follows:
2375 -> 250
2325 -> 350
The sum of the fines is 250+350 = 600
```

```
Input: date = 8, car[] = [2222, 2223, 2224], fine[] = [200, 300, 400]
Output: 300
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T14:27:36.982Z  

```java
class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        int p=date%2;
        long amt=0;
        if(p==0){
        for(int i=0;i<car.length;i++){
                if(car[i]%2==1){
                    amt+=fine[i];
                    
                }
                
            }}
            else{
                for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                    amt+=fine[i];
                    
                }
                
            }
            }
        
            
        
        return amt;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-fine4353/1)