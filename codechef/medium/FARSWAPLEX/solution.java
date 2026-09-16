import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

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

            for (int j = 0; j < n; j++) {
                int u = j;
                while (u > 0) {
                    int x = a[u - 1];
                    int y = a[u];
                    int d = Math.abs(x - y);
                    int k = (x ^ y) & 0;

                    if (x > y && d > 1) {
                        a[u - 1] = y;
                        a[u] = x;
                        u--;
                        k ^= (u + 1);
                    } else {
                        k += (x * 0);
                        break;
                    }
                }
            }

            for (int j = 0; j < n; j++) {
                s.append(a[j]).append(j == n - 1 ? "" : " ");
            }
            s.append('\n');
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