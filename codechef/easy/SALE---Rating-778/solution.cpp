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
		    int b=a.nextInt();
		    int c=a.nextInt();
		    int d=a.nextInt();
            int g=Math.min(d,Math.min(b,c));
            if(g!=d){
                System.out.println(b+c);
            }else if(g!=b){
                System.out.println(d+c);
            }else if(g!=c){
                System.out.println(b+d);
            }
		}

	}
}
