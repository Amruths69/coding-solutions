import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] z) throws IOException {
        InputStream in = System.in;
        byte[] buf = new byte[1 << 16];
        int[] ptr = new int[]{0, 0};

        int t = nextInt(in, buf, ptr);
        if (t == -1) return;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = nextInt(in, buf, ptr);
            long[] a = new long[n];
            long totalSum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = nextInt(in, buf, ptr);
                totalSum += a[i];
            }

            Arrays.sort(a);

            long maxVal = 0;
            long currentSr = 0;

            for (int k = 0; k <= n / 2; k++) {
                if (k > 0) {
                    currentSr += a[n - k];
                }
                long val = currentSr * (n - 2L * k) + totalSum * k;
                if (val > maxVal) {
                    maxVal = val;
                }
            }

            sb.append(maxVal).append('\n');
        }

        System.out.print(sb);
    }

    private static int nextInt(InputStream in, byte[] buf, int[] ptr) throws IOException {
        int c = read(in, buf, ptr);
        while (c <= ' ') {
            if (c == -1) return -1;
            c = read(in, buf, ptr);
        }
        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read(in, buf, ptr);
        }
        return val;
    }

    private static int read(InputStream in, byte[] buf, int[] ptr) throws IOException {
        if (ptr[0] >= ptr[1]) {
            ptr[1] = in.read(buf);
            ptr[0] = 0;
            if (ptr[1] <= 0) return -1;
        }
        return buf[ptr[0]++];
    }
}