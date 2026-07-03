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
		    int k=a.nextInt();
		    int c=0;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=a.nextInt();
		        
		        
		    }
		    for(int j=0;j<n;j++){
		        arr[j]=arr[j]+k;
		        if(arr[j]%7==0){
		            c++;
		        }
		    }
		    System.out.println(c);
		}

	}
}
