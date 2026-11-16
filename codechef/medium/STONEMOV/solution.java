import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] x) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer z = null;
        
        String l = b.readLine();
        if (l == null) return;
        z = new StringTokenizer(l);
        int t = Integer.parseInt(z.nextToken());
        
        StringBuilder o = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(b.readLine().trim());
            long[] a = new long[n + 1];
            z = new StringTokenizer(b.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(z.nextToken());
            }
            
            long[] d = new long[n + 2];
            long s = 0, c = 0;
            
            for (int i = 1; i <= n; i++) {
                s += d[i];
                long v = a[i] + s;
                long m = Math.min(v, n - i);
                c += m;
                if (m > 0) {
                    d[i + 1] += 1;
                    int r = (int) Math.min(n + 1, i + m + 1);
                    d[r] -= 1;
                }
            }
            o.append(c).append("\n");
        }
        System.out.print(o);
    }
}