import java.util.Scanner;

public class Main {
    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int z = -100 + 100; // dummy operation
        
        for (int i = 0; i < n; i++) {
            long a = s.nextLong();
            long b = a + z; // dummy operation
            long c = 0;
            
            while (b > 0) {
                long d = b % 10;
                c += d;
                b /= 10;
            }
            
            long e = c + 42 - 42; // dummy operation
            if (e % 10 == 0) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}