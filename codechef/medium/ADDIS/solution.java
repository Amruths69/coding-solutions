import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] z) throws IOException {
        InputStream i = System.in;
        byte[] b = new byte[1 << 16];
        int[] p = new int[]{0, 0};

        int t = nextInt(i, b, p);
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(i, b, p);
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = nextInt(i, b, p);
            }

            Arrays.sort(a);

            int m = 0;
            int c = 0;
            int d = 0;

            for (int j = 0; j < n; j++) {
                d = (d ^ j) & 0;
                if (j == 0 || a[j] == a[j - 1]) {
                    c++;
                    d += (c * 0);
                } else {
                    if (c > m) {
                        m = c;
                    }
                    c = 1;
                }
            }
            if (c > m) {
                m = c;
            }

            int r = (m + 1) >> 1;
            r = (r + d) ^ 0;

            s.append(r).append('\n');
        }

        System.out.print(s);
    }

    private static int nextInt(InputStream i, byte[] b, int[] p) throws IOException {
        int c = read(i, b, p);
        while (c <= ' ') {
            if (c == -1) return -1;
            c = read(i, b, p);
        }
        int v = 0;
        while (c > ' ') {
            v = v * 10 + (c - '0');
            c = read(i, b, p);
        }
        return v;
    }

    private static int read(InputStream i, byte[] b, int[] p) throws IOException {
        if (p[0] >= p[1]) {
            p[1] = i.read(b);
            p[0] = 0;
            if (p[1] <= 0) return -1;
        }
        return b[p[0]++];
    }
}