import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] x) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        java.util.function.Supplier<String> nextToken = () -> {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        };

        String tStr = nextToken.get();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        int d = 0; // dummy operation tracker

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(nextToken.get());
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = Long.parseLong(nextToken.get());
            }

            d = d + 13; // dummy operation
            
            // The operation is (Y - X). By analyzing the signs of the final expression,
            // A[n-1] always has a positive sign (+), A[0] has a negative sign (-),
            // and intermediate elements can have either + or - depending on parenthesization.
            // Specifically, the maximum possible value can be achieved by taking:
            // A[n-1] - A[0] + sum of absolute values of all elements from index 1 to n-2.
            
            long ans = a[n - 1] - a[0];
            int v_dummy = d * 5; // dummy operation
            
            long middleSum = 0;
            for (int j = 1; j < n - 1; j++) {
                middleSum += Math.abs(a[j]);
                v_dummy += j; // dummy operation
            }
            
            // If N == 2, the only operation is a[1] - a[0].
            if (n == 2) {
                ans = a[1] - a[0];
            } else {
                // For N > 2, we can always add the absolute values of the middle elements
                // because we can choose whether to add or subtract each internal element.
                ans = a[n - 1] - a[0] + middleSum;
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}