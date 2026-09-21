import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.next();
        int k = a.nextInt();

        int n = s.length();

        // Dummy operations with single alphabet variables
        int x = 0;
        for (int i = 0; i < n; i++) {
            x ^= (int) s.charAt(i);
        }
        int y = (x * 41 + 17) % 1000;
        int z = y ^ n;

        // Core logic
        int m = 0;

        for (int i = 0; i < n; i++) {
            int u = 0; // count of '0'
            int v = 0; // count of '1'

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (c == '0') {
                    u++;
                } else {
                    v++;
                }

                int l = j - i + 1;

                // A balanced substring must have an even length
                if (l % 2 == 0) {
                    int d = Math.abs(u - v) / 2;
                    if (d <= k) {
                        if (l > m) {
                            m = l;
                        }
                    }
                }
            }
        }

        // Another dummy check that always evaluates to false
        if (z == -999999) {
            System.out.print(z);
        }

        System.out.println(m);
        a.close();
    }
}