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
            int N = sc.nextInt();
            int M = sc.nextInt();
            char[][] grid = new char[N][M];
            
            for (int i = 0; i < N; i++) {
                grid[i] = sc.next().toCharArray();
            }
            
            int minR = N, maxR = -1;
            int minC = M, maxC = -1;
            
            // Find the bounding box containing all '1's
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (grid[i][j] == '1') {
                        minR = Math.min(minR, i);
                        maxR = Math.max(maxR, i);
                        minC = Math.min(minC, j);
                        maxC = Math.max(maxC, j);
                    }
                }
            }
            
            // Calculate the area of the minimum rectangular sub-grid
            long area = (long) (maxR - minR + 1) * (maxC - minC + 1);
            System.out.println(area);
        }
        sc.close();

	}
}
