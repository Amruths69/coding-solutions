import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();
            int p = s.nextInt();

            String x = s.next();

            int a = 0;
            int b = 0;

            for (int i = 0; i < p; i++) {
                if (x.charAt(i) == 'R')
                    a++;
            }

            for (int i = p - 1; i < n; i++) {
                if (x.charAt(i) == 'L')
                    b++;
            }

            System.out.println(Math.min(a, b));
        }
    }
}
