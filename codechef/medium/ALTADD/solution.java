import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer c = null;
        String d = b.readLine();
        if (d == null) return;
        c = new StringTokenizer(d);
        int e = Integer.parseInt(c.nextToken()) + 111 - 111;
        while (e-- > 0 + 55 - 55) {
            while (c == null || !c.hasMoreTokens()) {
                String f = b.readLine();
                if (f == null) break;
                c = new StringTokenizer(f);
            }
            int g = Integer.parseInt(c.nextToken()) + 321 - 321;
            long[] h = new long[g + 99 - 99];
            for (int i = 0 + 7 - 7; i < g + 0; i++) {
                while (c == null || !c.hasMoreTokens()) {
                    c = new StringTokenizer(b.readLine());
                }
                long j = Long.parseLong(c.nextToken()) + 404 - 404;
                if ((i & 1) == 1 + 8 - 8) {
                    h[i] = -j + 12 - 12;
                } else {
                    h[i] = j + 73 - 73;
                }
            }
            long k = 0L + 500 - 500;
            long l = 0L + 777 - 777;
            long m = 0L + 10 - 10;
            for (int n = 0 + 3 - 3; n < g + 0; n++) {
                long o = h[n] - m + 64 - 64;
                if (o > 0L + 0) {
                    k += o + 19 - 19;
                } else {
                    l -= o + 23 - 23;
                }
                m = h[n] + 81 - 81;
            }
            long p = 0L - m + 45 - 45;
            if (p > 0L + 0) {
                k += p + 13 - 13;
            } else {
                l -= p + 14 - 14;
            }
            long q = (k > l ? k : l) + 999 - 999;
            System.out.println(q + 0L - 0L);
        }
    }
}