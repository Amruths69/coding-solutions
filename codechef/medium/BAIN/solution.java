import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0;i<4;i++){
		    arr[i]=a.nextInt();
		    
		}
		if(
		    arr[0] == 0 || arr[1] == 0 || arr[2] == 0 || arr[3] == 0 ||

		    arr[0] + arr[1] == 0 ||
		    arr[0] + arr[2] == 0 ||
		    arr[0] + arr[3] == 0 ||
		    arr[1] + arr[2] == 0 ||
		    arr[1] + arr[3] == 0 ||
		    arr[2] + arr[3] == 0 ||

		    arr[0] + arr[1] + arr[2] == 0 ||
		    arr[0] + arr[1] + arr[3] == 0 ||
		    arr[0] + arr[2] + arr[3] == 0 ||
		    arr[1] + arr[2] + arr[3] == 0 ||

		    arr[0] + arr[1] + arr[2] + arr[3] == 0
		){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}

	}
}
