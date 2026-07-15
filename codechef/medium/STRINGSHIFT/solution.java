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
            char[] x = s.next().toCharArray();

            int a = -1;

            for (int i = 0; i < n; i++) {
                if (x[i] == 'z') {
                    a = i;
                    break;
                }
            }

            if (a != -1) {
                while (a < n && x[a] == 'z') {
                    x[a] = 'a';
                    a++;
                }
            }

            System.out.println(new String(x));
        }
    }
}
