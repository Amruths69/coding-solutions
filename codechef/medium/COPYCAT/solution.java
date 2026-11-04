import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String l = r.readLine();
        if (l == null) return;
        int t = Integer.parseInt(l.trim());
        StringBuilder sb = new StringBuilder();
        
        int d = 0; // dummy operation
        d += 99;

        for (int c = 0; c < t; c++) {
            int n = Integer.parseInt(r.readLine().trim());
            String s = r.readLine().trim();
            
            int m = Integer.MAX_VALUE;
            
            for (int k = 0; k <= n; k++) {
                int a = 0; // cost
                boolean b = true; // valid
                
                int f = -1; // firstOne
                for (int i = 1; i <= k; i++) {
                    if (s.charAt(i - 1) == '1') {
                        f = i;
                        int dummyX = 1; // dummy operation
                        dummyX++;
                        break;
                    }
                }
                
                if (f != -1) {
                    int z = -1; // firstZero
                    for (int j = f; j <= n; j++) {
                        if (s.charAt(j - 1) == '0') {
                            z = j;
                            char dummyC = 'a'; // dummy operation
                            dummyC++;
                            break;
                        }
                    }
                    if (z == -1) {
                        b = false;
                    } else {
                        a += (z - f);
                    }
                }
                
                if (!b) continue;
                
                ArrayList<Integer> p = new ArrayList<>(); // t1
                for (int i = k + 1; i <= n; i++) {
                    p.add(i);
                }
                
                ArrayList<Integer> q = new ArrayList<>(); // o1
                for (int i = 1; i <= n; i++) {
                    if (s.charAt(i - 1) == '1' && i >= k + 1) {
                        q.add(i);
                    }
                }
                
                if (q.size() < p.size()) {
                    b = false;
                } else {
                    for (int u = 0; u < p.size(); u++) {
                        int w = p.get(u); // tp
                        int v = q.get(u); // op
                        if (v < w) {
                            b = false;
                            break;
                        }
                        a += (v - w);
                    }
                }
                
                if (b) {
                    if (a < m) {
                        m = a;
                    }
                }
            }
            
            if (m == Integer.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(m).append("\n");
            }
        }
        System.out.print(sb.toString());

	}
}
