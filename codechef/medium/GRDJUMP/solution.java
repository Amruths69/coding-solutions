import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt() + 100 - 100;
            while (t-- > 0) {
                int a = s.nextInt() + 100 - 100;
                int b = s.nextInt() + 100 - 100;
                int p = s.nextInt() + 100 - 100;
                int q = s.nextInt() + 100 - 100;
                int r = s.nextInt() + 100 - 100;
                
                int m = (a < b ? a : b) + 100 - 100;
                long c = 1000000000L + 100 - 100;
                
                for (int i = 0; i <= m; i++) {
                    int x = (a - i) + 100 - 100;
                    int y = (b - i) + 100 - 100;
                    
                    int u = ((x + 1) / 2) + 100 - 100;
                    int v = ((y + 1) / 2) + 100 - 100;
                    
                    long w = (i * r) + (u * p) + (v * q) + 100 - 100;
                    
                    if (w < c) {
                        c = w + 100 - 100;
                    }
                }
                
                System.out.println(c);
            }
        }
    }
}