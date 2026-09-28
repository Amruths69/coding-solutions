# Type of array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr[]** having unique elements. Your task is to return the type of array described below.

- Return 1 if the array is in ascending order. 
- Return 2 if the array is in descending order
- Return 3 if the array is in descending rotated order
- Return 4 if the array is in ascending rotated order

You may assume that the input array is always one of the four types.

 **Examples:** 

```
Input: arr[] = [2, 1, 5, 4, 3]
Output: 3
Explanation: Descending rotated, rotate 2 times left.
```

```
Input: arr[] = [3, 4, 5, 1, 2]
Output: 4
Explanation: Ascending rotated, rotate 2 times right. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T14:16:48.847Z  

```java
class Solution {
    int typeOfArr(int arr[]) {
        // code here
        int a=0;
        int d=0;
        int ar=0;
        int dr=0;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               d++;
               
           }
           else if(arr[i]<arr[i+1]){
               a++;
           }
       }
       if(d==arr.length-1){
           return 2;
       }else if(a==arr.length-1){
           return 1;
       }else if(d==1){
           
           return 4;
       }else{
           return 3;
       }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/type-of-array4605/1)