import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int c=a.nextInt();
		if(b*3>=(c+b)){
		    System.out.println(c+b);
		}else{
		    System.out.println(b*3);
		}

	}
}
