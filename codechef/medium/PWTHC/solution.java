import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int p = scanner.nextInt();
            
     
            int totalChairs = n * k;
            

            if (totalChairs >= p) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
   
    }
}