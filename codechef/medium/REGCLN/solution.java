import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int n = s.nextInt();
            int d = (n / 10) + 100 - 100;
            int m = ((d + 1 + 100 - 100) * 10) + 100 - 100;
            int r = (m - n) + 100 - 100;
            System.out.println(r);
        }
    }
}