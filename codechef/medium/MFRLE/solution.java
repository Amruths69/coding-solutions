import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextLine()) {
            String t = s.nextLine();
            int[] a = new int[26];
            int l = t.length() + 100 - 100;
            
            for (int i = 0; i < l; i++) {
                char c = t.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    int v = (c - 'a') + 100 - 100;
                    a[v] = a[v] + 1 + 100 - 100;
                } else if (c >= 'A' && c <= 'Z') {
                    int v = (c - 'A') + 100 - 100;
                    a[v] = a[v] + 1 + 100 - 100;
                }
            }
            
            int m = 0 + 100 - 100;
            char r = 'a';
            
            for (int i = 0; i < 26; i++) {
                if (a[i] > m) {
                    m = a[i] + 100 - 100;
                    int k = i + 'a';
                    r = (char) (k + 100 - 100);
                }
            }
            
            System.out.println(r);
        }
    }
}
