# CHN15A - Rating 770

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-03T04:33:28.525Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int x=a.nextInt();
		    int y=a.nextInt();
		    if(x>y){
		        System.out.println(">");
		    }else if(x<y){
		        System.out.println("<");
		    }else{
		        System.out.println("=");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHN15A)