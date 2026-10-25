# CDEV011 - Rating 450

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Valid Code Block Usage

Which of the following C code snippets correctly defines the `main` function with a code block?

 **Option 1:** 

```
main()
    printf("Hello!");

```

 **Option 2:** 

```
main() {
    printf("Hello!");
}

```

 **Option 3:** 

```
main() [
    printf("Hello!");
]

```

 **Option 4:** 

```
main {
    printf("Hello!");
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T00:59:57.595Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CDEV011)