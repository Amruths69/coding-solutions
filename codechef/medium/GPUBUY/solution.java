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
		    int z=a.nextInt();
		    int x=a.nextInt();
		    int y=a.nextInt();
		    int c=0;
		    int c1=0;
		    if(x>=y){
		        System.out.println(-1);
		        
		    }else{
		    
		    while(c<z){
		        c+=y;
		        z+=x;
		        c1++;
		        if(c>=z){
		            System.out.println(c1);
		            
		        }}
		    }
		}

	}
}
