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
		    int x=a.nextInt();
		    int y=a.nextInt();
		    if(x>y){
		        System.out.println(">");
		    }else if(x<y){
		        System.out.println("<");
		    }else{
		        System.out.println("=");
		    }
		}

	}
}
