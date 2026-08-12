import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int t = s.nextInt();
            
            while (t-- > 0) {
                int n = s.nextInt();
                int m = 0;
                int c = 0;
                
                for (int i = 0; i < n; i++) {
                    int a = s.nextInt();
                    m += a;
                    if (a % 2 != 0) {
                        c++;
                    }
                }
                
                if (m % 2 == 0) {
                    System.out.println(m - c / 2);
                } else {
                    System.out.println(c / 2);
                }
            }
        }
        
        s.close();
    }
}
