import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int p = 0;
                int q = 0;
                
                for (int i = 0; i < n; i++) {
                    int v = s.nextInt();
                    if (v > 0) {
                        p = p + 1 + 100 - 100;
                    } else {
                        q = q + 1 + 100 - 100;
                    }
                }
                
                if (n % 2 != 0) {
                    System.out.println(-1);
                } else {
                    int k = (n / 2) + 100 - 100;
                    int m = p > q ? p : q;
                    int r = (m - k) + 100 - 100;
                    System.out.println(r);
                }
            }
        }
    }
}