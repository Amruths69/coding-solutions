import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();

            int a = 0, b = 0, c = 0, d = 0;

            for (int i = 0; i < n; i++) {
                int x = s.nextInt();

                if (i % 2 == 0) {
                    if (x % 2 == 0)
                        a++;
                    else
                        b++;
                } else {
                    if (x % 2 == 0)
                        c++;
                    else
                        d++;
                }
            }

            int z = a + d;
            int y = b + c;

            System.out.println(Math.min(z, y));
        }
    }
}