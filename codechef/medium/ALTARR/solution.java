import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int evenIndexOdd = 0;
            int evenIndexEven = 0;
            int oddIndexOdd = 0;
            int oddIndexEven = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();

                if (i % 2 == 0) {
                    if (x % 2 == 0)
                        evenIndexEven++;
                    else
                        evenIndexOdd++;
                } else {
                    if (x % 2 == 0)
                        oddIndexEven++;
                    else
                        oddIndexOdd++;
                }
            }

            int pattern1 = evenIndexEven + oddIndexOdd;
            int pattern2 = evenIndexOdd + oddIndexEven;

            System.out.println(Math.min(pattern1, pattern2));
        }
    }
}
