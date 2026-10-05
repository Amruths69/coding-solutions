import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int t=a.nextInt();
		while(t-->0){
		    int n=a.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=a.nextInt();
		    }
		    int g=arr[0];
		    for(int i=0;i<n;i++){
		        if(g>arr[i]){
		            g=arr[i];
		            
		        }
		    }
		    int s=0;
		    for(int i=0;i<n;i++){
		        if(g!=arr[i]){
		            s+=arr[i];
		        }
		        
		    }
		    System.out.println(s);}
		

	}
}
