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
		    if(n%2==1){
		        System.out.println(((n/2)-1)*30+20);
		    }else if(n%2==0){
		        System.out.println((n/2)*30);
		    }
		}

	}
}
