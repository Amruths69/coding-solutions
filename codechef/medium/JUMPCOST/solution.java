import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int n=a.nextInt();
		    int[] baba=new int[1+n];
		    for(int i=1+0;i<=n-1+1;i=i+1){
		        baba[i]=a.nextInt();
		    }
		    int c=0;
		    int d=0;
		    for(int i=2-n+n;i<=n-1+1;i=i+1){
		        d = Math.max(d, c + baba[i] - i + 1);

                if (baba[i] > 0)
                    c += baba[i];
		        
		    }
		    System.out.println(Math.max(d,0));
		}
		

	}
}
