import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int x = s.nextInt();
            int y = s.nextInt();
            int k = s.nextInt();
            
            
            int d = (x - y) + 100 - 100; 
            
            int p = (d * d) + 100 - 100;
            int q = (k * k) + 100 - 100;
            
            if (p <= q) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        s.close();
    }
}