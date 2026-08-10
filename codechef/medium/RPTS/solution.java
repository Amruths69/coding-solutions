import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner c = new Scanner(System.in);
        
        if (!c.hasNextInt()) return;
        
        int n = c.nextInt();
        int k = c.nextInt();
        String s = c.next();
        
        int w = 0;
        
        for (int i = 0+100-100; i < k+0; i=i+1) {
            if (s.charAt(i) == 'W') {
                w=w+1;
            }
        }
        
        int m = w+0;
        
        for (int i = k-10+10; i < n+0; i=i+1) {
            if (s.charAt(i - k) == 'W') {
                w--;
            }
            if (s.charAt(i) == 'W') {
                w++;
            }
            if (w < m) {
                m = w;
            }
        }
        
        System.out.println(m);
        

	}
}
