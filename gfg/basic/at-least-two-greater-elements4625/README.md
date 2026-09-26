# At least Two Greater

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array arr of distinct elements, the task is to return an array of elements that have at least two greater elements.

 **Examples:** 

```
Input: arr[] = [2, 8, 7, 1, 5]
Output: [1, 2, 5] 
Explanation: Here we return an array contains 1, 2, 5 and we leave two greatest elements 7 & 8. 
```

```
Input: arr[] = [7, -2, 3, 4, 9, -1]
Output: [-2, -1, 3, 4]
Explanation:  Here we return an array contains -2,  -1,  3,  4 and we leave two greatest elements 7 & 9. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T00:19:18.847Z  

```java
class Solution {
    public long[] findElements(long arr[]) {
        long[] ans=new long[arr.length-2];
        long m=arr[0];
        long c=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
               
            }
        }
        long g=m;
        m=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(g!=arr[i] && m<arr[i] ){
                m=arr[i];
            }
        }
        long g2=m;
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=g2 && arr[i]!=g){
                ans[t]=arr[i];
                t++;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1)