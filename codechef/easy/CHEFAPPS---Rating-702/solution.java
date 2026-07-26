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
		int s=a.nextInt();
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		int g=x+y;
		int h=s-(x+y);
		if(h>z){
		    System.out.println(0);
		}else if(h+x>z){
		    System.out.println(1);
		    
		}else if(h+y>z){
		    System.out.println(1);
		    
		}else{
		    System.out.println(2);
		    
		}}



	}
}
