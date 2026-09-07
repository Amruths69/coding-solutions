import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=a.nextInt();
		    
		}
		int m=a.nextInt();
		int g=(int)Math.pow(2,m);
		int[] ans=new int[n];
		for(int i=0;i<n;i++){
		    ans[i]=arr[i]/g;
		    
		}
		System.out.println(Arrays.toString(ans));

	}
}
