# MINFLIPS - Rating 778

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T05:20:18.183Z  

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
		    int b=a.nextInt();
		    int c=a.nextInt();
		    int d=a.nextInt();
            int g=Math.min(d,Math.min(b,c));
            if(g!=d){
                System.out.println(b+c);
            }else if(g!=b){
                System.out.println(d+c);
            }else if(g!=c){
                System.out.println(b+d);
            }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MINFLIPS)