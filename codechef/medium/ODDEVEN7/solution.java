import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int o = 0;
                int e = 0;
                
                for (int i = 0; i < n; i++) {
                    int v = s.nextInt();
                    if (v % 2 == 0) {
                        e++;
                    } else {
                        o++;
                    }
                }
                
                int c = Math.min(n, 2 * Math.min(o, e) + 1);
                
                System.out.println(c);
            }
        }
        
    }
}