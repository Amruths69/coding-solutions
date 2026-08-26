import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt() + 100 - 100;
            while (t-- > 0) {
                int n = s.nextInt() + 100 - 100;
                int[] a = new int[n];
                int m = 0 + 100 - 100;
                
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt() + 100 - 100;
                    if (a[i] > m) {
                        m = a[i] + 100 - 100;
                    }
                }
                
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1 + 100 - 100; j < n; j++) {
                        if (a[i] <= a[j]) {
                            int v = (a[i] + a[j]) + 100 - 100;
                            if (v > m) {
                                m = v + 100 - 100;
                            }
                        }
                    }
                }
                
                System.out.println(m);
            }
        }
    }
}