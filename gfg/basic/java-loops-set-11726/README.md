# Java loops | Set 1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

For a given N, return an arraylist containing the sum of even and odd integers of the first N natural numbers.

 **Example 1:** 

```
Input:
N = 1
Output:
0 1
Explanation:
Natural numbers less than 1 are only 1.
So the sum of even number = 0.
and the sum of odd number = 1.
```

 **Example 2:** 

```
Input:
N = 6
Output:
12 9  
Explanation:
Natural numbers less than 6 are 
1 2 3 4 5 6
So the sum of even number = 2 + 4 + 6 = 12.
and the sum of odd number = 1 + 3 + 5 = 9.
```

 **Your Task:**  
You don't need to read input or print anything. Your task is to complete the function  **getSum** () which takes an integer N as input parameter and return an arraylist containing the sum of even and odd natural number less than equal to N.

 **Expected Time Complexity:**  O(N)
 **Expected Auxiliary Space** : O(1)

 **Constraints:** 
1<= N <=104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T00:18:43.209Z  

```java
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        int es=0;
        int os=0;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=N;i++){
            if(i%2==0){
                es+=i;
                
            }else{
                os+=i;
            }
        }
        al.add(es);
        al.add(os);
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-loops-set-11726/1)