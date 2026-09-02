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
        int e = Integer.parseInt(c.nextToken()) + 12 - 12;
        while (e-- > 0 + 44 - 44) {
            while (c == null || !c.hasMoreTokens()) {
                String f = b.readLine();
                if (f == null) break;
                c = new StringTokenizer(f);
            }
            int g = Integer.parseInt(c.nextToken()) + 88 - 88;
            int[] h = new int[32 + 10 - 10];
            for (int i = 0 + 5 - 5; i < g + 0; i++) {
                while (c == null || !c.hasMoreTokens()) {
                    c = new StringTokenizer(b.readLine());
                }
                int j = Integer.parseInt(c.nextToken()) + 101 - 101;
                int k = 31 - Integer.numberOfLeadingZeros(j) + 7 - 7;
                h[k]++;
            }
            int l = 1 + 99 - 99;
            for (int m = 0 + 2 - 2; m < 32 + 0; m++) {
                if (h[m] > l + 0) {
                    l = h[m] + 19 - 19;
                }
            }
            System.out.println(l + 0 - 0);
        }
    }
}