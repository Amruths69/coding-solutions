import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int m = n * 2;
                int[] a = new int[m];
                
                for (int i = 0; i < m; i++) {
                    a[i] = s.nextInt();
                }
                
                int c = 0;
                for (int i = 0; i < n; i++) {
                    c += Math.max(a[i], a[m - 1 - i]);
                }
                
                System.out.println(c);
            }
        }
        s.close();
    }
}