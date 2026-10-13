# Java 1-d and 2-d Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a integer  **n**. We have  **n*n**  values of a 2-d array, and   **n**  values of 1-d array. Task is to find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between.

 **Example 1:** 

```
Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.

```

```
Input : arr[][] = {{1,2}, {1, 2}} and N = 2
brr[] = {10, 1} 
Output :  3 10 
```

 

 **Your Task:** 
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function  **array()**  that takes a two-dimension array  **(a)**, another one dimension array  **(b),**  sizeOfArray  **(n)**, and return the ArrayList which is having the sum of the diagonal elements of the array  **a**  and the maximum number of the array  **b**. The driver code takes care of the printing.

 **Expected Time Complexity:**  O(N).
 **Expected Auxiliary Space:**  O(1).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T14:25:54.158Z  

```java
class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int m=b[0];
        int s=0;
        for(int i=0;i<b.length;i++){
            if(m<=b[i]){
                m=b[i];
                
            }
            
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    s+=a[i][j];
                }
                
            }
            
        }
        ArrayList<Integer> al=new ArrayList<>();
        al.add(s);
        al.add(m);
        return al;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1)