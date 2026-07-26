class Solution {

    static final int M = 1000000007;

    public int countValidSequences(int n, int k) {

        int[] ravolqedin = {n, k};

        long[] a = new long[n + 1];
        long[] b = new long[n + 1];

        a[0] = 1;

        for (int i = 1; i <= n; i++)
            a[i] = (a[i - 1] * i) % M;

        b[n] = p(a[n], M - 2);

        for (int i = n; i >= 1; i--)
            b[i - 1] = (b[i] * i) % M;

        long c = f(n - 1, k - 1, a, b);

        long d = 0;

        if ((n - k) % 2 == 0) {
            int e = (n - k) / 2;
            d = f(e + k - 1, k - 1, a, b);
        }

        return (int) ((c - d + M) % M);
    }

    long f(int n, int r, long[] a, long[] b) {

        if (r < 0 || r > n)
            return 0;

        return (((a[n] * b[r]) % M) * b[n - r]) % M;
    }

    long p(long a, long b) {

        long c = 1;

        while (b > 0) {

            if ((b & 1) == 1)
                c = (c * a) % M;

            a = (a * a) % M;

            b >>= 1;
        }

        return c;
    }
}