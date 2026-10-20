import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		while(t-->0){
		    int a=ac.nextInt();
		    int b=ac.nextInt();
		    int c=ac.nextInt();
		    int d=ac.nextInt();
		    if(a>c||b>d){
		        System.out.println("Impossible");
		    }else{
		        System.out.println("possible");
		    }
		}

	}
}
