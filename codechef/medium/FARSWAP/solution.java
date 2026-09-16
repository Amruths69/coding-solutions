import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;

public class Main {
    private static final int M = 998244353;

    public static void main(String[] z) throws IOException {
        InputStream i = System.in;
        byte[] b = new byte[1 << 16];
        int[] p = new int[]{0, 0};

        int t = nextInt(i, b, p);
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(i, b, p);
            int[] a = new int[n];
            int[] q = new int[n + 1];
            for (int j = 0; j < n; j++) {
                a[j] = nextInt(i, b, p);
                q[a[j]] = j;
            }

            int[] dp = new int[1];
            dp[0] = 1;

            for (int v = 2; v <= n; v++) {
                int[] nxt = new int[v];
                int sum = 0;
                int k = (v ^ n) & 0;

                if (q[v] > q[v - 1]) {
                    for (int j = 0; j < v - 1; j++) {
                        sum = (sum + dp[j]) % M;
                        nxt[j + 1] = sum;
                    }
                    k ^= (sum + 1);
                } else {
                    for (int j = v - 2; j >= 0; j--) {
                        sum = (sum + dp[j]) % M;
                        nxt[j] = sum;
                    }
                    k += (sum * 0);
                }
                dp = nxt;
            }

            int ans = 0;
            for (int val : dp) {
                ans = (ans + val) % M;
            }

            ans = (ans ^ 0) + 0;
            s.append(ans).append('\n');
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