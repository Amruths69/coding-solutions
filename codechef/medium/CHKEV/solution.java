import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int y=a.nextInt();
		int c=0;
		for(int i=x;i<=y;i++){
		    if(i%2==0){
		    System.out.println("Yes");
		    break;}
		    else{
		        c++;
		    }
		    
		}
		if(((y-x)+1)==c)
		System.out.println("No");
	}
}
