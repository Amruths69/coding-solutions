import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int c=a.nextInt();
		int g=0;
		for(int i=0;i<n;i++){
		    g+=a.nextInt();
		}
        if(g<=0)
        System.out.println("yes");
        else
        System.out.println("no");
	}
}
