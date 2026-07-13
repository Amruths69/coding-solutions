import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner a= new Scanner(System.in);
	    int t=a.nextInt();
	    while(t-->0){
	        int n=a.nextInt();
	        int k=a.nextInt();
	        int min=Math.min(n,n-k);
	        int sm=0;
	        int to=0;
	        int[] arr=new int[n];
	        for(int j=0;j<n;j++){
	            arr[j]=a.nextInt(j);
	        }
	        for(int i=0;i<min;i++){
	             sm+=arr[i];
	        }for(int i=0;i<n;i++){
	            to+=arr[i];
	        }
	        System.out.println(to-sm);
	    }

	}
}
