# Absolute Digit Diff 1 in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** and a number **k,** find all the numbers less than  **k** that have at least two digits and the absolute difference between every adjacent digit of that number should be  **1**.

 **Note:** Return an empty list if no such number is present.

 **Examples:** 

```
Input: arr[] = [7, 98, 56, 43, 45, 23, 12, 8], k = 54
Output: [43, 45, 23, 12]
Explanation: 43 45 23 12 all these numbers have adjacent digits diff as 1 and they are less than 54.
```

```
Input: arr[] = [87, 89, 45, 235, 465, 765, 123, 987, 499, 655], k = 1000
Output: [87, 89, 45, 765, 123, 987]
Explanation: 87 89 45 765 123 987 all these numbers have adjacent digits diff as 1 and they are less than 1000.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T14:40:34.733Z  

```java
class Solution {

    int[] getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        int[] arr1=new int[arr.length];
        int jk=0;
        for(int i=0;i<arr.length;i++){
            int g=String.valueOf(arr[i]).length();
            if(g>=2 && arr[i]<k){
                int y=arr[i];
                boolean b=true;
                int c=0;
                while(y>9){
                    int f=y%10;
                    int j=(y/10)%10;
                    if(Math.abs(f-j)!=1){
                        c++;
                    }
                    y=y/10;
                }
                
                if(c==0){
                    arr1[jk]=arr[i];
                    jk++;
                }else{
                    continue;
                    
                }
            }
            
        }
        int[] r=new int[jk];
        for(int i=0;i<jk;i++){
            r[i]=arr1[i];
        }
        return r;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/absolute-difference-11156/1)