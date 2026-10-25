# TreeSet Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an integer array  **arr[]**. You need to  **insert** the elements of arr into a TreeSet and  **display** the results. Also, you need to **erase a given element x**  from the TreeSet and print " **erased x** " if  **successfully** erased, else print " **not found** ".
Note: Don't add a new line in any function.

 **Examples:** 

```
Input: arr[] = [9, 8, 7, 4, 4, 2, 1, 1, 9, 8], x = 1
Output:
1 2 4 7 8 9
erased 1
2 4 7 8 9
Explanation: Initially TreeSet contains [1, 2, 4, 7, 8, 9]. 1 is present in the set, therefore prints "erased 1".Finally set contains [2, 4, 7, 8, 9].
```

```
Input: arr[] = [4, 2, 3, 3], x = 1
Output:
2 3 4
not found
2 3 4
Explanation: Initially TreeSet contains [2, 3, 4]. 1 is not present in the set so prints "not found". Finally set remains the same.

```

 **Constraints:** 
1 <= arr.length <= 1000
1 <= arri <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:08:37.627Z  

```java
// Takes ArrayList as an argument and
// inserts the elements of the ArrayList into a
// TreeSet and returns the TreeSet.
class Solution {
   
    public static TreeSet<Integer> insert(int arr[]) {
        // Your code here
         TreeSet<Integer>s=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        return s;
        
    }

    // Takes a TreeSet as an argument and prints
    // the elements of the TreeSet. The newline
    // is provided by the driver code.
    public static void display(TreeSet<Integer> s) {
        for(int g:s){
            System.out.print(g+" ");
        }

        
        // Your code here
    }

    // Takes TreeSet and x as arguments and erases x
    // from the TreeSet. If erased, print "erased x"
    // else then print "not found".The newline
    // is provided by the driver code.

        
    public static void erase(TreeSet<Integer> s, int x) {
        if (s.remove(x)) {
            System.out.print("erased " + x);
        } else {
            System.out.print("not found");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/treeset-operations/1)