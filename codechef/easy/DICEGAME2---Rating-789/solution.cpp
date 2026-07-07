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
		    int[] arr=new int[3];
		    int[] arr1=new int[3];
		    for(int i=0;i<2;i++){
		        arr[i]=a.nextInt();
		    }for(int j=0;j<2;j++){
		        arr1[j]=a.nextInt();
		    }
		    Arrays.sort(arr);
		    Arrays.sort(arr1);
		    int h=arr[2]+arr[1];
		    int l=arr1[2]+arr1[1];
		    if(h>l){
		        System.out.println("Alice");
		    }else if(h<l){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Tie");
		    }
		    
		}

	}
}