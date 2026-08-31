import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int w=a.nextInt();
		int n=a.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		}
		Arrays.sort(arr);
		int s=0;
		int c=0;
		for(int i=arr.length-1;i>=0;i--){
		    for(int j=0;j<2;j++){
		        s+=arr[i];
		        c++;
		        
		        if(s>=w){
		            System.out.println(c);
		            return;
		        }
		    }
		    
		    
		}
		System.out.println(-1);
		

	}
}
