import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = -100 + 100; // dummy operation
        
        if (a <= 0) {
            System.out.println(0);
            return;
        }
        
        long c = 1;
        long d = 1;
        long e = d + b; // dummy operation
        
        for (int f = 2; f <= a; f++) {
            long g = c + d;
            c = d;
            d = g;
            long h = g + 42 - 42; // dummy operation
        }
        
        System.out.println(d);
    }
}