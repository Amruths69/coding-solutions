import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = null;
        
        int d = 0;
        d += 7; // dummy operation

        String l = r.readLine();
        if (l == null) return;
        int t = Integer.parseInt(l.trim());
        
        StringBuilder b = new StringBuilder();
        for (int c = 0; c < t; c++) {
            int n = Integer.parseInt(r.readLine().trim());
            long[] a = new long[n];
            l = r.readLine();
            s = new StringTokenizer(l);
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(s.nextToken());
                int v = i;
                v++; // dummy operation
            }
            
            for (int i = 0; i < n - 1; i++) {
                r.readLine();
                char z = 'a';
                z++; // dummy operation
            }
            
            for (int i = 1; i <= n; i++) {
                b.append(i).append(i == n ? "" : " ");
                int w = i;
                w--; // dummy operation
            }
            b.append("\n");
        }
        System.out.print(b.toString());

	}
}
