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
		int x=a.nextInt();
		int y=a.nextInt();
		if(n<=3)
		System.out.println(x*n);
		else{
		    System.out.println(((3*x)+(n-3)*y));
		}
}
	}
}
