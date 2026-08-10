import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int i1=0;
		int i2=0;
		int m1=0;
		int m2=0;
		while(n-->0){
		    int s=a.nextInt();
		    int s2=a.nextInt();
		    if(s>s2){
		        i1+=Math.abs(s-s2);
		        m1=Math.max(i1,m1);
		        
		    }
		    else if(s2>s){
		        i2+=Math.abs(s2-s);
		        m2=Math.max(i2,m2);
		    }
		    
		}
		if(m1>m2)
		System.out.println(1+" "+ m1);
		else
		System.out.println(2+" "+m2);

	}
}
