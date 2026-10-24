# Java Collection | Set 5 (LinkedHash Set)

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement different operations on a LinkedHashset s .

 **Input:** 
The first line of input contains an integer  **T**  denoting the no of test cases. Then T test cases follow. The first line of input contains an integer  **Q**  denoting the no of queries. Then in the next line are  **Q**  space separated queries.
A query can be of four types 
1. a x (inserts an element x to the LinkedHashSet s)
2. b (prints the contents of the LinkedHashSet s in increasing order)
3. c x (erases an element x from the LinkedHashSet s)
4. d x (prints 1 if the element x is present in the LinkedHashSet else print -1)
5. e (prints the size of the LinkedHashSet s)
6. f (prints the contents of the LinkedHashSet s in insertion order)        
 **Output:** 
The output for each test case will  be space separated integers denoting the results of each query.

 **Constraints:** 
1<=T<=100
1<=Q<=100

 **Example:** 

 **Input** 
2
7
a 1 a 2 a 3 b c 2 b f
10
a 5 a 4 a 3 a 2 a 1 b c 1 c 3 b f
** 
Output**

1 2 3 1 3 1 3
1 2 3 4 5 2 4 5 5 4 2

**Explanation :
For the first test case**
There are seven queries. Queries are performed in this order
1. a 1     { insert 1 to LinkedHashSet now set has {1} }
2. a 2     {inserts 2 to LinkedHashSet now set has {1,2} }
3. a 3     {inserts 3 to set now LinkedHashSet has {1,2,3} }
4. b        {prints the LinkedHashSet contents ie 1,2,3}
5. c 2     {removes 2 from the LinkedHashSet }
6. b        {prints the LinkedHashSet contents ie1,3}                                                                             
7. f         {prints the LinkedHashSet contents in inserted order ie  1,3} 

 **For the second test case** 

There are ten queries. Queries are performed in this order
1. a 5     {inserts 5 to set now set has {5} }

2. a 4     {inserts 4 to set now set has {5,4} }  

3. a 3     {inserts 3 to set now set has {5,4,3} } 

4. a 2     {inserts 2 to set now set has {5,4,3,2} } 

5. a 1     {inserts 1 to set now set has {5,4,3,2,1} } 

6. b        {prints the LinkedHashSet contents in increasing order ie 1,2,3,4,5} 

7. c 1     {removes 1 from the LinkedHashSet } 

8. c 3     {removes 3 from the LinkedHashSet } 

9. b        {prints the LinkedHashSet contents in increasing order ie 2,4,5} 

10. f       {prints the LinkedHashSet contents in inserted order ie 5,4,2}

 **Note:** The  **Input/Output**  format and  **Example**  given are used for system's internal purpose, and should be used by a user for  **Expected Output**  only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T00:34:28.233Z  

```java
/* You are required to complete below methods */
class GfG {
    /*inserts an element x to the set s */
    void insert(LinkedHashSet<Integer> s, int x) {
        // Your code here
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_Contents_Increasing_Order(LinkedHashSet<Integer> s) {
        
        // Your code here
        TreeSet<Integer>ts=new TreeSet<>(s);
        for(int i:ts){
            System.out.print(i+" ");
        }
    }

    /*prints the contents of the set s in ascending order */
        
    void print_Contents_Insertion_Order(LinkedHashSet<Integer> s) {
        // Your code here
        for(int i:s){
            System.out.print(i+" ");
        }
        
    }

        
    /*erases an element x from the set s */
    void erase(LinkedHashSet<Integer> s, int x) {
        // Your code here
        s.remove(x);
    }
        

    /*returns the size of the set s */
    int size(LinkedHashSet<Integer> s) {
        // Your code here
        return s.size();
    }
        

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(LinkedHashSet<Integer> s, int x) {
        // Your code here
        return s.contains(x)?1:-1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-collection-set-5-linkedhash-set/1)