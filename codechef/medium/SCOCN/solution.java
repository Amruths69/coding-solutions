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
		int x=a.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==x){
		        c++;
		        if(c==2){
		            System.out.println(i);
		        }
		    }
		}
		if(c==1){
		    System.out.println(-2);
		}else if(c==0){
		    System.out.println(-1);
		}

	}
}
