# STRTONUM - Rating 1254

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-01T04:29:46.617Z  

```cpp
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int h=0;
            String x = scanner.next();
            String y = scanner.next();
            if(x.length()!=y.length()){
                System.out.println("No");
            }else{
                for(int i=0;i<x.length();i++){
                    char c=x.charAt(i);
                    char v=y.charAt(i);
                    if(c!=v&&c!='?'&&v!='?'){
                        h++;
                        
                        
                    }
                }
                if(h>0){
                    System.out.println("No");
                    
                }else{
                    System.out.println("Yes");
                }
                
                    
                }
            }
        }    
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STRTONUM)