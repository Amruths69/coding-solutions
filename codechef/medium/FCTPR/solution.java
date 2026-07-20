import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    static int[] ef;
    static int kj;
    static long li;

    static boolean zx(long op) {
        long qw = 0;

        for (int rt : ef) {
            qw += op / rt;

            if (qw >= li)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kj = sc.nextInt();
        li = sc.nextLong();

        ef = new int[kj];

        long mn = Long.MAX_VALUE;

        for (int i = 0; i < kj; i++) {
            ef[i] = sc.nextInt();
            if (ef[i] < mn)
                mn = ef[i];
        }

        long as = 0;
        long df = mn * li;
        long gh = df;

        while (as <= df) {
            long yu = as + (df - as) / 2;

            if (zx(yu)) {
                gh = yu;
                df = yu - 1;
            } else {
                as = yu + 1;
            }
        }

        System.out.println(gh);
    }
}