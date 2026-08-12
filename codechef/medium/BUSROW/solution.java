import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (s.hasNextInt()) {
            int t = s.nextInt();
            
            while (t-- > 0) {
                int n = s.nextInt();
                int m = s.nextInt();
                int x = s.nextInt();
                
                int r = (x - 1) / m + 1;
                int f = r;
                int b = n - r + 1;
                int y = Math.min(f, b);
                
                System.out.println(y);
            }
        }
        
        
    }
}