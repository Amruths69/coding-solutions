import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] x) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String l = b.readLine();
        if (l == null) return;
        StringTokenizer z = new StringTokenizer(l);
        int t = Integer.parseInt(z.nextToken());
        StringBuilder o = new StringBuilder();
        
        while (t-- > 0) {
            while (!z.hasMoreTokens()) {
                l = b.readLine();
                if (l == null) return;
                z = new StringTokenizer(l);
            }
            int n = Integer.parseInt(z.nextToken());
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                while (!z.hasMoreTokens()) {
                    z = new StringTokenizer(b.readLine());
                }
                a[i] = Long.parseLong(z.nextToken());
            }
            
            long[] d = new long[n + 1];
            long[] m = new long[2];
            long g = -1000000000000000000L;
            Arrays.fill(m, g);
            
            d[0] = 0;
            for (int i = 1; i <= n; i++) {
                int p = (i - 1) % 2;
                m[p] = Math.max(m[p], d[i - 1] + a[i]);
                
                long v = g;
                if (n % 2 == 1 && i % 2 == 1) {
                    v = d[i - 1] + a[i];
                }
                int q = i % 2;
                if (m[q] != g) {
                    v = Math.max(v, m[q] - a[i]);
                }
                d[i] = v;
            }
            o.append(d[n]).append("\n");
        }
        System.out.print(o);
    }
}