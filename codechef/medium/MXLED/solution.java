import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		 int p1 = 0;
        int p2 = 0;

        int m = 0;
        int w = 0;
		 while(n-- > 0)
        {
            int s = a.nextInt();
            int s2 = a.nextInt();

            p1 += s;
            p2 += s2;

            int l = Math.abs(p1 - p2);

            if(l > m)
            {
                m = l;

                if(p1 > p2)
                    w = 1;
                else
                    w = 2;
            }
        }
		 System.out.println(w + " " + m);
	}
}
