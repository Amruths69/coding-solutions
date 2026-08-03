import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a= new Scanner(System.in);
		int n=a.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		}
		Arrays.sort(arr);
	    int bn=Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
		    int v=arr[i]-arr[i-1];
		    bn=Math.max(bn,v);
		    
		    
		   
		    
		}
		System.out.println(bn);

	}
}
