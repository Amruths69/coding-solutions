# Java Classes Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Create class named **Cuboid**  with fields length,width and height. Calculate volume of the cuboid.
Class Cuboid contains following functions:
 **1. set_length(int l):**  sets the length of the cuboid.
 **2. set_width(int w):**  sets width of the cuboid.
 **3. set_height(int h)** : sets height of the cuboid.
 **4.volume():**  Prints the volume of the cuboid.

 **Input:** 
The first line contains an integer  **T**, the number of test cases. For each test case, three integers are given.

 **Output:** 
For each test case, the output is the volume of the cuboid.

 **User Task:** 
Since this is a functional problem you don't have to worry about input, you just have to complete the functions given  **set_length(), set_width(), set_height()** and **volume()**.

 **Constraints:** 
1 <= T <= 100
1 <= l, w, h <= 103

**Example:
Input**
2
10 5 7
11 9 4

 **Output:** 
350
396

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T00:10:52.487Z  

```java
class task {
    int l,h,w,v;

    public void set_length(int l) {
        // Add your code here.
        this.l=l;
    }

    public void set_width(int w) {
        // Add your code here.
        this.w=w;
    }

    public void set_height(int h) {
        // Add your code here.
        this.h=h;
    }

    public void volume() {
        
        // Add your code here.
        v=h*l*w;
        System.out.println(v);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-classes-introduction/1)