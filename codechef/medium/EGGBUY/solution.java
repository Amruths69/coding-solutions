import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner a=new Scanner(System.in);
	    int x=a.nextInt();
	    int y=a.nextInt();
	    int f=a.nextInt();
	    int h=x*12;
	    int g=(y*12)+f;
	    if(h>g){
	        System.out.println(g);
	    }else{
	        System.out.println(h);
	    }

	}
}
