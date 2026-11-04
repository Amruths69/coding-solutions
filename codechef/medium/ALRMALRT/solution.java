import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long D = sc.nextLong();
            
            long ans = Long.MAX_VALUE;
            
            // 1. Find the minimum time t = k * X that is a multiple of X
            // where the other alarm rang at s <= t with t - s <= D (i.e., t >= Y and t % Y <= D)
            long k = (Y + X - 1) / X; // Smallest k such that k * X >= Y
            while (true) {
                long t = k * X;
                if (ans != Long.MAX_VALUE && t >= ans) {
                    break;
                }
                if (t % Y <= D) {
                    ans = Math.min(ans, t);
                    break;
                }
                k++;
            }
            
            // 2. Find the minimum time t = m * Y that is a multiple of Y
            // where the other alarm rang at s <= t with t - s <= D (i.e., t >= X and t % X <= D)
            long m = (X + Y - 1) / Y; // Smallest m such that m * Y >= X
            while (true) {
                long t = m * Y;
                if (ans != Long.MAX_VALUE && t >= ans) {
                    break;
                }
                if (t % X <= D) {
                    ans = Math.min(ans, t);
                    break;
                }
                m++;
            }
            
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        sc.close();

	}
}
