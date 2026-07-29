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
		    int c=0;
		    if((long)x*y>=p){
		        System.out.println(0);
		    }else if(x!=0 && y!=0){
		        while(((long)x*y)<p){
		            if((long)((++x)*y)>=p){
		                x--;
		            }else if((long)(x*(++y))>=p){
		                y++;
		            }
		            
		            c++;
		            if(((long)x*y)>=p){
		                System.out.println(c);
		                
		                
		            }
		        }
		    }
		}

	}
}
