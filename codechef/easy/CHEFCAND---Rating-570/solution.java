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
		    int g=n-x;
		    if(g<=0){
		        System.out.println(0);
		    }else{
		        
		        System.out.println((g+3)/4);
		    }
		}

	}
}
