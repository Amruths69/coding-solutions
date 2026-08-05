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
	    int x1=a.nextInt();
	    int y1=a.nextInt();
	    int x2=a.nextInt();
	    int y2=a.nextInt();
	    if(x1+y1==x2+y2||x1-y1==x2-y2){
	        System.out.println(1);
	    }
	    else if((x2+y2)%2!=(x1+y1)%2)
	    System.out.println(-1);
	    else
	    System.out.println(2);
	}

	}
}
