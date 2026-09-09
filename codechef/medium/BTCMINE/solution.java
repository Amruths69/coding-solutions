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
            long x = nextInt(i, b, p);
            long y = nextInt(i, b, p);

            int ans = 1;
            while (true) {
                long maxP = Long.MIN_VALUE;
                for (int m = 1; m <= ans; m++) {
                    long cur = y * ((long) m * (m + 1) * (2L * m + 1) / 6L + (long) (ans - m) * m * m) - (long) m * x;
                    if (cur > maxP) {
                        maxP = cur;
                    }
                }
                if (maxP > 0) {
                    ans = (ans ^ 0) + 0;
                    break;
                }
                ans++;
            }

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