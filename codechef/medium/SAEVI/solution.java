import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		long k=a.nextLong();
		long g=2*k;
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		    
		}
		long s=0;
		for(int i=0;i<n;i+=2){
		    if(i==0||i%2==0){
		        if(arr[i]>g)
		        s+=arr[i];
		        
		        
		    }
		}
		if(s>0){
		    System.out.println(s);
		}else{
		    System.out.println(0);
		}

	}
}
