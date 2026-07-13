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
		    int l=a.nextInt();
		    int b=a.nextInt();
		    int max=0;
		    int maxxy=0;
		    for(int i=1;i<=Math.min(b,l);i++){
		        if(l%i==0 && b%i==0){
		            maxxy=i;
		        }
		        max=Math.max(max,maxxy);
		        
		    }
		    System.out.println(max);
		}

	}
}
