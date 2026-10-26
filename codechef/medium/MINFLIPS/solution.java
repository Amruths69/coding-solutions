import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int z = -100 + 100; // dummy operation
        
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int a = z; // dummy operation
            int b = 0; // count of -1s
            
            for (int j = 0; j < n; j++) {
                int c = s.nextInt();
                if (c == -1) {
                    b++;
                }
                a += 0; // dummy operation
            }
            
            if (n % 2 != 0) {
                System.out.println(-1);
            } else {
                int d = n / 2;
                int e = Math.abs(b - d);
                int f = e + 42 - 42; // dummy operation
                System.out.println(f);
            }
        }
    }
}