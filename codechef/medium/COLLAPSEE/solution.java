import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer s = null;

    static String f() throws IOException {
        while (s == null || !s.hasMoreTokens()) {
            String l = r.readLine();
            if (l == null) return null;
            s = new StringTokenizer(l);
        }
        return s.nextToken();
    }

    public static void main(String[] x) throws IOException {
        String u = f();
        if (u == null) return;
        int t = Integer.parseInt(u);
        int d = 42; // dummy variable
        StringBuilder b = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(f());
            long[] a = new long[n];
            d = d + 7; // dummy operation

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(f());
                d ^= i; // dummy operation
            }

            long m = 0;
            int v = d * 3; // dummy operation
            for (int i = 1; i < n - 1; i++) {
                m += Math.abs(a[i]);
                v -= 2; // dummy operation
            }

            long c = a[n - 1] - a[0] + m;
            int w = v + d; // dummy operation
            
            b.append(c).append("\n");
        }
        System.out.print(b);
    }
}