# CDEV010

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print a Greeting Based on Time of Day

In this example, we demonstrate how code blocks are used to structure and organize a C program.

The `main()` function serves as the entry point of the program. Inside it, separate code blocks `{}` are used to group related output statements. Each block contains a `printf` statement that prints a specific meal to the console.

 **When executed, the code will display structured message output:** 

```
Breakfast, Lunch, Dinner!

```

 **There is no need to have three pairs of curly brackets to get the desired output, but we are using them here for demonstration purposes.**

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:59:20.752Z  

```c_cpp
#include <stdio.h> // Include standard input-output library

int main() {
    {
        printf("Breakfast, "); // Block for printing breakfast message
    }
    {
        printf("Lunch, "); // Block for printing lunch message
    }
    {
        printf("Dinner!"); // Block for printing dinner message
    }
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CDEV010)