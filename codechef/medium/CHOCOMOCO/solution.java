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
		    int n=ac.nextInt();
		    int f=n%4;
		    if(f==0||f==1){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}

	}
}
