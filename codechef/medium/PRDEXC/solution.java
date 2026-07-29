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
		    int p=a.nextInt();
		    int c=a.nextInt();
		    if((x*y)>=p){
		        System.out.println(0);
		    }else{
		        while((x*y)<p){
		            x++;
		            c++;
		            if((x*y)>=p){
		                System.out.println(c);
		                
		                
		            }
		        }
		    }
		}

	}
}
