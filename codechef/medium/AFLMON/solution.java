import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        int x = 0;
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                x += a[i];
            }
            Arrays.sort(a);
            int c = 0;
            int y = x * 2;
            for (int i = 0; i < n; i++) {
                int l = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] <= a[i]) {
                        l++;
                    }
                    y = y + j;
                }
                if (l > n - l) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
