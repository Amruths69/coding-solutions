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
		    int x=ac.nextInt();
		    int y=ac.nextInt();
		    if((x>0||y>0)&&x==y){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
		

	}
}
