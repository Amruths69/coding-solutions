import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ac=new Scanner(System.in);
		int t=ac.nextInt();
		while(t-->0){
		    long n=ac.nextInt();
		    ArrayList<Long>al=new ArrayList<>();
		    Long c=Integer.MAX_VALUE;
		    Long no=Integer.MAX_VALUE;
		    while(n>0){
		        al.add(n%10);
		        no=n/10;
		        c+=n%10;
		        n=n/10;
		    }
		    if(c%10==0){
		        System.out.println("Valid");
		    }else{
		        System.out.println("Invalid");
		    }
		}

	}
}
