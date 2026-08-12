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
                
                if (n % 3 == 0) {
                    System.out.println(0);
                } else if (n % 3 == 2) {
                    System.out.println(1);
                } else {
                    int m = (n / 5) * 5 + 5;
                    
                    if (m % 3 == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(2);
                    }
                }
            }
        }
        
        
    }
}