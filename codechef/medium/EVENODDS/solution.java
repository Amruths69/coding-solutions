import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    
	    Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int maxLen = 0;
            
            // Check all possible contiguous subarrays
            for (int i = 0; i < N; i++) {
                int oddCount = 0;
                for (int j = i; j < N; j++) {
                    if (A[j] % 2 != 0) {
                        oddCount++;
                    }
                    // If the number of odd integers is even, update maxLen
                    if (oddCount % 2 == 0) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            
            System.out.println(maxLen);
        }
        sc.close();
}}