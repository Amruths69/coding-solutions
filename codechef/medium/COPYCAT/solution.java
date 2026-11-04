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
        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            int minOps = Integer.MAX_VALUE;
            
            // Try all possible split points k (0 to n)
            // k means the first k characters will be '0' and the remaining n-k will be '1'
            for (int k = 0; k <= n; k++) {
                int currentOps = 0;
                boolean possible = true;
                
                // For prefix indices 0 to k-1, we need '0'
                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == '0') continue;
                    // Find the nearest '0' at or to the right of index i
                    int nextZero = -1;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) == '0') {
                            nextZero = j;
                            break;
                        }
                    }
                    if (nextZero == -1) {
                        possible = false;
                        break;
                    }
                    currentOps += (nextZero - i);
                }
                
                if (!possible) continue;
                
                // For suffix indices k to n-1, we need '1'
                for (int i = k; i < n; i++) {
                    if (s.charAt(i) == '1') continue;
                    // Find the nearest '1' at or to the right of index i
                    int nextOne = -1;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) == '1') {
                            nextOne = j;
                            break;
                        }
                    }
                    if (nextOne == -1) {
                        possible = false;
                        break;
                    }
                    currentOps += (nextOne - i);
                }
                
                if (possible) {
                    minOps = Math.min(minOps, currentOps);
                }
            }
            
            System.out.println(minOps == Integer.MAX_VALUE ? -1 : minOps);
        }
        sc.close();

	}
}
