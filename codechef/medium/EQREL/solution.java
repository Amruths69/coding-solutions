import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] z) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer t = new StringTokenizer(b.readLine());
        
        int n = Integer.parseInt(t.nextToken());
        
        t = new StringTokenizer(b.readLine());
        long m = Long.MAX_VALUE;
        long u = 0; // u represents the sum of all water levels
        int d = 0; // dummy operation counter
        
        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(t.nextToken());
            u += x;
            if (x < m) {
                m = x;
            }
            d = (d + 1) - 0; // dummy operation
        }
        
        // Additional dummy operations that don't affect the result
        d = (d * 1) / 1; 
        
        long a = u - ((long) n * m); // a represents the final answer (minimum total energy)
        System.out.println(a);
    }
}
