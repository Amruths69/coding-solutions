# Segregate Even and Odd numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **a**  **rr**, write a program segregating even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

 **Note** :- You don't need to return the array, you need to modify it in-place.

 **Example:** 

```
Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
Output: [8, 12, 34, 90, 3, 9, 45]
Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.

```

```
Input: arr[] = [0, 1, 2, 3, 4]
Output: [0, 2, 4, 1, 3]
Explanation: 0 2 4 are even and 1 3 are odd numbers.

```

```
Input: arr[] = [10, 22, 4, 6]
Output: [4, 6, 10, 22]
Explanation: Here all elements are even, so no need of segregataion
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T10:16:20.517Z  

```java
class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        ArrayList<Integer>alo=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                al.add(arr[i]);
            }else{
                alo.add(arr[i]);
            }
        }
        Collections.sort(al);
        Collections.sort(alo);
        int e1=al.size();
        int b=0;
        int t=0;
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(b<al.size()){
                arr[i]=al.get(b);
                b++;
                
            }else{
                arr[i]=alo.get(t);
                t++;
            }
        }
       
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1)