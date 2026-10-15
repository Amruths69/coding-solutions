# Java Collection | Set 1 (ArrayList) Part-1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

ArrayList are dynamic size arrays. Try this problem using ArrayList.

Given a ArrayList of  **N**  elements and a integer  **Q**  defining the type of query(which will be either 1 or 2) :
 **Q = 1**  includes two integers  **p**  and  **r**. Which means insert the value r at index p in the ArrayList and print the whole updated ArrayList.
 **Q = 2**  includes one integer  **p**. In this query print the index at which the value p is last found in the ArrayList. If the value p is not found in the ArrayList then print " **-1** ". 

 **NOTE: Assume 0 based indexing** 

 

 **Example 1:** 

```
Input:
N = 5, Q = 1 
A[] = {1, 4, 5, 9, 3} 
Query[] = {2, 6} 
Output: 
1 4 6 5 9 3 
Explanation: 
p=Query[0]=2 
r=Query[1]=6 
After inserting the element 
r=6 at index p=2,the updated 
arraylist ={1,4,6,5,9,3}
```

 

 **Example 2:** 

```
Input:
N = 4, Q = 2
A[]= {1, 9, 2, 4}
Query[]= {4}
Output:
3 
Explanation: 
p = 4 
The element 4 is last found
in A at index = 3   
```

 

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function **solve()**  which takes the  **N** (number of elements in Array A),ArrayList  **A**,  **Q** (Type of the of query) and the ArrayList  **Query**. If the Q = 1 then return the updated ArrayList of integers. else return the ArrayList which contains the index at which the value p is last found in the ArrayList A (where p = Query[0]) ,If the value of p is not found then return the ArrayList which contains -1. 

 **Expected Time Complexity:**  O(N)
 **Expected Auxiliary Space:**  O(N)

 **Constraints:** 
1 <= N <= 104
1 <= Q <= 2
If Q = 1 then size of Query is 2,
where Query[0] represents the value of p and Query[0] represents the value of r.
If Q = 2 then size of Query is 1,
where Query[0] represents the value of p.
1 <= A[i] <= 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T00:00:51.690Z  

```java
class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int p=Query.get(0);
       
        if(Q==1){
             int r=Query.get(1);
            for(int i=0;i<A.size();i++){
                if(i==p){
                    A.add(p,r);
                    
                    
                }
            }
            return A;
            
        }
        else{
            int h=Query.get(0);
            for(int i=A.size()-1;i>=0;i--){
                if(A.get(i)==h){
                    al.add(i);
                    return al;
                }
            }
        }
        
        ArrayList<Integer>ho=new ArrayList<>();
        ho.add(-1);
        return ho;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-arraylist5312/1)