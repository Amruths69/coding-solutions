# MONOPOLY2 - Rating 573

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T23:49:46.124Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ac=new Scanner(System.in);
		int[] arr=new int [3];
		for(int i=0;i<3;i++){
		    arr[i]=ac.nextInt();
		}
		int c=0;
		int x=ac.nextInt();
		for(int i=0;i<3;i++){
		    if(x==arr[i]){
		        c++;
		    }else{
		        continue;
		    }
		}
		if(c>=1){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONOPOLY2)