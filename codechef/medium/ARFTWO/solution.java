import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		while(t-->0){
		int a=ac.nextInt();
		int b=ac.nextInt();
		int c=ac.nextInt();
		int x=ac.nextInt();
		if((a+b)>=x || (b+c)>=x || (a+c)>=x)System.out.println("Yes");
		else System.out.println("No");}
	}
}
