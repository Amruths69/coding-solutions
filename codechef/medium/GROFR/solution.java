import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner z = new Scanner(System.in);
        
        if (z.hasNextInt()) {
            int n = z.nextInt();
            String s = z.next();
            
            int c = 0;
            boolean f = false;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    if (!f) {
                        c++;
                        f = true;
                    }
                } else {
                    f = false;
                }
            }
            
            System.out.println(c);
        }
        
        z.close();
    }
}